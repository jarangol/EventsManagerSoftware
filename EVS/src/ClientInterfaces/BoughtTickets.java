package ClientInterfaces;

import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import java.util.ArrayList;
import java.sql.*;

import Mundo.Ticket;

import MainInterfaces.DBAccess;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Nicolas
 */
public class BoughtTickets extends javax.swing.JFrame {
    private String id_person,id_event;
    private DBAccess dba;
    private ResultSet rs;
    private String categoria, ciudad, evento, fecha, lugar;
    /**
     * Creates new form BoughtTickets
     */
    public BoughtTickets(DBAccess conexion,String id_p) {
        initComponents();
        this.setVisible(true);
        id_person=id_p;
        dba=conexion;
       
        //traer las categorias disponibles al comboBox
     
        rs=dba.consultar(Ticket.buscarCategorias(id_person));      
        jCBCategoria = new JComboBox(rsToArray(rs));
        
    }
    public BoughtTickets() {
        initComponents();
        this.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : ((javax.persistence.Query)null).getResultList();
        query1 = java.beans.Beans.isDesignTime() ? null : ((javax.persistence.EntityManager)null).createQuery("");
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        jCBCategoria = new javax.swing.JComboBox<>();
        More = new javax.swing.JButton();
        jCBEvento = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jCBFecha = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTBoletas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jCBCiudad = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jCBLugar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Cuidad");

        jLabel3.setText("Nombre del Evento");

        jLabel5.setText("Fecha del Evento");

        Salir.setText("Atrás");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jCBCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCategoriaActionPerformed(evt);
            }
        });

        More.setText("Más Informacion");
        More.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoreActionPerformed(evt);
            }
        });

        jCBEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBEventoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Tickets Comprados");

        jCBFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFechaActionPerformed(evt);
            }
        });

        jTBoletas.setAutoCreateRowSorter(true);
        jTBoletas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tipo de Boleta", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Short.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTBoletas.setRowHeight(18);
        jScrollPane1.setViewportView(jTBoletas);

        jLabel4.setText("Categoria del Evento");

        jCBCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCiudadActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre del Lugar");

        jCBLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBLugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Salir)
                                .addGap(28, 28, 28)
                                .addComponent(More)
                                .addGap(51, 51, 51))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jCBEvento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jCBCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jCBFecha, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jCBCiudad, 0, 217, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jCBLugar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCBLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(More, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
            
            
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
        new ClientMenu(dba,id_person);       
    }//GEN-LAST:event_SalirActionPerformed

    private void jCBCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCategoriaActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        categoria = (String)cb.getSelectedItem();      
        rs=dba.consultar(Ticket.buscarCiudades(categoria,id_person));      
        jCBCiudad = new JComboBox(rsToArray(rs));
    }//GEN-LAST:event_jCBCategoriaActionPerformed

    private void MoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoreActionPerformed
           new EventsMoreInfo(dba,id_person,id_event);
           //cerrar la actual(?)
    }//GEN-LAST:event_MoreActionPerformed

    private void jCBCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCiudadActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        ciudad = (String)cb.getSelectedItem();
        rs=dba.consultar(Ticket.buscarEventos(ciudad,id_person));      
        jCBEvento = new JComboBox(rsToArray(rs));
    }//GEN-LAST:event_jCBCiudadActionPerformed

    private void jCBEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBEventoActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        evento= (String)cb.getSelectedItem();
        rs=dba.consultar(Ticket.buscarFecha(evento,id_person));      
        jCBFecha = new JComboBox(rsToArray(rs));
    }//GEN-LAST:event_jCBEventoActionPerformed

    private void jCBFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFechaActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        fecha= (String)cb.getSelectedItem();
        rs=dba.consultar(Ticket.buscarLugar(fecha,id_person));      
        jCBLugar = new JComboBox(rsToArray(rs));
    }//GEN-LAST:event_jCBFechaActionPerformed

    private void jCBLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBLugarActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        lugar = (String)cb.getSelectedItem();
   
        DefaultTableModel modelo = new DefaultTableModel();
        jCBLugar.setModel((ComboBoxModel<String>) modelo);
        
        try{
            rs=dba.consultar(Ticket.buscarBoletas(lugar,id_person));    
            ResultSetMetaData rsMD = rs.getMetaData();
            int nColumnas = rsMD.getColumnCount();
            
            while (rs.next()){
                 Object [] fila = new Object[nColumnas]; // Hay tres columnas en la tabla

                for (int i=0;i<nColumnas;i++)
                   fila[i] = rs.getObject(i+1); 

                modelo.addRow(fila);
            }
            
            rs=dba.consultar(Ticket.buscarEventId(ciudad,evento,fecha,lugar));
             if (rs.next()){
                id_event=rs.getString(1);
                System.out.println("id_event cambío a: "+id_event);
             }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_jCBLugarActionPerformed

    
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
            java.util.logging.Logger.getLogger(ClientConfiguration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientConfiguration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientConfiguration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientConfiguration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BoughtTickets();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton More;
    private javax.swing.JButton Salir;
    private javax.swing.JComboBox<String> jCBCategoria;
    private javax.swing.JComboBox<String> jCBCiudad;
    private javax.swing.JComboBox<String> jCBEvento;
    private javax.swing.JComboBox<String> jCBFecha;
    private javax.swing.JComboBox<String> jCBLugar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTBoletas;
    private java.util.List list1;
    private javax.persistence.Query query1;
    // End of variables declaration//GEN-END:variables
}
