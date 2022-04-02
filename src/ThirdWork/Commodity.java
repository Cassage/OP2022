package ThirdWork;

public class Commodity {
    private long id;
    private int productCode;
    private String name;
    private int wholesalePrice;
    private int retailPrice;
    private String description;

    public Commodity(long id, int productCode, String name, int wholesalePrice, int retailPrice, String description) {
        this.id = id;
        this.productCode = productCode;
        this.name = name;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(int wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Товар с идентификатором " + id +
                "\n Код - " + productCode +
                "\n Наименование - " + name +
                "\n Оптовая цена - " + wholesalePrice +
                "\n Розничная цена - " + retailPrice +
                "\n Описание - " + description;
    }

}
