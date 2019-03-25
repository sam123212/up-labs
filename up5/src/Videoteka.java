/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lllllllll7_1;

/**
 *
 * @author SAM
 */
import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.TableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.util.*;

public class Videoteka extends JFrame {

    public static FilmNode addResult = null;
    public static String path = null;
    JTable infoPanel = new JTable();
    JTree notebooksTree = new JTree();
    myTableModel tableModel = null;
    myTreeModel treeModel = null;

    public Videoteka() throws HeadlessException {
        JButton addButton = new JButton("Добавить фильм в видеотеку");
        addButton.addActionListener(e -> SwingUtilities.invokeLater(() -> openAddDialog()));

        JButton removeButton = new JButton("Удалить фильм из видеотеки");
        removeButton.addActionListener(e -> removeItem());

        tableModel = new myTableModel();
        infoPanel = new JTable(tableModel);
        treeModel = new myTreeModel(new treeNode("Каталог"));
        notebooksTree = new JTree(treeModel);
        notebooksTree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                treeNode node = (treeNode) notebooksTree.getLastSelectedPathComponent();
                if (node == null) {
                    return;
                }
                ArrayList<FilmNode> array = node.getAllNodes();
                tableModel = new myTableModel(array);
                infoPanel.setModel(tableModel);
            }
        });
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, true, new JScrollPane(notebooksTree), new JScrollPane(infoPanel));
        splitPane.setDividerLocation(300);


        getContentPane().add(splitPane);
        getContentPane().add("North", addButton);
        getContentPane().add("South", removeButton);
        setBounds(150, 150, 600, 550);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Videoteka mainClass = new Videoteka();
        mainClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainClass.setVisible(true);
    }

    public void openAddDialog() {
        AddFilm addForm = new AddFilm(this);
        addForm.setVisible(true);
    }

    public void addNewItem() {
        treeNode temp, where, insert, root = treeModel.getRoot();

        try {
            insert = new treeNode(addResult.number, addResult);
            if ((where = findNode(root, addResult.color)) != null) {
                treeModel.insertNodeInto(insert, where, where.getChildCount(), false);
            } else if (findNode(root, addResult.species) != null) {
                treeModel.insertNodeInto(new treeNode(addResult.color), (temp = findNode(root, addResult.species)), temp.getChildCount(), false);
                where = findNode(root, addResult.color);
                treeModel.insertNodeInto(insert, where, where.getChildCount(), false);
            } else if (findNode(root, addResult.type) != null) {
                treeModel.insertNodeInto(new treeNode(addResult.species), (temp = findNode(root, addResult.type)), temp.getChildCount(), false);
                treeModel.insertNodeInto(new treeNode(addResult.color), (temp = findNode(root, addResult.species)), temp.getChildCount(), false);
                where = findNode(root, addResult.color);
                treeModel.insertNodeInto(insert, where, where.getChildCount(), false);
            } else {
                treeModel.insertNodeInto(new treeNode(addResult.type), root, root.getChildCount(), false);
                treeModel.insertNodeInto(new treeNode(addResult.species), (temp = findNode(root, addResult.type)), temp.getChildCount(), false);
                treeModel.insertNodeInto(new treeNode(addResult.color), (temp = findNode(root, addResult.species)), temp.getChildCount(), false);
                where = findNode(root, addResult.color);
                treeModel.insertNodeInto(insert, where, where.getChildCount(), false);
            }
        } catch (Exception e) {
            path = null;
            addResult = null;
            return;
        }

        path = null;
        addResult = null;
    }

    public void removeItem() {
        TreePath currentSelection = notebooksTree.getSelectionPath();
        if (currentSelection != null) {
            treeNode currentNode = (treeNode) (currentSelection.getLastPathComponent());
            treeNode parent = (treeNode) (currentNode.getParent());
            if (parent != null) {
                treeModel.removeNodeFromParent(currentNode);
                parent.deleteNode(currentNode);
                ArrayList<FilmNode> array = parent.getAllNodes();
                tableModel = new myTableModel(array);
                infoPanel.setModel(tableModel);
            }
        }
    }

    public treeNode findNode(treeNode root, String s) {
        Enumeration<treeNode> e = root.depthFirstEnumeration();
        while (e.hasMoreElements()) {
            treeNode node = e.nextElement();
            if (node.toString().equalsIgnoreCase(s)) {
                return node;
            }
        }
        return null;
    }
}

class myTreeModel extends DefaultTreeModel {

    private treeNode root;

    public myTreeModel(treeNode r) {
        super(r);
        root = r;
    }

    @Override
    public treeNode getRoot() {
        return root;
    }

    public void insertNodeInto(treeNode child, treeNode parent, int i, boolean flag) {
        this.insertNodeInto(child, parent, i);
        parent.addNode(child);
    }
}

class myTableModel implements TableModel {

    static final String[] columnNames = new String[]{"Название", "Год", "Жанр", "Режиссёр"};
    static final Class[] columnTypes = new Class[]{String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class};
    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();
    private ArrayList<FilmNode> infoNodes;

    public myTableModel() {
        infoNodes = new ArrayList<FilmNode>();
    }

    public myTableModel(ArrayList<FilmNode> al) {
        this.infoNodes = al;
    }

    public void setInfoArray(ArrayList<FilmNode> al) {
        infoNodes = al;
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return infoNodes.size();
    }

    public Class getColumnClass(int columnIndex) {
        return columnTypes[columnIndex];
    }

    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        FilmNode nb = infoNodes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return nb.getNumber();
            case 1:
                return nb.getType();
            case 2:
                return nb.getSpecies();
            case 3:
                return nb.getColor();
        }
        return "";
    }

    @Override
    public void addTableModelListener(TableModelListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeTableModelListener(TableModelListener listener) {
        listeners.remove(listener);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
    }
}

class treeNode extends DefaultMutableTreeNode {
    String name;
    FilmNode ifNode = null;
    ArrayList<treeNode> nodes;
    boolean isThisTheEnd = false;

    public treeNode() {
        name = "-";
        nodes = new ArrayList<treeNode>();
        ifNode = null;
        isThisTheEnd = false;
    }

    public treeNode(String str) {
        name = str;
        nodes = new ArrayList<treeNode>();
        ifNode = null;
        isThisTheEnd = false;
    }

    public treeNode(String str, FilmNode nbNode) {
        name = str;
        nodes = new ArrayList<treeNode>();
        ifNode = nbNode;
        isThisTheEnd = true;
    }

    public ArrayList<FilmNode> getAllNodes() {
        ArrayList<FilmNode> ret = new ArrayList<FilmNode>();
        Deque<treeNode> deque = new ArrayDeque<treeNode>();

        treeNode temp;
        deque.push(this);
        while (!deque.isEmpty()) {
            temp = deque.removeFirst();
            if (temp.isThisTheEnd) {
                ret.add(temp.getIfNode());
            } else {
                for (int i = 0; i < temp.nodes.size(); i++) {
                    deque.push(temp.nodes.get(i));
                }
            }
        }
        return ret;
    }

    public void addNode(treeNode tn) {
        nodes.add(tn);
    }

    public void deleteNode(treeNode tn) {
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).toString().compareToIgnoreCase(tn.toString()) == 0) {
                nodes.remove(i);
            }
        }
    }

    public FilmNode getIfNode() {
        return ifNode;
    }

    public ArrayList<treeNode> getNodes() {
        return nodes;
    }

    public String toString() {
        return name;
    }
}

class FilmNode {
    String number, type, species, color;


    FilmNode() {
    }

    FilmNode(String name, String species, String color, String number) {
        this.type = name;
        this.species = species;
        this.color = color;
        this.number = number;
    }


    public String getNumber() { return number; }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getSpecies() {
        return species;
    }
}
