package AdminInterfaces;

import MainInterfaces.DBAccess;
import Mundo.Admin.City;
import Mundo.Admin.Place;
import Mundo.Admin.PlaceType;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class Search_Places extends javax.swing.JFrame {
    DBAccess dba;
    
    public Search_Places(DBAccess dba) {
        this.dba = dba;
        initComponents();
        
        City City = new City();
        ResultSet rsCity = dba.consultar(City.getCiudades());
        String[] arrayCity = rsToArray(rsCity);
        selCity = new JComboBox(arrayCity);
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttonEdit = new javax.swing.JButton();
        selCity = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        selPlaceType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        selPlace = new javax.swing.JComboBox<>();
        buttonExit = new javax.swing.JButton();
        buttonNew = new javax.swing.JButton();
        buttonRemove = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textAddress = new javax.swing.JTextField();

        jButton1.setText("Nuevo lugar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Consultar Lugares");

        buttonEdit.setText("Editar");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        selCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogotá" }));
        selCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selCityActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ciudad ");

        selPlaceType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coliseo" }));
        selPlaceType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selPlaceTypeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tipo de lugar");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Lugar");

        selPlace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "El Campín" }));
        selPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selPlaceActionPerformed(evt);
            }
        });

        buttonExit.setText("Salir");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        buttonNew.setText("Nuevo");
        buttonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewActionPerformed(evt);
            }
        });

        buttonRemove.setText("Eliminar");
        buttonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Dirección");

        textAddress.setEditable(false);
        textAddress.setText("Calle XX # YY-ZZ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selPlaceType, 0, 185, Short.MAX_VALUE)
                            .addComponent(selCity, 0, 185, Short.MAX_VALUE)
                            .addComponent(selPlace, 0, 185, Short.MAX_VALUE)
                            .addComponent(textAddress))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(buttonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selCity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selPlaceType, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        String CITY_ID = (String)selCity.getSelectedItem();
        String PTYPE_ID = (String)selPlaceType.getSelectedItem();
        String PLACE_ID = (String)selPlace.getSelectedItem();
        
        City pCity = new City();
        CITY_ID = pCity.getID(CITY_ID);
        ResultSet RSpCity = dba.consultar(CITY_ID);
        CITY_ID = getDataFromRS(RSpCity);
        
        PlaceType pType = new PlaceType();
        PTYPE_ID = pType.getID(PTYPE_ID);
        ResultSet RSpType = dba.consultar(PTYPE_ID);
        PTYPE_ID = getDataFromRS(RSpType);
        
        Place Place = new Place();
        PLACE_ID = Place.getID(CITY_ID, PTYPE_ID, PLACE_ID);
        ResultSet RSplace = dba.consultar(PLACE_ID);
        PLACE_ID = getDataFromRS(RSplace);
        
        new Edit_Place(dba, PLACE_ID, true);
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        dispose();
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewActionPerformed
        new Edit_Place(dba, false);
    }//GEN-LAST:event_buttonNewActionPerformed

    private void buttonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveActionPerformed
        String CITY_ID = (String)selCity.getSelectedItem();
        String PTYPE_ID = (String)selPlaceType.getSelectedItem();
        String PLACE_ID = (String)selPlace.getSelectedItem();
        
        City pCity = new City();
        CITY_ID = pCity.getID(CITY_ID);
        ResultSet RSpCity = dba.consultar(CITY_ID);
        CITY_ID = getDataFromRS(RSpCity);
        
        PlaceType pType = new PlaceType();
        PTYPE_ID = pType.getID(PTYPE_ID);
        ResultSet RSpType = dba.consultar(PTYPE_ID);
        PTYPE_ID = getDataFromRS(RSpType);
        
        Place Place = new Place();
        PLACE_ID = Place.getID(CITY_ID, PTYPE_ID, PLACE_ID);
        ResultSet RSplace = dba.consultar(PLACE_ID);
        PLACE_ID = getDataFromRS(RSplace);
        
        Boolean make = dba.ejecutar(Place.remove(PLACE_ID));
        if (make == true) { System.out.println("Operation make it!"); } else { System.out.println("Operation with errors"); }
    }//GEN-LAST:event_buttonRemoveActionPerformed

    private void selCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selCityActionPerformed
        String CITY_ID = (String)selCity.getSelectedItem();
        
        City pCity = new City();
        CITY_ID = pCity.getID(CITY_ID);
        ResultSet RSpCity = dba.consultar(CITY_ID);
        CITY_ID = getDataFromRS(RSpCity);
        
        PlaceType PlaceType = new PlaceType();
        ResultSet rsPlaceType = dba.consultar(PlaceType.getPlacesTypesOfCity(CITY_ID));
        String[] arrayPlaceType = rsToArray(rsPlaceType);
        selPlaceType = new JComboBox(arrayPlaceType);
    }//GEN-LAST:event_selCityActionPerformed

    private void selPlaceTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selPlaceTypeActionPerformed
        String CITY_ID = (String)selCity.getSelectedItem();
        String PTYPE_ID = (String)selPlaceType.getSelectedItem();
        
        City pCity = new City();
        CITY_ID = pCity.getID(CITY_ID);
        ResultSet RSpCity = dba.consultar(CITY_ID);
        CITY_ID = getDataFromRS(RSpCity);
        
        PlaceType pType = new PlaceType();
        PTYPE_ID = pType.getID(PTYPE_ID);
        ResultSet RSpType = dba.consultar(PTYPE_ID);
        PTYPE_ID = getDataFromRS(RSpType);
        
        Place Place = new Place();
        ResultSet rsPlace = dba.consultar(Place.getPlaces(PTYPE_ID, CITY_ID));
        String[] arrayPlace = rsToArray(rsPlace);
        selPlace = new JComboBox(arrayPlace);
    }//GEN-LAST:event_selPlaceTypeActionPerformed

    private void selPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selPlaceActionPerformed
        String CITY_ID = (String)selCity.getSelectedItem();
        String PTYPE_ID = (String)selPlaceType.getSelectedItem();
        String PLACE_ID = (String)selPlace.getSelectedItem();
        
        City pCity = new City();
        CITY_ID = pCity.getID(CITY_ID);
        ResultSet RSpCity = dba.consultar(CITY_ID);
        CITY_ID = getDataFromRS(RSpCity);
        
        PlaceType pType = new PlaceType();
        PTYPE_ID = pType.getID(PTYPE_ID);
        ResultSet RSpType = dba.consultar(PTYPE_ID);
        PTYPE_ID = getDataFromRS(RSpType);
        
        Place Place = new Place();
        PLACE_ID = Place.getID(CITY_ID, PTYPE_ID, PLACE_ID);
        ResultSet RSplace = dba.consultar(PLACE_ID);
        PLACE_ID = getDataFromRS(RSplace);
        
        String PLACE_ADDRESS = Place.getAddress(PLACE_ID);
        ResultSet RSplaceAddress = dba.consultar(PLACE_ADDRESS);
        PLACE_ADDRESS = getDataFromRS(RSplaceAddress);
        
        textAddress.setText(PLACE_ADDRESS);
        textAddress.setEditable(false);
    }//GEN-LAST:event_selPlaceActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonNew;
    private javax.swing.JButton buttonRemove;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> selCity;
    private javax.swing.JComboBox<String> selPlace;
    private javax.swing.JComboBox<String> selPlaceType;
    private javax.swing.JTextField textAddress;
    // End of variables declaration//GEN-END:variables
}
