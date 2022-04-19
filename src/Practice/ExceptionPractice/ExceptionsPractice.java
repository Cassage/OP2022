package Practice.ExceptionPractice;


import java.io.FileReader;
import java.io.IOException;

public class ExceptionsPractice {


    public static void main(String[] args) throws FuckingException {
        String string = "";

        ExceptionChecker exceptionLauncher = new ExceptionChecker();

        try(FileReader fr = new FileReader("E://Soft/NetBeans 8.2/Projects/test/test/file.txt")) {
            char [] array = new char[10];
            fr.read(array);   // чтение содержимого массива
            for(char c : array)
                System.out.print(c);   // вывод символов на экран, один за одним
        } catch(IOException e) {
            System.out.println("COCKA");
        }

        try {
            exceptionLauncher.madShit(string);
        } catch (IllegalArgumentException error){
            System.out.println("man, that's too bad");
        } finally {
            System.out.println("FINALE");
        }
    }

}
