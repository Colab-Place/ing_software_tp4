package com.mycompany.app;

import java.util.ArrayList;

public class Carrito {
    private ArrayList <Item> items;
  
    public Carrito() {
      items = new ArrayList<Item> ();
    }
  
    // private void mockList() {
    //   items.add(new Item("testItem1",1,1.0));
    //   items.add(new Item("testItem2",1,1.0));
    //   items.add(new Item("testItem3",1,1.0));
    // }
  
    public ArrayList<Item> getItems() {
      return items;
    }
  }