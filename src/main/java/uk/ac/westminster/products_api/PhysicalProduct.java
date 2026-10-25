package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it is a
// type of Product that inherits its properties and
// methods from the Product class.

// A ShoppingCart is NOT-A Product because it contains
// Products rather than being a type of Product,
// which is a HAS-A relationship

public class PhysicalProduct extends Product{
    private double weight;
    private String dimensions;

    public PhysicalProduct(){

    }

    public PhysicalProduct(Long id, String name, double price,
                           double weight, String dimensions){

        super(id, name, price);
        this.weight = weight;
        this.dimensions = dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getDimensions(){
        return dimensions;
    }
}
