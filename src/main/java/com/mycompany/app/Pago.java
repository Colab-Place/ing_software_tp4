package com.mycompany.app;

public class Pago {
    private Cliente cliente;


    public Pago() {
    }

    public Pago(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
