package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTests {
  @Test
  public void testItem() {
    Item item = new Item();
    assertNotNull(item);
  }

  @Test
  public void testGetCod() {
    Item item = new Item(1, "testItem", 1, 1.00);
    assertNotNull(item.getCod());
  }

  @Test
  public void testGetName() {
    Item item = new Item(1, "testItem", 1, 1.00);
    assertNotNull(item.getName());
  }

  @Test
  public void testGetCantidad() {
    Item item = new Item(1, "testItem", 1, 1.00);
    assertNotNull(item.getCantidad());
  }

  @Test
  public void testGetPrecio() {
    Item item = new Item(1, "testItem", 1, 1.00);
    assertNotNull(item.getPrecio());
  }
}
