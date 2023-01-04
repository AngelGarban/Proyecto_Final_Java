
package Modelo;

public class Cliente {
    //Declaracion de variables privadas
    private int id;
    private String razonSocial;
    private int CuilCuit;
    private int telefono;
    private String direccion;
    private String correo;
    private String contacto;
        
    //Contructor vacío
    public Cliente() {
    }

    //Contructor con todos los parametros menos fecha
    public Cliente(int id, String razonSocial, int CuilCuit,  int telefono, String direccion, String correo, String contacto) {
        this.id = id;
        this.razonSocial = razonSocial;
        this.CuilCuit = CuilCuit;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.contacto = contacto;
    }
    
    //Getter del Id del cliente
    public int getId() {
        return id;
    }

    //Setter del Id del cliente
    public void setId(int id) {
        this.id = id;
    }

    //Getter de la razon social del cliente
    public String getRazonSocial() {
        return razonSocial;
    }

    //Setter de la razon social del cliente
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    //Getter del cuil del cliente
    public int getCuilCuit() {
        return CuilCuit;
    }

    //Setter del cuil del cliente
    public void setCuilCuit(int CuilCuit) {
        this.CuilCuit = CuilCuit;
    }

    //Getter del telefono del cliente
    public int getTelefono() {
        return telefono;
    }

    //Setter del telefono del cliente
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    //Getter de la direccion del cliente
    public String getDireccion() {
        return direccion;
    }

    //Setter de la direccion del cliente
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Getter del correo del cliente
    public String getCorreo() {
        return correo;
    }

    //Setter del correo del cliente
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //Getter de la persona contacto del cliente
    public String getContacto() {
        return contacto;
    }

    //Setter de la persona contacto del cliente
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
        
}
