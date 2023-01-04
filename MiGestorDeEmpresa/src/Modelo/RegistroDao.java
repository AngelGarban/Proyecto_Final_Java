
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RegistroDao {
    Connection con;
    //Se usa un prepared statement para agilizar el proceso de consultas a la base de datos
    PreparedStatement ps;
    
    //Se instancia mi clase conexion.
    Conexion cn = new  Conexion();
    
    public boolean RegistrarUsuario (registro usuario){
        //Se define la sentencia SQL a ejecutar dentro de la base de datos
        String sql = "INSERT INTO usuario (nombre, correo, password)VALUES (?,?,?)";
        //Se ejecutan las sentencias a traves de un try-catch
        try {
            con = cn.getConnection();
            //Se le indica la sentencia sql a ejecutar dentro del prepared statement
            ps = con.prepareStatement(sql);
            //Se define primer argumentosql);
            ps.setString(1, usuario.getNombre());
            //Se define segundo argumentosql);
            ps.setString(2, usuario.getCorreo());
            //Se define tercer argumentosql);
            ps.setString(3, usuario.getPassword());            
            //Se ejecuta la sentencia SQL
            ps.execute();
            //Se retorna true si la carga del nuevo usuario fue exitosa
            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            //Se retorna false si se produjo algún error
            return false;
            //Se usa un finally para cerrar la conexion con la base de datos
        }finally{
            try {
                //Se cierra la conexion con la base de datos
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }               
        
    }
    
}
