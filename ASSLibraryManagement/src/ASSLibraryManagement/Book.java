/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persent;

/**
 *
 * @author admin
 */
public class Book {
    private String bookName;
    private String bookID;
    private double priceOnHours;

    public Book(String bookName, String bookID, double priceOnHours) {
        this.bookName = bookName;
        this.bookID = bookID;
        this.priceOnHours = priceOnHours;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBoooID(String boooID) {
        this.bookID = bookID;
    }

    public double getPriceOnHours() {
        return priceOnHours;
    }

    public void setPriceOnHours(double priceOnHours) {
        this.priceOnHours = priceOnHours;
    }

    Object getbookID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setPrice(double newPrice) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
