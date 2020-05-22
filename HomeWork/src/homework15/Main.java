package homework15;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;



public class Main {


    public static void main(String[] args) {
        try {

            File file = new File("file.txt");
            File renamedFile = new File("renamedFile.txt");
            File copiedFile = new File("copiedFile.txt");


            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Файл успешно создан");
            }

            if (file.renameTo(renamedFile)) {
                System.out.println("Файл успешно переименован");
            } else System.out.println("Переименновать файл не удалось");


            Files.copy(renamedFile.toPath(), copiedFile.toPath());


            if(renamedFile.delete()){
            System.out.println("renamedFile.txt файл был  успешно удален ");
            }else System.out.println("renamedFile.txt файл удалить не удалось");


            Path pathSource = Paths.get("C:\\Users\\Asus\\Documents\\GitHub\\Camila-s\\HomeWork\\src\\myDir");

            Files.walkFileTree(pathSource, new MyFileVisitor());


            } catch (IOException e) {
            System.out.println("Error: " + e);
            e.printStackTrace();
        }

    }
}
