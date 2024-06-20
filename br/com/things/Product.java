package br.com.things;

public class Product {
    private String productName;
    private double productPrice;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void applyDiscount(double percentage) {
        double discount = productPrice * (percentage / 100);
        productPrice -= discount;

    }
    public static void main(String[] args) {
        Product product1 = new Product();

        product1.setProductName("Iphone");
        product1.setProductPrice(1000.0);

        System.out.println("Product: " + product1.getProductName());
        System.out.println("Price: " + product1.getProductPrice());

        product1.applyDiscount(10);
        System.out.println("Price with discount: " + product1.getProductPrice());
    }

}
