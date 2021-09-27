package library;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Book[] book=new Book[3];
        for (int i = 0; i < book.length/2; i++) {
            String language=scanner.nextLine();
            String frameWork=scanner.nextLine();
            book[i]=new ProgrammingBook(language,frameWork);
        }
        for (int i = 0; i < book.length; i++) {
            System.out.println(((ProgrammingBook)book[i]).getLanguage());
        }
    }
}
