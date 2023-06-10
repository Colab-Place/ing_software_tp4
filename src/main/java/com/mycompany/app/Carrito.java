package com.mycompany.app;

import java.util.ArrayList;

public class Carrito {
  private ArrayList<Item> items;

  public Carrito() {
    items = new ArrayList<Item>();
  }

  public void addItem(Item item) {
    items.add(item);
  }

  public ArrayList<Item> getItems() {
    return items;
  }
}