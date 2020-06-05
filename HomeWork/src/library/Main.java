package library;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Library lib = new Library();
        Library lib = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Library.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();

            lib = (Library) un.unmarshal(new File("lib.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        //Book [] myLibrary = new Book[100];
        int booksQuantity = 0;
        Book tempBook;
        System.out.println("Выберите действие:\n0.Выйти из библиотеки\n1.Добавить книгу\n2.Посмотреть список книг" );
        Scanner scn = new Scanner(System.in);
        int actionChoice = scn.nextInt();
        //int bookchoice;
        while (actionChoice!=0) {
            switch (actionChoice) {
                case 1:
                    System.out.println("Укажите последовательно через клавишу ввода название, автора и год издания книги");
                    try {
                        tempBook = new Book();
                        tempBook.setName(scn.next());
                        tempBook.setAutor(scn.next());
                        tempBook.setYear(scn.nextInt());
                        lib.books.add(tempBook);
                        //myLibrary[booksQuantity] = new Book(scn.next(), scn.next(), scn.nextInt());
                        booksQuantity++;
                    } catch (InputMismatchException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    for (Book b : lib.books) {
                        System.out.println("'" + b.getName() +"' автор: " + b.getAutor() + " год: " + b.getYear());

                    }
                    System.out.println();
                    break;
                /**case 3:
                    System.out.println("Укажите номер книги");
                    bookchoice = scn.nextInt();
                    System.out.printf("Книга '%s' автора %s %d года" + myLibrary[bookchoice-1].name + myLibrary[bookchoice-1].autor + myLibrary[bookchoice-1].year);
                    System.out.println();
                 */
            }
            System.out.println("Выберите действие:\n0.Выйти из библиотеки\n1.Добавить книгу\n2.Посмотреть список книг" );
            actionChoice = scn.nextInt();
        }
        if (lib != null) {
            try {
                JAXBContext context = JAXBContext.newInstance(Library.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

                marshaller.marshal(lib, new File("lib.xml"));
            } catch ( JAXBException e) {
                e.printStackTrace();
            }
        }
    }
}
