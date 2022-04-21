package io.codelex.classesandobjects.practice.exercises;
class Product {

    public String name;
    public double price;
    public int amount;



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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public Product() {
        this.name = getName();
        this.price = getPrice();
        this.amount = getAmount();
    }

    public void printProduct() {
        System.out.println(getName() + ", price " + getPrice() + ", amount " + getAmount() + " units");
    }

    public static class exercise1 {


        public static void main(String[] args) {
            Product product = new Product();
            product.setName("Logitech mouse");
            product.setPrice(70.00);
            product.setAmount(14);
            product.printProduct();


            product.setName("iPhone 5s");
            product.setPrice(999.99);
            product.setAmount(3);
            product.printProduct();


            product.setName("Epson EB-U05");
            product.setPrice(440.46);
            product.setAmount(1);
            product.printProduct();

        }
    }
}
