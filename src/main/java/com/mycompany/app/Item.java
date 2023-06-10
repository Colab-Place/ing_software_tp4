package com.mycompany.app;

public class Item {
    private int cod;
    private String name;
    private int cantidad;
    private double precio;

    public Item() {
    }

    public Item(int cod, String name, int cantidad,  double precio) {
        this.cod = cod;
        this.name = name;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getCod() {
        return this.cod;
    }

    public String getName() {
        return this.name;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public double getPrecio() {
        return this.precio;
    }
}
