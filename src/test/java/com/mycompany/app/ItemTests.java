package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTests {
    @Test
    void validarNombreClaseItem() {
      Item item = new Item();
      assertNotNull(item);
    }
 
       @Test
    void validarCodItemNoNulo() {
      Item item = new Item(1,"testItem",1,1.00);
      assertNotNull(item.getCod());
    }
 
    @Test
    void validarNombreItemNoNulo() {
      Item item = new Item(1,"testItem",1,1.00);
      assertNotNull(item.getName());
    }
 
    @Test
    void validarCantidadItemNoNulo() {
      Item item = new Item(1,"testItem",1,1.00);
      assertNotNull(item.getCantidad());
    }
 
    @Test
    void validarPrecioItemNoNulo() {
      Item item = new Item(1,"testItem",1,1.00);
      assertNotNull(item.getPrecio());
    }
 }
