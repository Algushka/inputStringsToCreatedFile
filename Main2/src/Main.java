
// task 2
//Допустим, дан текстовый файл. Ваша задача,
//вывести содержимое этого файла на экран.
//

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String target = "output.txt";
        StringBuilder sb = new StringBuilder();

        try {
            BufferedReader fis = new BufferedReader(new FileReader(target));
            int data;
            while ((data = fis.read()) != -1) {
                sb.append((char) data);}
            System.out.println(sb);
            }
        catch(FileNotFoundException e){
                System.out.println("File not found");

            }
            catch(IOException e ){
                System.out.println("Mistake");
            }

            }

        }

