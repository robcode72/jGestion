/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package mdiform;

import java.awt.FileDialog;
import java.awt.Image;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;
import javax.swing.JFileChooser;
import java.io.File;      
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Usuario
 */
public class frmEmpresa extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmEmpresa
     */
    public frmEmpresa() {
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

        bttnAceptar = new javax.swing.JButton();
        bttnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        edtEmpresa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        edtNIF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edtDir = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        edtCP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        edtProvi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edtMuni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        edtTlf1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        edtTlf2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        edtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        edtWeb = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        imgLogo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Empresa");
        setName("frameEmpre"); // NOI18N
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        bttnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mdiform/Icons/Checkmark_16px.png"))); // NOI18N
        bttnAceptar.setText("Aceptar");
        bttnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAceptarActionPerformed(evt);
            }
        });

        bttnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mdiform/Icons/Cancel_16px.png"))); // NOI18N
        bttnCancelar.setText("Cancelar");
        bttnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCancelarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Empresa"));

        jLabel12.setText("Empresa");

        jLabel2.setText("CIF/NIF");

        jLabel3.setText("Dirección");

        jLabel4.setText("Municipio");

        edtCP.setToolTipText("");
        edtCP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtCPKeyTyped(evt);
            }
        });

        jLabel5.setText("Provincia");

        jLabel6.setText("Código Postal");

        jLabel7.setText("Teléfono 1");

        edtTlf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtTlf1KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtTlf1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtTlf1KeyReleased(evt);
            }
        });

        jLabel8.setText("Teléfono 2");

        edtTlf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtTlf2KeyTyped(evt);
            }
        });

        jLabel9.setText("Email");

        jLabel10.setText("Web");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Logo"));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgLogoMouseClicked(evt);
            }
        });

        imgLogo.setIcon(new javax.swing.ImageIcon("E:\\Documentos\\NetBeansProjects\\MDIForm\\src\\mdiform\\Icons\\logo.PNG")); // NOI18N
        imgLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgLogoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(imgLogo)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtWeb)
                    .addComponent(edtDir)
                    .addComponent(edtEmpresa)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtMuni, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(edtTlf1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(edtTlf2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(116, 116, 116)
                                    .addComponent(jLabel5)
                                    .addGap(24, 24, 24)
                                    .addComponent(edtProvi))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(edtCP, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtNIF, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(edtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(edtNIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(edtDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(edtProvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(edtMuni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(edtCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtTlf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(edtTlf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(254, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(bttnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void Actualizar_Empresa (int codigo) throws SQLException{

            Connection connection = null;
            Statement stmt = null;
            CallableStatement cs = null;
            ResultSet rs = null;

            String SQL = "{call XGESTION_PKG.ACTUALIZAR_EMPRE(?,?,?,?,?,?,?,?)}";

            connection = DriverManager.getConnection(NewJFrame.dbURL, NewJFrame.username, NewJFrame.password);
            stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            try {
                cs = connection.prepareCall(SQL);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }

            cs.setInt(1, codigo);
            cs.setString(2, edtEmpresa.getText());
            cs.setString(3, edtNIF.getText());
            cs.setString(4, edtDir.getText());
            cs.setString(5, edtMuni.getText());
            cs.setString(6, edtProvi.getText());
            cs.setString(7, edtCP.getText());
            //cs.setString(7, edtTlf1.getText());
            cs.setString(8, edtEmail.getText());

            //Object item =  cbFormaPago.getSelectedItem();
            //String CodFPago = ((ComboItems)item).getKey();
            
            //cs.setInt(11, 0);
            //cs.setInt(11, Integer.parseInt(CodFPago));

            //cs.setString(12, txtNotas.getText());
            
            cs.execute();
            JOptionPane.showMessageDialog(this, "El registro a sido actualizado");
            
    }
    private void bttnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAceptarActionPerformed

        try{
            Actualizar_Empresa(1);
        } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, ex);
               }
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_bttnAceptarActionPerformed

    private void bttnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCancelarActionPerformed
        this.setVisible(isIcon);
        dispose();
    }//GEN-LAST:event_bttnCancelarActionPerformed

    private void edtTlf1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtTlf1KeyReleased
   
    }//GEN-LAST:event_edtTlf1KeyReleased

    private void edtTlf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtTlf1KeyPressed
         
    
    }//GEN-LAST:event_edtTlf1KeyPressed

    private void edtTlf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtTlf1KeyTyped
        
        char c = evt.getKeyChar();
        
        if (!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_edtTlf1KeyTyped

    private void edtTlf2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtTlf2KeyTyped
        
        char c = evt.getKeyChar();
        
        if (!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_edtTlf2KeyTyped

    private void edtCPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCPKeyTyped
        
        char c = evt.getKeyChar();
        
        if (!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_edtCPKeyTyped

     private void Open_Empresa(String query) {
       try {
            //step1 load the driver class  
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //removeAllRows(jTable1);
            //conn con = new conn("xsesion", "xsesion", "ORACLE")
            try (
                    //step2 create  the connection object
                    //Connection con = DriverManager.getConnection(dbURL, username, password);
                    Connection conn = DriverManager.getConnection(
                            NewJFrame.dbURL, NewJFrame.username, NewJFrame.password)) {

                //step3 create the statement object
                Statement stmt = conn.createStatement();
                String sql = query;

                ResultSet rs;
                rs = stmt.executeQuery(sql);

                ResultSetMetaData rsmd;
                rsmd = rs.getMetaData();

                Mostrar_Datos(rs);

                rs.close();
                conn.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error de conexion " + e);
        }

    }

public void Mostrar_Datos(ResultSet rs) throws SQLException {

        while (rs.next()) {
            String row[] = {rs.getString(1), rs.getString(2),
                rs.getString(3), rs.getString(4), rs.getString(5), 
            rs.getString(6),rs.getString(7), rs.getString(8),
            rs.getString(9), rs.getString(10), rs.getString(11),
            rs.getString(12),rs.getString(13),rs.getString(14),
            rs.getString(15),rs.getString(16),rs.getString(17),
            rs.getString(54), rs.getString(55), rs.getString(56)};
            edtEmpresa.setText(row[1]);
            edtNIF.setText(row[2]);
            edtDir.setText(row[3]);
            edtTlf1.setText(row[4]);
            edtEmail.setText(row[5]);
            edtMuni.setText(row[54]);
        }
    }
     
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
            edtEmpresa.setFocusable(true);
            Open_Empresa("SELECT * FROM EMPRESA");
    }//GEN-LAST:event_formComponentShown

    private void imgLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLogoMouseClicked
    
      JFileChooser fileChooser = new JFileChooser();
      FileFilter filter = new FileNameExtensionFilter("PNG File","png");
      
      fileChooser.setFileFilter(filter);
      fileChooser.setCurrentDirectory(new File(System.getProperty("user.home") + File.separator +"Desktop"));
      int result = fileChooser.showOpenDialog(this);
      if (result == JFileChooser.APPROVE_OPTION) {
        // user selects a file
        File selectedFile = fileChooser.getSelectedFile();
        System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        //ImageIcon ico = new ImageIcon(selectedFile.getAbsolutePath());
        ImageIcon ico = new ImageIcon(new ImageIcon("icon.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
        imgLogo.setIcon(ico);
    
        }
     

    }//GEN-LAST:event_imgLogoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnAceptar;
    private javax.swing.JButton bttnCancelar;
    private javax.swing.JTextField edtCP;
    private javax.swing.JTextField edtDir;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JTextField edtEmpresa;
    private javax.swing.JTextField edtMuni;
    private javax.swing.JTextField edtNIF;
    private javax.swing.JTextField edtProvi;
    private javax.swing.JTextField edtTlf1;
    private javax.swing.JTextField edtTlf2;
    private javax.swing.JTextField edtWeb;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}