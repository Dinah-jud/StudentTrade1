package za.ac.cput.domain;

public class CartItem {

    private int id;
    private Listing listing;
    private double price;

    // Private constructor to enforce the use of the Builder
    private CartItem(Builder builder) {
        this.id = builder.id;
        this.listing = builder.listing;
        this.price = builder.price;
    }

    // Getters
    public int getId() {
        return id;
    }

    public Listing getListing() {
        return listing;
    }

    public double getPrice() {
        return price;
    }

    // Builder class for CartItem
    public static class Builder {

        private int id;
        private Listing listing;
        private double price;

        // Setter methods for the Builder pattern
        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setListing(Listing listing) {
            this.listing = listing;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        // Build the CartItem instance
        public CartItem build() {
            return new CartItem(this);
        }
    }
}
