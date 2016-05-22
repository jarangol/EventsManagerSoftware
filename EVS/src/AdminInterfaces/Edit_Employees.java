package AdminInterfaces;
import MainInterfaces.DBAccess;
import Mundo.Admin.EPS;
import Mundo.Admin.Occupation;
import Mundo.Admin.Person;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class Edit_Employees extends javax.swing.JFrame {
    DBAccess dba;

    public Edit_Employees(DBAccess dba) {
        this.dba = dba;
        
        initComponents();
        
        Occupation Occupation = new Occupation();
        ResultSet rsOccupation = dba.consultar(Occupation.getOccupations());
        String[] arrayOccupation = rsToArray(rsOccupation);
        selOccupation = new JComboBox(arrayOccupation);
        
        EPS EPS = new EPS();
        ResultSet rsEPS = dba.consultar(EPS.getEPSs());
        String[] arrayEPSs = rsToArray(rsEPS);
        selEPS = new JComboBox(arrayEPSs);
    }
    
    public String[] rsToArray(ResultSet data){
        ArrayList<String> items = new ArrayList<>(100);    
        try {
        while(data.next()){ items.add(data.getString(1)); }
        } catch(SQLException e){}
        return items.toArray(new String[items.size()]);
    }
    
    public String getDataFromRS(ResultSet data) {
        try{
            if(data.next()){ return data.getString(1); }
        } catch(SQLException e) {}
        return "";
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
        jLabel2 = new javax.swing.JLabel();
        textPersonID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        selOccupation = new javax.swing.JComboBox<>();
        selEPS = new javax.swing.JComboBox<>();
        buttonExit = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Empleados");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Identificación");

        textPersonID.setText("1234555");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("EPS ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ocupación ");

        selOccupation.setEditable(true);
        selOccupation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));

        selEPS.setEditable(true);
        selEPS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SaludCoop", "Sura", "Cafesalud", "Caprecom" }));

        buttonExit.setText("Salir");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        buttonEdit.setText("Modificar");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonSearch.setText("Buscar");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selOccupation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textPersonID)
                                        .addComponent(selEPS, javax.swing.GroupLayout.Alignment.TRAILING, 0, 183, Short.MAX_VALUE)))))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textPersonID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selEPS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        dispose();
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        String PERSON_ID = textPersonID.getSelectedText();
        String OCCUPATION_ID = (String)selOccupation.getSelectedItem();
        String EPS_ID = (String)selEPS.getSelectedItem();
        
        Occupation Occupation = new Occupation();
        OCCUPATION_ID = Occupation.getID(OCCUPATION_ID);
        ResultSet RSOccupation = dba.consultar(OCCUPATION_ID);
        OCCUPATION_ID = getDataFromRS(RSOccupation);
        
        EPS EPS = new EPS();
        EPS_ID = EPS.getID(EPS_ID);
        ResultSet RSEPS = dba.consultar(EPS_ID);
        EPS_ID = getDataFromRS(RSEPS);
        
        Person Person = new Person(PERSON_ID, OCCUPATION_ID, EPS_ID);
        Boolean make = dba.ejecutar(Person.update());
        if (make == true) { System.out.println("Operation make it!"); } else { System.out.println("Operation with errors"); }
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        String PERSON_ID = textPersonID.getSelectedText();
        
        Occupation Occupation = new Occupation();
        ResultSet rsOccupation = dba.consultar(Occupation.getOccupation(PERSON_ID));
        String[] arrayOccupation = rsToArray(rsOccupation);
        selOccupation = new JComboBox(arrayOccupation);
        
        EPS EPS = new EPS();
        ResultSet rsEPS = dba.consultar(EPS.getEPS(PERSON_ID));
        String[] arrayEPSs = rsToArray(rsEPS);
        selEPS = new JComboBox(arrayEPSs);
    }//GEN-LAST:event_buttonSearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> selEPS;
    private javax.swing.JComboBox<String> selOccupation;
    private javax.swing.JTextField textPersonID;
    // End of variables declaration//GEN-END:variables
}
