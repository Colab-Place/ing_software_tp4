package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ClienteTests {

    @Test
    public void testCliente(){
        Cliente cliente = new Cliente("89312", "Pepe el Hongo");
        assertNotNull(cliente);
    }

    @Test
    public void testGetFullname() {
        Cliente cliente = new Cliente("89312", "Pepe el Hongo");
        assertNotNull(cliente.getFullname());
    }

    @Test
    public void testGetId() {
        Cliente cliente = new Cliente("89312", "Pepe el Hongo");
        assertNotNull(cliente.getId());
    }

    @Test
    public void testSetFullname() {
        Cliente cliente = new Cliente("89312", "Pepe el Hongo");
        cliente.setFullname("Esteban Kito");
        assertEquals(cliente.getFullname(),"Esteban Kito");
    }
}
