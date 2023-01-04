
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class PedidoDao {
    //Se instancia mi clase conexion.
    Conexion cn = new Conexion();

    Connection con;
    //Se usa un prepared statement para agilizar el proceso de consultas a la base de datos
    PreparedStatement ps;
    //Se usa un result set para el prepared statement
    ResultSet rs;
    
    public void ConsultarCliente(JComboBox clientBox){
        String sql = "SELECT razonSocial FROM cliente";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                clientBox.addItem(rs.getString("razonSocial"));
            }
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    //Se crea el metodo booleano para registrar la producción
    public boolean RegistrarPedido(Pedido pedido) {
        //Se define la sentencia SQL a ejecutar dentro de la base de datos
        String sql = "INSERT INTO pedido (nPedido, cliente, modelo40, modelo60, modelo90, saldo40, saldo60, saldo90, status)VALUES (?,?,?,?,?,?,?,?,?)";
        //Se ejecutan las sentencias a traves de un try-catch
                    
        try {
            con = cn.getConnection();
            //Se le indica la sentencia sql a ejecutar dentro del prepared statement
            ps = con.prepareStatement(sql);
            //Se define primer argumentosql);
            ps.setInt(1, pedido.getNPedido());
            ps.setString(2, pedido.getClientePedido());
            //Se define segundo argumentosql);
            ps.setInt(3, pedido.getCantidad40());
            ps.setInt(4, pedido.getCantidad60());
            ps.setInt(5, pedido.getCantidad90());
            ps.setInt(6, pedido.getSaldo40());
            ps.setInt(7, pedido.getSaldo60());
            ps.setInt(8, pedido.getSaldo90());
            ps.setString(9, pedido.getStatus());
            //Se define tercer argumentosql);
            
            
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
    
    public List ListarPedido(){
        
        List<Pedido> ListaPedid = new ArrayList();
        String sql = "SELECT * FROM pedido";
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Pedido pedido = new Pedido();
                pedido.setId(rs.getInt("id"));
                pedido.setClientePedido(rs.getString("cliente"));
                pedido.setCantidad40(rs.getInt("modelo40"));
                pedido.setCantidad60(rs.getInt("modelo60"));
                pedido.setCantidad90(rs.getInt("modelo90"));
                pedido.setStatus(rs.getString("status"));
                
                ListaPedid.add(pedido);
                
            }
                        
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaPedid;
        
    }
    
}
