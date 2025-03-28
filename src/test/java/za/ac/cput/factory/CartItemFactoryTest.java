package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.CartItem;
import za.ac.cput.domain.Listing;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CartItemFactoryTest {

    // Create a Listing instance before using it
    private static Listing listing1 = ListingFactory.createListing(1, "Laptop for Sale", "Brand new gaming laptop", LocalDate.now());
    private static List<CartItem> cartItems = new ArrayList<>();  // Empty cart items list

    private static CartItem ci1 = CartItemFactory.createCartItem(101, listing1, 1266);
    private static CartItem ci2 = CartItemFactory.createCartItem(102, null, 794);
    private static CartItem ci3 = CartItemFactory.createCartItem(-1, listing1, 159);
    private static CartItem ci4 = CartItemFactory.createCartItem(103, listing1, 599);

    @Test
    @Order(1)
    public void testCreateCartItem() {
        assertNotNull(ci1);
        System.out.println(ci1.toString());
    }

    @Test
    @Order(2)
    public void testCreateCartItemWithNullListing() {
        assertNull(ci2);
        System.out.println("CartItem creation failed as expected with null listing");
    }

    @Test
    @Order(3)
    public void testCreateCartItemWithNegativeId() {
        assertNull(ci3);
        System.out.println("CartItem creation failed as expected with negative id");
    }

    @Test
    @Order(4)
    public void testCreateCartItemWithNullItems() {
        assertNull(ci4);
        System.out.println("CartItem creation failed as expected with null items list");
    }

    @Test
    @Order(5)
    @Disabled
    public void testNotImplemented() {
    }
}
