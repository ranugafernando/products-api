package uk.ac.westminster.products_api;

public class Product {

    //private -
    //public -
    //protected - only inside a package
    //default - inside the package and the subclasses
    private Long id;
    private String name;
    private double price;

    public Product(){ //This allows Java/Spring to create a
                      // Product without needing any information yet
    }

    public Product(Long id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
