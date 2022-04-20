package FourthWork;

import ThirdWork.Commodity;

public class OversizedCommodity extends Commodity {

    private double height;
    private double width;
    private double length;

    public OversizedCommodity(long id, int productCode, String name, int wholesalePrice, int retailPrice, String description, double height, double length, double width){
        super(id, productCode, name, wholesalePrice, retailPrice, description);
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString(){
        return  "\n" + super.toString() +
                "\n Высота (метры) - " + getHeight() +
                "\n Ширина (метры) - " + getWidth() +
                "\n Длина (метры) - " + getLength();
    }



}
