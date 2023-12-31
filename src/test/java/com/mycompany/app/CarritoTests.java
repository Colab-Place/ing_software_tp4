package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarritoTests {
  @Test
  public void testCarrito() {
    Carrito carrito = new Carrito();
    assertNotNull(carrito);
  }

  @Test
  public void testGetItems() {
    Carrito carrito = new Carrito();
    assertNotNull(carrito.getItems());
  }

  @Test
  public void testAddItem() {
    /* Arrange */
    Carrito carrito = new Carrito();
    Item item = new Item(1, "testItem", 1, 1.00);
    /* Act */
    carrito.addItem(item);
    /* Assert */
    assertTrue(carrito.getItems().size() > 0);
  }
}