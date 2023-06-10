package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTests {
  @Test
  public void validarNombreClaseItem() {
    Item item = new Item();
    assertNotNull(item);
  }

  @Test
  public void validarCodItemNoNulo() {
    Item item = new Item(1, "testItem", 1, 1.00);
    assertNotNull(item.getCod());
  }

  @Test
  public void validarNombreItemNoNulo() {
    Item item = new Item(1, "testItem", 1, 1.00);
    assertNotNull(item.getName());
  }

  @Test
  public void validarCantidadItemNoNulo() {
    Item item = new Item(1, "testItem", 1, 1.00);
    assertNotNull(item.getCantidad());
  }

  @Test
  public void validarPrecioItemNoNulo() {
    Item item = new Item(1, "testItem", 1, 1.00);
    assertNotNull(item.getPrecio());
  }
}
