package Modelo;

import java.sql.Date;

public class Produccion {

    private int id;
    private Date fecha;
    private int modelo40;
    private int modelo60;
    private int modelo90;
    private int total;

    public Produccion() {
    }

    public Produccion(int id, Date fecha, int modelo40, int modelo60, int modelo90) {
        this.id = id;
        this.fecha = fecha;
        this.modelo40 = modelo40;
        this.modelo60 = modelo60;
        this.modelo90 = modelo90;
        this.total = modelo40 + modelo60 + modelo90;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getModelo40() {
        return modelo40;
    }

    public void setModelo40(int modelo40) {
        this.modelo40 = modelo40;
    }

    public int getModelo60() {
        return modelo60;
    }

    public void setModelo60(int modelo60) {
        this.modelo60 = modelo60;
    }

    public int getModelo90() {
        return modelo90;
    }

    public void setModelo90(int modelo90) {
        this.modelo90 = modelo90;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
