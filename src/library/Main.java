package library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] book = new Book[10];
        book[0] = new ProgrammingBook("P1", " JS", 90, "wiki", "java", "A");
        book[1] = new ProgrammingBook("P2", "Java", 110, "wiki", "PHP", "B");
        book[2] = new ProgrammingBook("P3", "Python", 120, "wiki", "java", "C");
        book[3] = new ProgrammingBook("P4", "C++", 130, "wiki", "C++", "D");
        book[4] = new ProgrammingBook("P5", "Pascal", 140, "wiki", "java", "E");
        book[5] = new FictionBook("F1", "Khoa học", 50, "google", "Khoa Học");
        book[6] = new FictionBook("F2", "Viễn tưởng", 60, "google", "Viễn tưởng");
        book[7] = new FictionBook("F3", "Lịch sử", 70, "google", "Lịch sử");
        book[8] = new FictionBook("F4", "Kinh tế", 80, "google", "Kinh tế");
        book[9] = new FictionBook("F5", "Toán học", 90, "google", "Toán học");
        Sum(book);
        count(book,"java");

    }

    public static void Sum(Book[] book) {
        int sum = 0;
        for (int i = 0; i < book.length; i++) {
            sum += book[i].getPrice();
        }
        System.out.println("Sum price :" + sum);
    }

    public static void count(Book[] book,String find){
        int count = 0;
        for (int i = 0; i < book.length; i++) {
            if (book[i] instanceof ProgrammingBook){
                if (((ProgrammingBook) book[i]).getLanguage().equals(find)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
