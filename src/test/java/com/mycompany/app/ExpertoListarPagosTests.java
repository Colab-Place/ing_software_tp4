package com.mycompany.app;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ExpertoListarPagosTests {

    @Test
    public void testExpertoListarPagos() {
        ExpertoListarPagos expertoListarPagos = new ExpertoListarPagos();
        assertNotNull(expertoListarPagos);
    }

    @Test
    public void testAddPago() {
        ExpertoListarPagos expertoListarPagos = new ExpertoListarPagos();
        Pago pago = new Pago();
        expertoListarPagos.addPago(pago);

        assertEquals(pago, expertoListarPagos.getPago(0));
    }

    @Test
    public void testAddPago2() {
        ExpertoListarPagos expertoListarPagos = new ExpertoListarPagos();
        Pago pago = new Pago();
        expertoListarPagos.addPago(0, pago);

        assertEquals(pago, expertoListarPagos.getPago(0));
    }

    @Test
    public void testAddPagos() {
        ExpertoListarPagos expertoListarPagos = new ExpertoListarPagos();
        ArrayList<Pago> pagoList = new ArrayList<Pago>();
        pagoList.add(new Pago());
        pagoList.add(new Pago());
        pagoList.add(new Pago());

        expertoListarPagos.addPagos(pagoList);
        assertEquals(pagoList, expertoListarPagos.getPagos());
    }

    @Test
    public void testAddPagos2() {
        ExpertoListarPagos expertoListarPagos = new ExpertoListarPagos();
        ArrayList<Pago> pagoList = new ArrayList<Pago>();
        pagoList.add(new Pago());
        pagoList.add(new Pago());
        pagoList.add(new Pago());

        expertoListarPagos.addPagos(0, pagoList);
        assertEquals(pagoList, expertoListarPagos.getPagos());
    }

    @Test
    public void testGetPago() {
        ExpertoListarPagos expertoListarPagos = new ExpertoListarPagos();
        Pago pago = new Pago();
        expertoListarPagos.addPago(0, pago);

        assertEquals(pago, expertoListarPagos.getPago(0));
    }

    @Test
    public void testPagosIsEmpty() {
        ExpertoListarPagos expertoListarPagos = new ExpertoListarPagos();
        assertTrue(expertoListarPagos.pagosIsEmpty());
    }

    @Test
    public void testRemovePago() {
        ExpertoListarPagos expertoListarPagos = new ExpertoListarPagos();
        Pago pago = new Pago();
        expertoListarPagos.addPago(0, pago);
        expertoListarPagos.removePago(pago);

        assertTrue(expertoListarPagos.getPagos().size() == 0);

    }

    @Test
    public void testRemovePago2() {
        ExpertoListarPagos expertoListarPagos = new ExpertoListarPagos();
        Pago pago = new Pago();
        expertoListarPagos.addPago(0, pago);
        expertoListarPagos.removePago(0);

        assertTrue(expertoListarPagos.getPagos().size() == 0);
    }

    @Test
    public void testSetPago() {
        ExpertoListarPagos expertoListarPagos = new ExpertoListarPagos();
        ArrayList<Pago> pagoList = new ArrayList<Pago>();
        pagoList.add(new Pago());
        pagoList.add(new Pago());
        pagoList.add(new Pago());
        expertoListarPagos.setPagos(pagoList);

        assertArrayEquals(pagoList.toArray(), expertoListarPagos.getPagos().toArray());
    }

}
