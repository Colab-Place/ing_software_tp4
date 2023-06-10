package com.mycompany.app;

public class Pago {
    private final String id;
    private Cliente cliente;
    private double monto;



    public Pago() {
        this.id = "99999999";
    }



    public Pago(String id, Cliente cliente, double monto) {
        this.id = id;
        this.cliente = cliente;
        this.monto = monto;
    }



    public String getId() {
        return id;
    }


    public double getMonto() {
        return monto;
    }


    public void setMonto(double monto) {
        this.monto = monto;
    }



    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
