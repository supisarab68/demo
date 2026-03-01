package com.example.demo.model;

import com.example.demo.entity.MenuItem;

public class CartItem {

    private MenuItem menuItem;
    private int quantity;
    private String sweetness;
    private String note;

    public CartItem(MenuItem menuItem, int quantity, String sweetness, String note) {
        this.menuItem = menuItem;
        this.quantity = quantity;
        this.sweetness = sweetness;
        this.note = note;

    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /* ---------sweetness--------------- */
    public String getSweetness() {
        return sweetness;
    }

    public void setSweetness(String sweetness) {
        this.sweetness = sweetness;
    }
    /*----------------------------------- */

    /*-----------note-------------------- */
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    /*---------------------------------------- */
}
