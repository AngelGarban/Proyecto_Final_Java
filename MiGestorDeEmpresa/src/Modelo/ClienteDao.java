
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDao {
    //Se crea un nuevo objeto de tipo Connection de SQL    
    Connection con;
    //Se crea un objeto de tipo prepared statement para agilizar el proceso de consultas a la base de datos
    PreparedStatement ps;    
    //Se crea un objeto de tipo result set para el retorno del prepared statement
    ResultSet rs;
    //Se instancia un objeto de mi clase conexion
    Conexion cn = new Conexion();
    
    //Se crea el metodo booleano para registrar un cliente
    public boolean RegistrarCliente(Cliente cl){
        //Se define la sentencia SQL a ejecutar dentro de la tabla cliente
        String sql = "INSERT INTO cliente (razonSocial, CuilCuit, telefono, direccion, correo, contacto)VALUES (?,?,?,?,?,?)";
        //Se ejecutan las sentencias a traves de un try-catch
        try {
            //Se define el objeto con a través del método get Connection de mi clase Conexion
            con = cn.getConnection();
            //Se le indica la sentencia sql a ejecutar dentro del prepared statement
            ps = con.prepareStatement(sql);
            //Se define el primer argumento
            ps.setString(1, cl.getRazonSocial());
            //Se define el segundo argumento
            ps.setInt(2, cl.getCuilCuit());
            //Se define el tercer argumento
            ps.setInt(3, cl.getTelefono());
            //Se define el cuarto argumento
            ps.setString(4, cl.getDireccion());
            //Se define el quinto argumento
            ps.setString(5, cl.getCorreo());
            //Se define el sexto argumento
            ps.setString(6, cl.getContacto());
            //Se ejecuta la sentencia SQL
            ps.execute();
            //Se retorna true si la carga del nuevo cliente fue exitosa
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
    
    //Se crea el metodo booleano para actualizar un cliente
    public boolean ModificarCliente(Cliente cl){
        //Se define la sentencia SQL a ejecutar dentro de la tabla cliente
        String sql = "UPDATE cliente SET razonSocial=?, CuilCuit=?, telefono=?, direccion=?, correo=?, contacto=? WHERE id = ?";
        //Se ejecutan las sentencias a traves de un try-catch
        try {
            //Se define el objeto con a través del método get Connection de mi clase Conexion
            con = cn.getConnection();
            //Se le indica la sentencia sql a ejecutar dentro del prepared statement
            ps = con.prepareStatement(sql);
            //Se define el primer argumento
            ps.setString(1, cl.getRazonSocial());
            //Se define el segundo argumento
            ps.setInt(2, cl.getCuilCuit());
            //Se define el tercer argumento
            ps.setInt(3, cl.getTelefono());
            //Se define el cuarto argumento
            ps.setString(4, cl.getDireccion());
            //Se define el quinto argumento
            ps.setString(5, cl.getCorreo());
            //Se define el sexto argumento
            ps.setString(6, cl.getContacto());
            //Se define el septimo argumento
            ps.setInt(7, cl.getId());
            //Se ejecuta la sentencia SQL
            ps.execute();
            //Se retorna true si la actualización de datos del cliente fue exitosa
            return true;
            
        } catch (SQLException e) {
            System.out.println(e.toString());
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
    
    //Se crea el metodo booleano para eliminar un cliente
    public boolean EliminarCliente(int id){
        //Se define la sentencia SQL a ejecutar dentro de la tabla cliente
        String sql = "DELETE FROM cliente WHERE id = ?";
        //Se ejecutan las sentencias a traves de un try-catch
        try {
            //Se define el objeto con a través del método get Connection de mi clase Conexion
            con = cn.getConnection();
            //Se le indica la sentencia sql a ejecutar dentro del prepared statement
            ps = con.prepareStatement(sql);
            //Se define el argumento
            ps.setInt(1, id);
            //Se ejecuta la sentencia SQL
            ps.execute();
            //Se retorna true si la eliminación del cliente fue exitosa
            return true;
            
        } catch (SQLException e) {
            System.out.println(e.toString());
            //Se retorna false si se produjo algún error
            return false;
            //Se usa un finally para cerrar la conexion con la base de datos
        } finally{
            try {
                //Se cierra la conexion con la base de datos
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }
    
    //Se crea el metodo para mostrar los datos de los clientes registrados en la base de datos en la tabla del form
    public List ListarCliente(){
        //Se crea una lista de tipo Cliente
        List<Cliente> ListaCl = new ArrayList();
        //Se define la sentencia SQL a ejecutar para obtener los datos de los clientes
        String sql = "SELECT * FROM cliente";
        //Se ejecutan las sentencias a traves de un try-catch
        try {
            //Se define el objeto con a través del método get Connection de mi clase Conexion
            con = cn.getConnection();
            //Se le indica la sentencia sql a ejecutar dentro del prepared statement
            ps = con.prepareStatement(sql);
            //Se obtiene el result set de ejecutar el Query
            rs = ps.executeQuery();
            //Se recorre la tabla cliente usando un While con el método next()
            while (rs.next()){
                //Se instancia un objeto de la clase cliente
                Cliente cl = new Cliente();
                //Al objeto cliente (cl) se le asigna el id de la fila recorrida
                cl.setId(rs.getInt("id"));
                //Al objeto cliente (cl) se le asigna la razon social de la fila recorrida
                cl.setRazonSocial(rs.getString("razonSocial"));
                //Al objeto cliente (cl) se le asigna el cuil o cuit de la fila recorrida
                cl.setCuilCuit(rs.getInt("CuilCuit"));
                //Al objeto cliente (cl) se le asigna el telefono de la fila recorrida
                cl.setTelefono(rs.getInt("telefono"));
                //Al objeto cliente (cl) se le asigna la direccion de la fila recorrida
                cl.setDireccion(rs.getString("direccion"));
                //Al objeto cliente (cl) se le asigna el correo de la fila recorrida
                cl.setCorreo(rs.getString("correo"));
                //Al objeto cliente (cl) se le asigna el contacto de la fila recorrida
                cl.setContacto(rs.getString("contacto"));
                //Se agrega a la lista de clientes los datos almacenados en el objeto de tipo cliente
                ListaCl.add(cl);                
            }
                        
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        //Se retorna la lista de clientes
        return ListaCl;        
    }
     
       
}
