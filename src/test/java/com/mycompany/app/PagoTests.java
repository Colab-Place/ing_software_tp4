package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PagoTests {

    @Test
    public void testPago() {
        Pago pago = new Pago();

        assertNotNull(pago);
    }

    @Test
    public void testGetCliente() {
        Cliente cliente = new Cliente("89312", "Pepe el Hongo");
        Pago pago = new Pago(cliente);

        assertNotNull(pago.getCliente());
    }

    @Test
    public void testSetCliente() {
        Cliente cliente = new Cliente("89312", "Pepe el Hongo");
        Pago pago = new Pago();
        pago.setCliente(cliente);

        assertEquals(pago.getCliente(),cliente);


    }
}
