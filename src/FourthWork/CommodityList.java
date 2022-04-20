package FourthWork;

import ThirdWork.Commodity;

import java.util.ArrayList;


public class CommodityList {

    private ArrayList<Commodity> listOfCommodities;

    public CommodityList(ArrayList<Commodity> listOfCommodities) {
        this.listOfCommodities = listOfCommodities;
    }

    public void addCommodity(Commodity commodity) {
        listOfCommodities.add(commodity);
    }

    public ArrayList<Commodity> showCommodities() {
        return listOfCommodities;
    }

}
