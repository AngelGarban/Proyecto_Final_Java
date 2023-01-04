package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProduccionDao {

    //Se instancia mi clase conexion.
    Conexion cn = new Conexion();

    Connection con;
    //Se usa un prepared statement para agilizar el proceso de consultas a la base de datos
    PreparedStatement ps;

    //Se usa un result set para el prepared statement de listar clientes
    ResultSet rs;

    //Se crea el metodo booleano para registrar la producción
    public boolean RegistrarProduccion(Produccion produccion) {
        //Se define la sentencia SQL a ejecutar dentro de la base de datos
        String sql = "INSERT INTO produccion (fecha, modelo40, modelo60, modelo90, total)VALUES (?,?,?,?,?)";
        //Se ejecutan las sentencias a traves de un try-catch
        
        try {
            con = cn.getConnection();
            //Se le indica la sentencia sql a ejecutar dentro del prepared statement
            ps = con.prepareStatement(sql);
            //Se define primer argumentosql);
            ps.setDate(1, produccion.getFecha());
            //Se define segundo argumentosql);
            ps.setInt(2, produccion.getModelo40());
            //Se define tercer argumentosql);
            ps.setInt(3, produccion.getModelo60());
            //Se define cuarto argumentosql);
            ps.setInt(4, produccion.getModelo90());
            //Se define quinto argumentosql);
            ps.setInt(5, produccion.getTotal());
            
            //Se ejecuta la sentencia SQL
            ps.execute();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                //Se cierra la conexion con la base de datos
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    public List ListarProduccion(){
        
        List<Produccion> ListaProdu = new ArrayList();
        String sql = "SELECT * FROM produccion";
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Produccion produccion = new Produccion();
                //produccion.setId(rs.getInt("id"));
                produccion.setFecha(rs.getDate("fecha"));
                produccion.setModelo40(rs.getInt("modelo40"));
                produccion.setModelo60(rs.getInt("modelo60"));
                produccion.setModelo90(rs.getInt("modelo90"));
                produccion.setTotal(rs.getInt("total"));
                
                ListaProdu.add(produccion);
                
            }
                        
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaProdu;
        
    }
    
}
