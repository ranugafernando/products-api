package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable{

    private String downloadUrl;
    private double fileSizeMB;
    private double discountedPrice;

    public DigitalProduct(){

    }

    public DigitalProduct(Long id, String name, double price,
                          String downloadUrl, double fileSizeMB){
        super(id, name, price); //cus of inheritance??? and this should be the 1st line
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl(){
        return downloadUrl;
    }
    public double getfileSizeMB(){
        return fileSizeMB;
    }

    @Override
    public String getSummery(){
        return "Digital: " + getName() + " | Downlaod: " + downloadUrl;
    }

    @Override
    public void applyDiscount(double rate){
        // Nothing is shipped, so the full rate applies.
        discountedPrice = getPrice() * (1 - rate);
    }

    @Override
    public double getDiscountedPrice(){
        return discountedPrice;
    }

}
