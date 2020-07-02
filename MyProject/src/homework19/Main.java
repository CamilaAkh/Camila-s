package homework19;

import java.io.*;
import java.util.Formatter;
import java.util.InputMismatchException;

    public class Main {
        public static void main(String[] args) throws IOException {

            File out = new File("out.txt");
            File in = new File("products.txt");
            if (!out.exists())
                out.createNewFile();
            if (!in.exists())
                in.createNewFile();
            FileReader fr = new FileReader(in);
            BufferedReader reader = new BufferedReader(fr);
            PrintWriter pw = new PrintWriter(out);
            float total = 0;
            float coast;
            Product pr = new Product();
            String next = reader.readLine();
            Formatter f;
            pr.setName(next);
            pw.printf("%-15s %8s %10s %11s \n", "Наименование", "Цена", "Кол-во", "Стоимость");
            pw.printf("===============================================\n");
            try {
                while (next != null) {
                    f = new Formatter();
                    pr.setQuantity(Float.parseFloat(reader.readLine()));
                    pr.setPrice(Float.parseFloat(reader.readLine()));
                    coast = (pr.getPrice() * pr.getQuantity());
                    total = total + coast;
                    f.format("=%.2f", coast);
                    System.out.println(f);
                    pw.printf("%-15s %8.2f x %8.2f %11s \n", pr.getName(), pr.getPrice(), pr.getQuantity(), f);
                    next = reader.readLine();
                    pr.setName(next);
                    f.close();
                }
                pw.printf("===============================================\n");
                pw.printf("%-8s %38.2f \n", "Итого:", total);
            } catch (InputMismatchException e) {
                e.printStackTrace();
            } finally {
                pw.close();
                reader.close();
                fr.close();
            }
            System.out.println(total);
        }
    }
