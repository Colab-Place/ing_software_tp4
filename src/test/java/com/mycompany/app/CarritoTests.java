package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarritoTests {
    @Test
    public static void validarNombreClaseCarrito () {
      Carrito carrito = new Carrito();
      assertNotNull(carrito);
    }
 
    @Test
    public static void validarCarritoListaItemsValida () {
      Carrito carrito = new Carrito();
      assertNotNull(carrito.getItems());     
    }
 
    @Test
    public static  void validarCarritoNoVacio () {
      Carrito carrito = new Carrito();
      assertTrue(carrito.getItems().size() > 0);
    }
 
    @Test
    public static void validarCarritoNoTieneItemsIguales () {
 
      
    }
  }