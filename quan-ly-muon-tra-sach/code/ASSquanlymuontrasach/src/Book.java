
public class Book {
    private final String title;
    private final String author; 
    private int price; 
    private boolean isBorrowed; 

    
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isBorrowed = false;
    }

   

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}

    

