package com.study.test.box;


public class Order {
    private int orderId;
    private String productName;
    private String consumerName;
    private int price;
    private int stock;

    public void showOrderInfo() {
        System.out.println("주문번호: " + orderId);
        System.out.println("상품명: " + productName);
        System.out.println("구매자: " + consumerName);
        System.out.println("가격: " + price);
        System.out.println("수량: " + stock);
    }

    public Order(int orderId, String productName, String consumerName, int price, int stock) {
        this.orderId = orderId;
        this.productName = productName;
        this.consumerName = consumerName;
        this.price = price;
        this.stock = stock;
    }

    public static Orderbuilder builder() {
        return new Orderbuilder();
    }

    public static class Orderbuilder {
        private int orderId;
        private String productName;
        private String consumerName;
        private int price;
        private int stock;

        public Order build() {
            return new Order(orderId, productName, consumerName, price, stock);
        }

        public Orderbuilder orderId(int orderId){
            this.orderId = orderId;
            return this;
        }

        public Orderbuilder productName (String productName){
            this.productName = productName;
            return this;
        }

        public Orderbuilder consumerName (String consumerName){
            this.consumerName = consumerName;
            return this;
        }

        public Orderbuilder price (int price){
            this.price = price;
            return this;
        }

        public Orderbuilder stock (int stock){
            this.stock = stock;
            return this;
        }

    }

}
