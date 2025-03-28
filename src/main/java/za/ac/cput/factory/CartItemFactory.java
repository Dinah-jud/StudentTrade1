package za.ac.cput.factory;

import za.ac.cput.domain.CartItem;
import za.ac.cput.domain.Listing;
import za.ac.cput.util.CartItemHelper;

public class CartItemFactory {

    public static CartItem createCartItem(int id, Listing list, double price) {
    // lisitng later
    if(CartItemHelper.notValid(id) ){
        return null;
    }

        return new CartItem.Builder()
                .setId(id)           // Set the id
                .setListing(list)     // Set the listing
                .setPrice(price)      // Set the price
                .build();             // Build and return the CartItem
    }
}
