package za.ac.cput.domain;


import java.time.LocalDate;
import java.util.Date;

public class Transaction {

    private int id ;
    private Student buyer;
    private Student seller;
    private Cart cart;
    private Listing listing;
    private double amount;
    private String deliveryOption;
    private LocalDate date ;

    private Transaction(){

    }

    private Transaction(Builder builder){
        this.id = builder.id;
        this.buyer = builder.buyer;
        this.cart = builder.cart;
        this.amount = builder.amount;
        this.listing = builder.build().listing;
        this.deliveryOption = builder.deliveryOption;
        this.date = builder.date;

    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDeliveryOption() {
        return deliveryOption;
    }

    public double getAmount() {
        return amount;
    }

    public Listing getListing() {
        return listing;
    }

    public Cart getCart() {
        return cart;
    }

    public Student getSeller() {
        return seller;
    }

    public Student getBuyer() {
        return buyer;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", buyer=" + buyer +
                ", seller=" + seller +
                ", cart=" + cart +
                ", listing=" + listing +
                ", amount=" + amount +
                ", deliveryOption='" + deliveryOption + '\'' +
                ", date=" + date +
                '}';
    }

    public static class Builder{
        private int id ;
        private Student buyer;
        private Student seller;
        private Cart cart;
        private Listing listing;
        private double amount;
        private String deliveryOption;
        private LocalDate date ;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setBuyer(Student buyer) {
            this.buyer = buyer;
            return this;
        }

        public Builder setSeller(Student seller) {
            this.seller = seller;
            return this;
        }

        public Builder setCart(Cart cart) {
            this.cart = cart;
            return this;
        }
        public Builder setListing(Listing listing) {
            this.listing = listing;
            return this;
        }

        public Builder setDeliveryOption(String deliveryOption) {
            this.deliveryOption = deliveryOption;
            return this;
        }

        public Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder setDate(LocalDate date) {
            this.date = date;
            return this;
        }

        public Builder copy(Builder builder){
            this.id = builder.id;
            this.buyer = builder.buyer;
            this.cart = builder.cart;
            this.amount = builder.amount;
            this.listing = builder.build().listing;
            this.deliveryOption = builder.deliveryOption;
            this.date = builder.date;

            return this;
        }

        public Transaction build(){
            return new Transaction(this);
        }
    }

}
