package com.mycompany.app;

import java.util.ArrayList;
import java.util.Collection;

public class ExpertoListarPagos {

    private ArrayList<Pago> pagos;


    public ExpertoListarPagos() {
        this.pagos = new ArrayList<Pago>();

    }

    


    public boolean pagosIsEmpty() {
        return pagos.isEmpty();
    }


    public Pago getPago(int index) {
        return pagos.get(index);
    }


    public Pago setPago(int index, Pago pago) {
        return pagos.set(index, pago);
    }


    public boolean addPago(Pago pago) {
        return pagos.add(pago);
    }


    public void addPago(int index, Pago pago) {
        pagos.add(index, pago);
    }


    public Pago removePago(int index) {
        return pagos.remove(index);
    }


    public boolean removePago(Pago pago) {
        return pagos.remove(pago);
    }


    public boolean addPagos(Collection<? extends Pago> pago) {
        return pagos.addAll(pago);
    }


    public boolean addPagos(int index, Collection<? extends Pago> pago) {
        return pagos.addAll(index, pago);
    }




    public ArrayList<Pago> getPagos() {
        return pagos;
    }




    public void setPagos(ArrayList<Pago> pagos) {
        this.pagos = pagos;
    }

    public void borrar_este_metodo_xd() {
        System.out.println("soy el dylan xd");
    }
    


    // public ArrayList<Pago> listaDePagos(){
    //     return new ArrayList<Pago>;
    // }

}
