package vn.com.productfinal;

public class Product {
    int id;
    String name;
    double price;
    int imgSrc;

    public Product(int id, String name, double price, int imgSrc) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imgSrc = imgSrc;
    }
    public Product(String name, double price, int imgSrc) {
        this.name = name;
        this.price = price;
        this.imgSrc = imgSrc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(int imgSrc) {
        this.imgSrc = imgSrc;
    }
}
