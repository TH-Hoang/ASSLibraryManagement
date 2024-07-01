import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BorrowReturnManager manager = new BorrowReturnManager();
      
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Tên sách: ");
            String title = scanner.nextLine();
            
            System.out.print("tác giả: ");
            String author = scanner.nextLine();
            
            System.out.print("Nhập giá tiền sách: ");
            int price = scanner.nextInt();
            scanner.nextLine(); 
            
            Book book = new Book(title, author, price);
            manager.addBook(book);
            
        
            System.out.println("Chọn: ");
            System.out.println("1. Mượn sách");
            System.out.println("2. Trả sách");
            System.out.println("3. Kiểm tra số lượng sách tồn kho");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    
                    boolean borrowed = manager.borrowBook(book, System.currentTimeMillis());
                    System.out.println("Mượn sách: " + (borrowed ? "Thành công" : "Thất bại"));
                    break;
                case 2:
                    
                    boolean returned = manager.returnBook(book, System.currentTimeMillis());
                    System.out.println("Trả sách: " + (returned ? "Thành công" : "Thất bại"));
                    break;
                case 3:
                    
                    int stockCount = manager.getStockCount();
                    System.out.println("Số lượng sách tồn kho: " + stockCount);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        }
    } 
}
    
