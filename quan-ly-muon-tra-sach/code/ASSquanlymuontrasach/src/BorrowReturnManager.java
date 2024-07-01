import java.util.ArrayList;
import java.util.HashMap;
public class BorrowReturnManager {private final ArrayList<Book> books; 
    private final HashMap<Book, Long[]> borrowReturnRecords; 

    public BorrowReturnManager() {
        books = new ArrayList<>();
        borrowReturnRecords = new HashMap<>();
    }


    public void addBook(Book book) {
        books.add(book);
    }

 
    public void removeBook(Book book) {
        books.remove(book);
        borrowReturnRecords.remove(book);
    }

 
    public boolean borrowBook(Book book, long borrowTime) {
        if (!book.isBorrowed() && books.contains(book)) {
            book.setBorrowed(true);
            borrowReturnRecords.put(book, new Long[]{borrowTime, null});
            return true;
        }
        return false;
    }

    
    public boolean returnBook(Book book, long returnTime) {
        if (book.isBorrowed() && books.contains(book)) {
            book.setBorrowed(false);
            Long[] times = borrowReturnRecords.get(book);
            if (times != null) {
                times[1] = returnTime;
            }
            return true;
        }
        return false;
    }

   
    public int getStockCount() {
        int count = 0;
        for (Book book : books) {
            if (!book.isBorrowed()) {
                count++;
            }
        }
        return count;
    }
    
}
