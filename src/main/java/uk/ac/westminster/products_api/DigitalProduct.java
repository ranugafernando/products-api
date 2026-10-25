package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {
    private String downloadUrl;
    private double fileSizeMB;

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
}
