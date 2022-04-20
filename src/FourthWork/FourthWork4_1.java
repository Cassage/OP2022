package FourthWork;

import ThirdWork.Commodity;

import java.util.ArrayList;

/* Реализация готовой продукции. Создать родительский класс «Товар»
(идентификатор, код, наименование, цена, описание) и дочерние классы:
 «Хрупкий товар» (коэффициент хрупкости);
 «Скоропортящийся товар» (мах время хранения);
 «Габаритный товар» (высота, ширина, длина).
Реализовать класс для хранения списка товаров с методом добавления нового
товара и методом печати списка товаров. */

public class FourthWork4_1 {

    public static void main(String[] args) {

        ArrayList<Commodity> listOfCommodities = new ArrayList<>();
        CommodityList commodityList = new CommodityList(listOfCommodities);

        long glassId = 2;
        int glassProductCode = 1244;
        String glassName = "Стекло";
        int glassWholesalePrice = 1000;
        int glassRetailPrice = 1500;
        String glassDescription = "Хрупкое...";
        double glassFragilityFactor = 0.96;
        FragileCommodity glass = new FragileCommodity(glassId, glassProductCode, glassName, glassWholesalePrice, glassRetailPrice, glassDescription, glassFragilityFactor);

        commodityList.addCommodity(glass);

        long eggId = 3;
        int eggProductCode = 126;
        String eggName = "Яичко C1";
        int eggWholesalePrice = 5;
        int eggRetailPrice = 10;
        String eggDescription = "Хрупкое... и быстропортящееся";
        double eggStorageTime = 72;
        PerishableCommodity egg = new PerishableCommodity(eggId, eggProductCode, eggName, eggWholesalePrice, eggRetailPrice, eggDescription, eggStorageTime);

        commodityList.addCommodity(egg);

        long freezerId = 4;
        int freezerProductCode = 834;
        String freezerName = "Холодильник Haier";
        int freezerWholesalePrice = 50000;
        int freezerRetailPrice = 70000;
        String freezerDescription = "Большой, а ещё тут холодно";
        double freezerHeight = 2.2;
        double freezerWidth = 0.5;
        double freezerLength = 0.5;
        OversizedCommodity freezer = new OversizedCommodity(freezerId, freezerProductCode, freezerName, freezerWholesalePrice, freezerRetailPrice, freezerDescription, freezerHeight, freezerLength, freezerWidth);

        commodityList.addCommodity(freezer);

        System.out.println(commodityList.showCommodities());


    }

}
