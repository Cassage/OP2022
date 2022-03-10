package FirstWork;

public class FirstWork1_2 {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Вы не передавали аргументов");
        } else {
            System.out.println("Вы ввели " + args.length + " параметров");
        }
    }
}
