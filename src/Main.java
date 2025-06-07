//С помощью методов File создайте папку \temp Напишите метод
//        который, позволяет пользователю вводить строки со сканнера
//        и записывать их в файл \temp\input.txt Как только пользователь
//        введет "-exit" ваша программа должна вывести на экран весь
//        введенный пользователем текст.

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
//https://github.com/Algushka/inputStringsToCreatedFile.git

public class Main {
    public static void main(String[] args) {
//создаем новую папку
        String  targetFolder = "E:\\ait\\basicprogramming\\lessons\\lesson45\\domashka\\temp";
        String sourceFileName = "output.txt";
        //File newFile = new File("\\temp");
        try
        {File newDir = createFolder(targetFolder);
            System.out.println("Dir is created");
            System.out.println(newDir.getAbsolutePath());
        }
        catch (NotCreateDirException e) {
            System.out.println(e.getMessage());
        }
//        File newFile = new File (targetFolder);
//        System.out.println(newFile.exists());
//        newFile.mkdir();
//        System.out.println(newFile.exists());
//        System.out.println("newFile.getParent()"+ newFile.getAbsolutePath());
        try
                //пробуем создать файл для записи открываем поток
                (OutputStream targetFile = new FileOutputStream(sourceFileName)) {

        }
            catch (IOException e) {

        };
    }
    public static void WriteStringToFile (OutputStream target, String str) {



    }
    public static File createFolder ( String targetFolder) {
        boolean create= false;
        File newFolder = new File(targetFolder);
        create = newFolder.mkdir();
        if (!create) {
            throw new NotCreateDirException("Dir is not created  :    " + targetFolder+ "'");
        }
return newFolder;
    }
}