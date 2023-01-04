
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    //Se crea un nuevo objeto de tipo Connection de SQL
    Connection con;
    //Se crea un objeto de tipo prepared statement para agilizar el proceso de consultas a la base de datos
    PreparedStatement ps;
    //Se crea un objeto de tipo result set para el retorno del prepared statement
    ResultSet rs;
    //Se instancia un objeto de mi clase conexion
    Conexion cn = new  Conexion();
    
    public login log(String correo, String password){
        //Se instancia un objeto de la clase login
        login l = new login();
        //Se define la sentencia SQL a ejecutar dentro de la base de datos
        String sql = "SELECT * FROM usuario WHERE correo =? AND password = ?";
        //Se ejecutan las sentencias a traves de un try-catch
        try{
            //Se define el objeto con a través del método get Connection de mi clase Conexion
            con = cn.getConnection();
            //Se le indica la sentencia sql a ejecutar dentro del prepared statement
            ps = con.prepareStatement(sql);
            //Se define el primer argumento
            ps.setString(1,correo);
            //Se define el segundo argumento
            ps.setString(2,password);
            //Se obtiene el result set de ejecutar el Query
            rs = ps.executeQuery();
            //Se recorre la tabla usuario con el método next()
            if (rs.next()){
                //Al objeto login (l) se le asigna el id de la fila recorrida
                l.setId(rs.getInt("id"));
                //Al objeto login (l) se le asigna el nombre de la fila recorrida
                l.setNombre(rs.getString("nombre"));
                //Al objeto login (l) se le asigna el correo de la fila recorrida
                l.setCorreo(rs.getString("correo"));
                //Al objeto login (l) se le asigna el password de la fila recorrida
                l.setPass(rs.getString("password"));
            }
            
        }catch (SQLException e){
            System.out.println(e.toString());
        }
        //Se returna el objeto login (l)
        return l;
    }
    
}
