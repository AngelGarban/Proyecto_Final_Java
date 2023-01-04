/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author angel
 */
public class ControlProduccionDao {
    //Se instancia mi clase conexion.
    Conexion cn = new Conexion();

    Connection con;
    //Se usa un prepared statement para agilizar el proceso de consultas a la base de datos
    PreparedStatement ps;

    //Se usa un result set para el prepared statement de listar clientes
    ResultSet rs;
    
    ControlProduccion resumenProd = new ControlProduccion();
    
    public void ProduccionTotal(){
        
        String sql = "SELECT * FROM produccion";
        int totalModelo40=0;
        int totalModelo60=0;
        int totalModelo90=0;
        
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            //totalModelo= rs.getInt();
            while (rs.next()){
                totalModelo40+=rs.getInt("modelo40");
                totalModelo60+=rs.getInt("modelo60");
                totalModelo90+=rs.getInt("modelo90");                               
                
            }
            resumenProd.setTotalProducido40(totalModelo40);
            resumenProd.setTotalProducido60(totalModelo60);
            resumenProd.setTotalProducido90(totalModelo90);
            
            
                        
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        
    }
    
    
    
}
