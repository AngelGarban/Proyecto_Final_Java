
package Modelo;

public class registro {
    //Declaracion de variables privadas
    private int id;
    private String nombre;
    private String correo;
    private String password;

    //Contructor vacío
    public registro() {
    }

    //Contructor con todos los parametros
    public registro(int id, String nombre, String correo, String password) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
    }

    //Getter del Id del usuario
    public int getId() {
        return id;
    }

    //Setter del Id del usuario
    public void setId(int id) {
        this.id = id;
    }

    //Getter del nombre del usuario
    public String getNombre() {
        return nombre;
    }

    //Setter del nombre del usuario
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Getter del correo del usuario
    public String getCorreo() {
        return correo;
    }

    //Setter del correo del usuario
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //Getter de la contraseña del usuario
    public String getPassword() {
        return password;
    }

    //Setter de la contraseña del usuario
    public void setPassword(String password) {
        this.password = password;
    }       
    
}
