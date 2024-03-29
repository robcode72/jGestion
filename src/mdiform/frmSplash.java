/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mdiform;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import static mdiform.NewJFrame.password;
import static mdiform.NewJFrame.username;

/**
 *
 * @author Usuario
 */
public class frmSplash extends javax.swing.JFrame {

    /**
     * Creates new form Splashscr
     */
    public frmSplash() {
        initComponents();
        setLocationRelativeTo(null); // central el formulario
        ProgressBar.setStringPainted(true);
        lblProgressbar.setText("Cargando sistema espera porfavor...");
        ProgressBar.setValue(100);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblimagen = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();
        lblProgressbar = new javax.swing.JLabel();

        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblimagen.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mdiform/Icons/logo.PNG"))); // NOI18N
        lblimagen.setText("Gestión simple");

        lblProgressbar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProgressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblimagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProgressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_formComponentShown

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            try {
            
            for (int i=0;i<=100;i++){
                Thread.sleep(30);
                ProgressBar.setValue(i);
                lblProgressbar.setText("Cargando sistema espera porfavor..." + Integer.toString(i));
                
                if (i == 100){
                    
                    NewJFrame frmaMain = new NewJFrame();
                    frmaMain.setVisible(true);
                    dispose();
                }
                
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }    
    
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
       try {

            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); //( "");
            }
            catch (ClassNotFoundException ex) {
           
            }catch (InstantiationException ex) {
           
            } catch (IllegalAccessException ex) {
            
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            
            } 
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             new frmSplash().setVisible(true);  
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel lblProgressbar;
    private javax.swing.JLabel lblimagen;
    // End of variables declaration//GEN-END:variables
}
