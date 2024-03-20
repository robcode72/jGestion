/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package mdiform;

import java.awt.Toolkit;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import static mdiform.frmClientes.removeAllRows;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Usuario
 */
public class Ejercicios extends javax.swing.JDialog {

    /**
     * Creates new form Ejercicios2
     */
    /**
     * Creates new form frmEjercicios
     */
    // Global Variables
    Connection conn = null;
    
    public String[]  columnNames = {"Ejercicios"};
    public String[]  RowValores = new String[1];
    public String  SQL_EJERCICIO = "SELECT ejercicio FROM ejercicios order by ejercicio desc";
    public Integer[] columnNamesWidth = {150};
    
   public Ejercicios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        //removeAllRows(jTable1);
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setColumnIdentifiers(columnNames);
        
        TableColumnModel columnModel = jTable1.getColumnModel();
        columnModel.getColumn(0).setHeaderValue(columnNames[0]);
        columnModel.getColumn(0).setPreferredWidth(columnNamesWidth[0]);
        
        while (rs.next()) {
            String row[] = {rs.getString(1)};
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
        bttnSelect = new javax.swing.JButton();
        bttnNuevo = new javax.swing.JButton();
        bttnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Ejercicios");

        bttnSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mdiform/Icons/Checkmark_16px.png"))); // NOI18N
        bttnSelect.setText("Seleccionar");
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

        bttnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mdiform/Icons/Delete_16px.png"))); // NOI18N
        bttnEliminar.setText("Eliminar");
        bttnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEliminarActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bttnSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bttnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bttnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnSelectActionPerformed
        // Seleccionar año de Ejercicio

        if (!jTable1.getSelectionModel().isSelectionEmpty()){

            int row = jTable1.getSelectedRow();

            String eje = (jTable1.getModel().getValueAt(row, 0).toString());
            NewJFrame.Ejercicio = Integer.valueOf(eje);
            // Falta Cambiar Titulo del la ventana principal con año seleccionado

        }
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_bttnSelectActionPerformed

    private void bttnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnEliminarActionPerformed
        // Elimianr año de ejercicio
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        String s = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
        
         int input = JOptionPane.showConfirmDialog(null, "¿Estas seguro que deseas eliminar el registro " + s);
         
         if (input == 0) {
            Eliminar_Ejercicio(Integer.valueOf(s));
            OpenDB(SQL_EJERCICIO);
         }
    }//GEN-LAST:event_bttnEliminarActionPerformed

    private void bttnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnNuevoActionPerformed
        String s = JOptionPane.showInputDialog(this, "Introdusca el año");
        if (!s.isEmpty()){
            if (s.length() < 4){
                JOptionPane.showMessageDialog(null,"El año no es valido.");
            }else{
                Nuevo_Ejercicio(Integer.valueOf(s));
                OpenDB(SQL_EJERCICIO);
            }
        }
        
    }//GEN-LAST:event_bttnNuevoActionPerformed
    private void Nuevo_Ejercicio(Integer year) {
       // Muestra la información del cliente para poder editarlo
        try {
            // Send Query
            String Quotes = "\"";

            Connection connection = null;
            Statement stmt = null;
            CallableStatement cs = null;
            ResultSet rs = null;

            String SQL = "{call XGESTION_PKG.INSERTAR_EJE(?)}";

            connection = DriverManager.getConnection(NewJFrame.dbURL, NewJFrame.username, NewJFrame.password);
            stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            try {
                cs = connection.prepareCall(SQL);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }

            cs.setInt(1, year);
            cs.execute();

            cs.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage().toString());
        }

    }

    private void Eliminar_Ejercicio(Integer year) {
       // Muestra la información del cliente para poder editarlo
        try {
            // Send Query
            String Quotes = "\"";

            Connection connection = null;
            Statement stmt = null;
            CallableStatement cs = null;
            ResultSet rs = null;

            String SQL = "{call XGESTION_PKG.ELIMINAR_EJE(?)}";

            connection = DriverManager.getConnection(NewJFrame.dbURL, NewJFrame.username, NewJFrame.password);
            stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            try {
                cs = connection.prepareCall(SQL);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }

            cs.setInt(1, year);
            cs.execute();

            cs.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage().toString());
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ejercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ejercicios dialog = new Ejercicios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnEliminar;
    private javax.swing.JButton bttnNuevo;
    private javax.swing.JButton bttnSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}