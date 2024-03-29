/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package mdiform;

import java.awt.Toolkit;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Usuario
 */
public class frmFormasPago extends javax.swing.JInternalFrame {
    Connection conn = null;

    public String[]  columnNames = {"Código", "Descripción"};
    public String[]  RowValores = new String[2];
    public String  SQL_EJERCICIO = "SELECT IDFORMPAGO, NOMPAGO FROM FORMASPAGO order by IDFORMPAGO ASC";
    public Integer[] columnNamesWidth = {150, 100};
    public String NomPago;
    public Integer CodPago;

    /**
     * Creates new form frmFormasPago
     */
    public frmFormasPago() {
        initComponents();
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width)/2 - getWidth()/2, (Toolkit.getDefaultToolkit().getScreenSize().height)/2 - getHeight()/2);
        OpenDB(SQL_EJERCICIO);

    }
        public void OpenDB(String query) {
        
        
        try {
            //step1 load the driver class  
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //removeAllRows(jTable1);
            //conn con = new conn("xsesion", "xsesion", "ORACLE")
            try (
                    //Connection con = DriverManager.getConnection(dbURL, username, password);
                    Connection conn = DriverManager.getConnection(
                            NewJFrame.dbURL, NewJFrame.username, NewJFrame.password)) {

                Statement stmt = conn.createStatement();
                String sql = query;

                ResultSet rs;
                rs = stmt.executeQuery(sql);

                //ResultSetMetaData rsmd;
                //rsmd = rs.getMetaData();
                Rellenar_Tabla(rs);

                rs.close();
                conn.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error de conexion " + e);
        }

    }
    public void Rellenar_Tabla(ResultSet rs) throws SQLException {

        ((DefaultTableModel)jTable1.getModel()).setNumRows(0); // delet all table row

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setColumnIdentifiers(columnNames);
        
        TableColumnModel columnModel = jTable1.getColumnModel();
        columnModel.getColumn(0).setHeaderValue(columnNames[0]);
        columnModel.getColumn(0).setPreferredWidth(columnNamesWidth[0]);
        columnModel.getColumn(1).setHeaderValue(columnNames[1]);
        columnModel.getColumn(1).setPreferredWidth(columnNamesWidth[1]);
        
        
        while (rs.next()) {
            String row[] = { rs.getString(1), rs.getString(2)};
            
            if (!rs.wasNull()){
                model.addRow(row);
            }
            
            
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bttnEliminar = new javax.swing.JButton();
        bttnSelect = new javax.swing.JButton();
        bttnNuevo = new javax.swing.JButton();

        setClosable(true);
        setTitle("Formas de pago");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Formas Pago");

        jTable1.setAutoCreateRowSorter(true);
        jScrollPane1.setViewportView(jTable1);

        bttnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mdiform/Icons/Delete_16px.png"))); // NOI18N
        bttnEliminar.setText("Eliminar");
        bttnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEliminarActionPerformed(evt);
            }
        });

        bttnSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mdiform/Icons/Edit File_16px.png"))); // NOI18N
        bttnSelect.setText("Editar");
        bttnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnSelectActionPerformed(evt);
            }
        });

        bttnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mdiform/Icons/New Copy_16px.png"))); // NOI18N
        bttnNuevo.setText("Nuevo");
        bttnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bttnSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bttnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bttnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnEliminarActionPerformed
        // Elimianr IVA
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        String s = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();

        int input = JOptionPane.showConfirmDialog(null, "¿Estas seguro que deseas eliminar el registro " + s);
        Integer i =  Integer.valueOf(s);   
        if (input == 0) {
            Eliminar_FPago(i);
            OpenDB(SQL_EJERCICIO);
        }

    }//GEN-LAST:event_bttnEliminarActionPerformed
    private void Eliminar_FPago(Integer CodFPago) {
       // Muestra la información del cliente para poder editarlo
        try {
            // Send Query
            String Quotes = "\"";

            Connection connection = null;
            Statement stmt = null;
            CallableStatement cs = null;
            ResultSet rs = null;

            String SQL = "{call XGESTION_PKG.ELIMINAR_FPAGO(?)}";

            connection = DriverManager.getConnection(NewJFrame.dbURL, NewJFrame.username, NewJFrame.password);
            stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            try {
                cs = connection.prepareCall(SQL);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }

            cs.setInt(1, CodFPago);
            cs.execute();

            cs.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage().toString());
        }

    }

    private void bttnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnSelectActionPerformed
        // Editar Formas de pago
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

        String CodFPago =  tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String NomFPago = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
        
        frmNuevoEditar_FPago frmNewFPago = new frmNuevoEditar_FPago(null, rootPaneCheckingEnabled);
        
        frmNewFPago.NomFPago = NomFPago;
        //CONSULTAR_IVAS(NomIVA);
        frmNewFPago.CodFPago = Integer.valueOf(CodFPago);
        frmNewFPago.Estado = 0; // Modo Editar

        frmNewFPago.setVisible(true);
        frmNewFPago.isModal();
        OpenDB(SQL_EJERCICIO);

    }//GEN-LAST:event_bttnSelectActionPerformed

    private void bttnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnNuevoActionPerformed
        frmNuevoEditar_FPago frmNewFPago = new frmNuevoEditar_FPago(null, rootPaneCheckingEnabled);
        frmNewFPago.Estado = 1; // Modo Insertar
        frmNewFPago.setVisible(true);
        frmNewFPago.isModal();
        OpenDB(SQL_EJERCICIO);
    }//GEN-LAST:event_bttnNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnEliminar;
    private javax.swing.JButton bttnNuevo;
    private javax.swing.JButton bttnSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
