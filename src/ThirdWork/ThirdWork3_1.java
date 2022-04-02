package ThirdWork;

public class ThirdWork3_1 {

    public static void main(String[] args) {
        long id = 1;
        int productCode = 2312;
        String name = "Ноутбук";
        int wholesalePrice = 40000;
        int retailPrice = 62000;
        String description = "Атлишный ноутбук";
        Commodity exampleObject = new Commodity(id, productCode, name, wholesalePrice, retailPrice, description);
        System.out.println(exampleObject);
    }

}
