package library;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Library lib = null;

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Library.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();

            lib = (Library) un.unmarshal(new File("lib.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        visitLibrary(lib);

        serialization(lib);

    }


    /**
     * метод сериализации xml-файла
     * @param lib
     */
    private static void serialization(Library lib){
        if (lib != null) {
            try {
                JAXBContext context = JAXBContext.newInstance(Library.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

                marshaller.marshal(lib, new File("lib.xml"));
            } catch (JAXBException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * метод для работы с библиотекой(просмотр списка книг, добавление книги в список)
     * @param lib
     */
    private static void visitLibrary(Library lib){
        Book tempBook;

        System.out.println("Выберите действие:\n0.Выйти из библиотеки\n1.Добавить книгу\n2.Посмотреть список книг");
        Scanner scn = new Scanner(System.in);

        try {

            int actionChoice = scn.nextInt();

            while (actionChoice != 0) {

                switch (actionChoice) {
                    case 1:
                        System.out.println("Укажите последовательно через клавишу ввода название, автора и год издания книги");

                        tempBook = new Book();
                        tempBook.setName(scn.next());
                        tempBook.setAutor(scn.next());
                        tempBook.setYear(scn.nextInt());

                        lib.books.add(tempBook);

                        break;
                    case 2:
                        for (Book b : lib.books) {
                            System.out.println("'" + b.getName() + "' автор: " + b.getAutor() + " год: " + b.getYear());

                        }
                        System.out.println();
                        break;
                }
                System.out.println("Выберите действие:\n0.Выйти из библиотеки\n1.Добавить книгу\n2.Посмотреть список книг");
                actionChoice = scn.nextInt();
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }


}
