/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package ASSLibraryManagement;

import java.util.ArrayList;
import java.util.Scanner;


public class ManageLibraryStaff {
     private String name, address, gender;
    private int age, date, firstDayWork, ID;
    private double cost, timeWork, shift1, shift2, shift3;

    public ManageLibraryStaff(String name, String address, String gender, int age, int date, int firstDayWork, int ID, double cost, double timeWork, double shift1, double shift2, double shift3) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
        this.date = date;
        this.firstDayWork = firstDayWork;
        this.ID = ID;
        this.cost = cost;
        this.timeWork = timeWork;
        this.shift1 = shift1;
        this.shift2 = shift2;
        this.shift3 = shift3;
    }

   
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getFirstDayWork() {
        return firstDayWork;
    }

    public void setFirstDayWork(int firstDayWork) {
        this.firstDayWork = firstDayWork;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(double timeWork) {
        this.timeWork = timeWork;
    }

    public void addemployee(Scanner scanner, ArrayList<Employee> employee) {
        System.out.println("nhập thông tin nhân viên");
        System.out.println("nhập tên nhân viên");
        String name = scanner.nextLine();

        System.out.println("nhập tuổi nhân viên");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("nhập giới tính");
        String gender = scanner.nextLine();

        System.out.println("nhập địa chỉ nhân viên");
        String address = scanner.nextLine();

        System.out.println("nhập ID nhân viên");
        int ID = scanner.nextInt();

        System.out.println("ngày làm đầu tiên");
        int firstDayWork = scanner.nextInt();

        Employee employees = new Employee(name, address, gender, age, date, ID, firstDayWork, cost, timeWork);
        employee.add(employees);

    }

    public static void removeemployee(ArrayList<Employee> employee, int idremove) {
        for (Employee emp : employee) {
            if (emp.getID() == idremove) {
                employee.remove(idremove);
                System.out.println("đã xóa nhân viên có ID" + idremove);
                return;
            } else {
                System.out.println("không tìm thấy ID này");
            }

        }

    }

    public void clearemploy(ArrayList<Employee> employee, Scanner scanner, int choice) {

        do {
            System.out.println("chọn 1 chức năng xóa");
            System.out.println("1.xóa toàn bộ danh sách");
            System.out.println("2.xóa từ nhân viên");
            System.out.println("3.chọn 0 để thoát");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    employee.clear();
                    System.out.println("đã xóa toàn bộ");
                    break;

                case 2:
                    System.out.println("nhập ID nhân viên");
                    int idremove = scanner.nextInt();
                    scanner.nextLine();
                    removeemployee(employee, idremove);

                    break;
            }

        } while (choice != 0);

    }

    public void display(Scanner scanner, ArrayList<Employee> employee) {
        if (employee.isEmpty()) {
            System.out.println("không có nhân viên");
        } else {
            for (Employee em : employee) {
                System.out.printf("name: %s, age: %d, address: %d, ID: %d, firstDayWord: %d", em.getName(), em.getAge(), em.getAddress(), em.getID(), em.getFirstDayWork());
                System.out.println("      ");

            }
        }

    }

    public void changeemployee(String newName, int newAge, String newAddress, int ID) {
        if (this.ID == ID) {
            this.name = newName;
            this.age = newAge;
            this.address = newAddress;

        }
    }

    public void employeeSalary(Scanner scanner, ArrayList<Employee> employee, double time) {
        System.out.println("nhập ca làm");
        int shift = scanner.nextInt();
        System.out.println("nhập giờ làm thêm");
        time = scanner.nextDouble();

        double salary = 0;
        switch (shift) {
            case 1:
                salary = time * 18000;
                break;
            case 2:
                salary = time * 20000;
                break;
            case 3:
                salary = time * 22000;
                break;
            default:
                System.out.println("lựa trọn không lệ");
                return;
        }
        System.out.println("số tiền nhận đươc" + salary);

    }

}



    
}
