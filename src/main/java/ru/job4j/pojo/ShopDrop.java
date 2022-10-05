package ru.job4j.pojo;

public class ShopDrop {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getName());
        }
        System.out.println("");
        //products[1] = products[2];
        //products[2] = null;
        delete(products, 1);
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i].getName());
            } else {
                System.out.println("null");
            }
        }
    }

    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length; i++) {
            if (i != products.length - 1) {
                products[i].setName(products[i + 1].getName());
            } else {
                products[i] = null;
            }
        }
        return products;
    }
}
