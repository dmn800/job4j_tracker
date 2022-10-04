package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int count = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                count = i;
                break;
            } else {
                count = -1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i].getName());
            }
        }
        System.out.println(indexOfNull(products));
    }
}
