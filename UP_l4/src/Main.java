


import javax.swing.*;

import java.awt.*;

import java.io.*;
import java.util.logging.Logger;

public class Main extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private Main() 
	{
        initComponents();
        this.setTitle("Four-petal rose");
        this.setSize(600, 600);
    }



    private void initComponents() 
    {
        jPanel1 = new JPanel() 
        {     
			private static final long serialVersionUID = 1L;

			@Override
            public void paintComponent(Graphics g) 
			{
                Graphics2D g1 = (Graphics2D) g;
                g1.setColor(Color.WHITE);
                g1.fillRect(0, 0, this.getWidth(), this.getHeight());
                g1.setColor(Color.BLACK);
                g1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);              
                g1.translate(getWidth()/2, getHeight()/2);               
            	g1.drawLine(-getWidth()/2, 0, getWidth()/2, 0);
                g1.drawLine(0, getHeight()/2, 0, -getHeight()/2);
                g1.setStroke(new Str(2f));
                g1.draw(new Graph(200));
                g1.drawString("Four-petal rose", getX() + getWidth() / 2 - 30, getY() + getHeight() - 50);
            }
        }
        ;
        jMenuBar1 = new JMenuBar();
        jMenu2 = new JMenu();
        jMenuItem1 = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(255, 255, 255));

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu2.setText("Commands");

        jMenuItem1.setText("Print");
        jMenuItem1.addActionListener(this::jMenuItem1ActionPerformed);
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE,
                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE,
                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	printDemoPage();
    }
    
    public void printDemoPage() 
    {      
        HardcopyWriter hw;
        try
        {
            hw = new HardcopyWriter("Four-petal rose", 14, .75, .75, .75, .75);
        } catch (HardcopyWriter.PrintCanceledException e)
        {
            return;
        }
        PrintWriter out = new PrintWriter(hw);

        // Figure out the size of the page
        int rows = hw.getLinesPerPage(), cols = hw.getCharactersPerLine();

        // Mark upper left and upper-right corners
        out.print("+"); // upper-left corner
        for (int i = 0; i < cols - 2; i++)
            out.print(" "); // space over
        out.print("+"); // upper-right corner

        // Display a title
        hw.setFontStyle(Font.BOLD + Font.ITALIC);
        out.println("public int currentSegment (double[] coords)");
        out.println("{");
        out.println("  coords[0] = 2*a * pow(cos(toRadians(ang)),2) * sin(toRadians(ang));");
        out.println("  coords[1] =2*a * pow(sin(toRadians(ang)),2) * cos(toRadians(ang));");
        out.println("  if (ang > 360)");
        out.println("      done = true;");
        out.println("  if (transform != null)");
        out.println("      transform.transform(coords, 0, coords, 0, 1);");
        out.println("  if (ang < 1e-5)");
        out.println("      return SEG_MOVETO;");
        out.println("  return SEG_LINETO;");
        out.println("}");

        // Skip down to the bottom of the page
        for (int i = 0; i < rows - 30; i++)
            out.println();

        // And mark the lower left and lower right
        out.print("+"); // lower-left
        for (int i = 0; i < cols - 2; i++)
            out.print(" "); // space-over
        out.print("+"); // lower-right

        // Close the output stream, forcing the page to be printed
        out.close();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException |
                InstantiationException |
                UnsupportedLookAndFeelException |
                IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        EventQueue.invokeLater(() -> new Main().setVisible(true));
    }
    private JMenu jMenu2;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JPanel jPanel1;
}




