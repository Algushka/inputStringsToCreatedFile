//С помощью методов File создайте папку \temp Напишите метод
//        который, позволяет пользователю вводить строки со сканнера
//        и записывать их в файл \temp\input.txt Как только пользователь
//        введет "-exit" ваша программа должна вывести на экран весь
//        введенный пользователем текст.

import java.io.*;
import java.util.Scanner;
//https://github.com/Algushka/inputStringsToCreatedFile.git

public class Main {
    public static void main(String[] args) {
//создаем новую папку
        String targetFolder = "E:\\ait\\basicprogramming\\lessons\\lesson45\\domashka\\temp";
        String sourceFileName = "output.txt";
        //String str = "I can always quit";
        //File newFile = new File("\\temp");
        try {
            File newDir = createFolder(targetFolder);
            System.out.println("Dir is created");
            System.out.println(newDir.getAbsolutePath());
            BufferedWriter targetFile = new BufferedWriter(new FileWriter(sourceFileName));

            String str="";
            while (!str.equals("exit"))
             {str = inputStringFromScanner();
              // if (stringEqualsExit(str)) {System.exit(0);}
                if (!str.equals("exit")) {targetFile.write(str);
                                         targetFile.newLine();}
             }



            targetFile.flush();//скинь все в буфер
        } catch (NotCreateDirException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {

            //throw new RuntimeException("Failed to write a string to file"); или это
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }
//        File newFile = new File (targetFolder);
//        System.out.println(newFile.exists());
//        newFile.mkdir();
//        System.out.println(newFile.exists());
//        System.out.println("newFile.getParent()"+ newFile.getAbsolutePath());

    }


    public static File createFolder(String targetFolder) {
        boolean create = false;
        File newFolder = new File(targetFolder);
        create = newFolder.mkdir();
        if (!create) {
            throw new NotCreateDirException("Dir is not created  :    " + targetFolder + "'");
        }
        return newFolder;
    }

    public static String inputStringFromScanner() {
        Scanner scanner = new Scanner(System.in);
        String result;
        System.out.println("Input string (while string<>exit: ");
        result = scanner.nextLine();


        return result;

    }

//    public static boolean stringEqualsExit(String str) {
//        boolean result = false;
//        if (str.equals("exit")) return true;
//
//        return result;
//
//    }
}