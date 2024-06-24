/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persent;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ManagerBook {

    private ArrayList<Book> bookList;

    public ManagerBook() {
        bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void deleteBook(String BookID) {
        // BookID la bien moi bookID la bien cu 
        Book bookToRemove = null;
        for (Book book : bookList) {
            if (book.getbookID().equals(BookID)) {
                bookToRemove = book;
                break;
            }
        }
    }

    public Book findBook(String BookID) {
        for (Book book : bookList) {
            if (book.getbookID().equals(BookID)) {
                return book;

            }
        }
        return null;
    }

    public Book bookPrice(String bookId, double newPrice) {
        for (Book book : bookList) {
            if (book.getBookID().equals(bookId)) {
                book.setPrice(newPrice);
                break;
            }
        }
        return null;
    }

    public int soLuongSachDangCo() {
        return bookList.size();
    }
}
