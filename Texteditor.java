/*
 * sw7.java
 *
 * Created on 15 december, 2016, 9:42:56 PM
 */

package swingexamples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.text.BadLocationException;

/**
 *
 * @author vish
 */
public class sw7 extends javax.swing.JFrame {
     JFileChooser fc=new JFileChooser();
     boolean flag;
     File f;
     FileWriter fw;
    public sw7() {
        initComponents();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jEditorPane1);

        jMenu1.setText("File");

        jMenuItem1.setText("New");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Open");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Save");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem7.setText("Save As");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Exit");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem4.setText("Cut");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Copy");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Paste");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
      if(JFileChooser.APPROVE_OPTION==fc.showOpenDialog(this))
      {
            try {
                f=fc.getSelectedFile();
                jEditorPane1.setPage("file://"+f.getAbsolutePath());
                flag=true;
            } catch (IOException ex) {
                Logger.getLogger(sw7.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
    }                                          

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        jEditorPane1.setText(null);
        flag=false;
    }                                          

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
      int choice=0;
      if(flag==false && (choice=JFileChooser.APPROVE_OPTION)==fc.showSaveDialog(this))
      {
            try {
                f=fc.getSelectedFile();
                fw = new FileWriter(f.getAbsolutePath());
                jEditorPane1.getEditorKit().write(fw, jEditorPane1.getDocument(), 0, jEditorPane1.getText().length());
                fw.close();
            } catch (BadLocationException ex) {
                Logger.getLogger(sw7.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(sw7.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
      else
      {
            if(choice==JFileChooser.CANCEL_OPTION)
            {
            try {
                fw = new FileWriter(f.getAbsolutePath(),true);
                jEditorPane1.getEditorKit().write(fw, jEditorPane1.getDocument(), 0, jEditorPane1.getText().length());
                fw.close();
            } catch (BadLocationException ex) {
                Logger.getLogger(sw7.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(sw7.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
      }
    }                                          

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        jEditorPane1.cut();
    }                                          

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        jEditorPane1.copy();
    }                                          

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        jEditorPane1.paste();
    }                                          

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
         FileWriter fw;
      if(JFileChooser.APPROVE_OPTION==fc.showSaveDialog(this))
      {
            try {
                fw = new FileWriter(fc.getSelectedFile().getAbsolutePath());
                jEditorPane1.getEditorKit().write(fw, jEditorPane1.getDocument(), 0, jEditorPane1.getText().length());
                flag=true;
                fw.close();
            } catch (BadLocationException ex) {
                Logger.getLogger(sw7.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(sw7.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
    }                                          

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        System.exit(0);
        
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sw7().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;


}
