
package Modelo;

import java.sql.Date;

public class Pedido {
    
    private int id;
    private int nPedido;
    private String clientePedido;
    private int cantidad40;
    private int cantidad60;
    private int cantidad90;
    private int saldo40;
    private int saldo60;
    private int saldo90;
    private String status;
    private Date fechaPedido;

    public Pedido() {
    }

    public Pedido(int id, int nPedido, String clientePedido, int cantidad40, int cantidad60, int cantidad90, int saldo40, int saldo60, int saldo90, String status, Date fechaPedido) {
        this.id = id;
        this.nPedido = nPedido;
        this.clientePedido = clientePedido;
        this.cantidad40 = cantidad40;
        this.cantidad60 = cantidad60;
        this.cantidad90 = cantidad90;
        this.saldo40 = saldo40;
        this.saldo60 = saldo60;
        this.saldo90 = saldo90;
        this.status = status;
        this.fechaPedido = fechaPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNPedido() {
        return nPedido;
    }

    public void setNPedido(int nPedido) {
        this.nPedido = nPedido;
    }

    public String getClientePedido() {
        return clientePedido;
    }

    public void setClientePedido(String clientePedido) {
        this.clientePedido = clientePedido;
    }

    public int getCantidad40() {
        return cantidad40;
    }

    public void setCantidad40(int cantidad40) {
        this.cantidad40 = cantidad40;
    }

    public int getCantidad60() {
        return cantidad60;
    }

    public void setCantidad60(int cantidad60) {
        this.cantidad60 = cantidad60;
    }

    public int getCantidad90() {
        return cantidad90;
    }

    public void setCantidad90(int cantidad90) {
        this.cantidad90 = cantidad90;
    }

    public int getSaldo40() {
        return saldo40;
    }

    public void setSaldo40(int saldo40) {
        this.saldo40 = saldo40;
    }

    public int getSaldo60() {
        return saldo60;
    }

    public void setSaldo60(int saldo60) {
        this.saldo60 = saldo60;
    }

    public int getSaldo90() {
        return saldo90;
    }

    public void setSaldo90(int saldo90) {
        this.saldo90 = saldo90;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
                   
}
