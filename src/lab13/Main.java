package lab13;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "file.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите текст для записи в файл (для завершения введите 'exit'):");
            String input;
            while (!(input = reader.readLine()).equals("exit")) {
                writer.write(input);
                writer.newLine();
            }
            System.out.println("Информация успешно записана в файл.");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Содержимое файла " + fileName + ":");
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите текст для замены в файле (для завершения введите 'exit'):");
            String input;
            while (!(input = reader.readLine()).equals("exit")) {
                writer.write(input);
                writer.newLine();
            }
            System.out.println("Информация успешно заменена в файле.");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите текст для добавления в конец файла (для завершения введите 'exit'):");
            String input;
            while (!(input = reader.readLine()).equals("exit")) {
                writer.write(input);
                writer.newLine();
            }
            System.out.println("Текст успешно добавлен в конец файла.");
        } catch (IOException e) {
            System.err.println("Ошибка добавления текста в файл: " + e.getMessage());
        }
    }
}
