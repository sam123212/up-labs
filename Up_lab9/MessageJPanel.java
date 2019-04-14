package bsu.fpmi.educational_practice2019;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theme
 */

enum ButtonValues {
    button, button1, button2
}

enum LabelValues {
    label, label1, label2
}

public class MessageJPanel extends javax.swing.JPanel {
  
    /**
     * Creates new form MessageJPanel
     */
    public MessageJPanel() 
    {
        this.setFocusable(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okJButton = new javax.swing.JButton();
        textJLabel = new javax.swing.JLabel();

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        okJButton.setText("OK");
        okJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okJButtonActionPerformed(evt);
            }
        });

        textJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textJLabel.setText("������� ������ ��� ������� ������");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(okJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(textJLabel)
                .addGap(36, 36, 36)
                .addComponent(okJButton)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void okJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okJButtonActionPerformed
        okJButton.setFocusable(false);
        JOptionPane.showMessageDialog(okJButton, "������ ������");
    }//GEN-LAST:event_okJButtonActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
         if (Character.isLetterOrDigit(evt.getKeyChar()))
        JOptionPane.showMessageDialog(okJButton, "������ ������ "+evt.getKeyChar());
    }//GEN-LAST:event_formKeyPressed

    ButtonValues buttonValues;

    public ButtonValues getButton() {
        return buttonValues;
    }

    public void setButton(ButtonValues buttonValues) {
        this.buttonValues = buttonValues;
        
        switch (this.buttonValues) {
            case button:
                okJButton.setText("�����");
                break;
            case button1:
                okJButton.setText("��");
                break;
            case button2:
                okJButton.setText("OK");
                break;
        }
    }
    
    LabelValues labelValues;
    
    public LabelValues getLabel() {
        return labelValues;
    }
    
    public void setLabel(LabelValues labelValues) {
        this.labelValues = labelValues;
        
        switch (this.labelValues) {
            case label:
                textJLabel.setText("�����");
                break;
            case label1:
                textJLabel.setText("��� �����");
                break;
            case label2:
                textJLabel.setText("Text");
                break;
        }
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton okJButton;
    private javax.swing.JLabel textJLabel;
    // End of variables declaration//GEN-END:variables
}
