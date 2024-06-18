/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASSLibraryManagement;
import java.time.LocalDateTime;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
// code by Pham Trung Đức 

public class InvoiceManagement {
        LocalDateTime time = LocalDateTime.now();

    DateTimeFormatter time1 = DateTimeFormatter.ofPattern("  dd/MM/yyyy  hh/mm/ss");
    DateTimeFormatter time2 = DateTimeFormatter.ofPattern("ddMMyyyhhmmss");

    String time1s = time.format(time1);
    String time2s = time.format(time2);
    
     public static boolean containsNumber(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public void invoice (String name, Integer age, int somon) throws IOException  {
          Scanner duc = new Scanner(System.in);
          
          if( InvoiceManagement.containsNumber(name)){
              throw new IllegalArgumentException("Tên người vui lòng không  chứa ký tự  chứ số !");
          }
     
          
          
          
          
         if(age<=0){
             throw new IllegalArgumentException("age không được nhỏ hơn hoặc bằng 0 !");
         }
      
     
         
        
            File file = new File("hoa_don_" + time2s+ ".txt");
            if (file.createNewFile()) {
                System.out.println("Hóa Đơn Đã Sắm Sàng !");
            } else {
                System.out.println("------- Hóa Đơn Đã Tồn Tại !! --------");
            }
    

        
            BufferedWriter writer = new BufferedWriter(new FileWriter("hoa_don_" + time2s + ".txt"));
         

            writer.write("------------- Hóa Đơn Restaurant VIP --------------\n");
            writer.write("Tên Khách Hàng : " + name + "\n");
            writer.write("Thời Gian Sử Dụng Dịch Vụ " + time1s + "\n");
            writer.write("Mã Hóa Hóa Đơn : "+time2s +"\n");

            for (int i = 0; i < somon; i++) {

                System.out.print("Nhập Tên Món Ăn muốn Thêm  ");
                String namefood = duc.nextLine();
                System.out.println("Tên món :");
                writer.write(namefood+"\n");

            }

            writer.write("Tổng Tiền Thanh Toán :\n ");
             writer.write("\n ");
            writer.write("Cảm Ơn Quý Khách Đã Tin Tưởng Dịch Vụ Của Chúng Tôi !");
            writer.close();
     

        

            BufferedReader reader = new BufferedReader(new FileReader("hoa_don_" + time2s + ".txt"));

           
                String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
      
    }
     
    
    public void FindHoaDon(String ma) throws IOException{
        
        
            BufferedReader reader1 = new BufferedReader (new FileReader("hoa_don_"+ma+".txt"));
             String line1;
             System.out.println("Thông Tin Hóa Đơn Mà Bạn Tìm Kiếm");
             while((line1=reader1.readLine())!=null){
                 System.out.println(line1);}
             
            
      

    
}
    }
