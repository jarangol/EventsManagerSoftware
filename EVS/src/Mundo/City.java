/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

/**
 *
 * @author Nicolas
 */
public class City {
    
    public String getID(String CITY_NAME) {
        String sql = "SELECT CITY_ID FROM CITY C WHERE C.CITY_NAME = " + CITY_NAME;
        return sql;
    }
    
    public String getType(String CITY_ID){
        String sql = "SELECT CITY_NAME FROM CITY C WHERE C.CITY_ID = " + CITY_ID;
        return sql;
    }
    
    public static String getCiudades() {
        String sql = "SELECT CITY_NAME FROM CITY";
        return sql;
    }
    
}
