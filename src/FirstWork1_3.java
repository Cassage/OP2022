public class FirstWork1_3 {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Неверное количество параметров");
        } else {
            int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
            System.out.println("Первое число - " + args[0] + "\n" + "Второе число - " + args[1] + "\n" + "Сумма чисел - " + sum);
        }
    }
}
