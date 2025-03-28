package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionFactoryTest {

    private static Residence residence1 = ResidenceFactory.createResidence("Buke", "Cape Town", "SA", "1465", "South Africa", 25, 142);
    private static Student student3 = StudentFactory.createStudent(54587, "ggjng", "gfngjf", residence1, 031255, "hkhohm@gmail.com");
    private static Student student4 = StudentFactory.createStudent(2545666, "ggjng", "gfngjf", residence1, 031255, "hkhohm@gmail.com");

    //    private static Listing listing = new Listing.Builder()
//            .setId(1)
//            .setTitle("Laptop")
//            .setDescription("dne")
//            .setDatedPosted(LocalDate.now())
//            .build();
    private static Listing listing = ListingFactory.createListing(14, "laptop", "ihp", LocalDate.now());

    
    private static CartItem cartItem1 = CartItemFactory.createCartItem(1, listing, 1500.00);
    private static CartItem cartItem2 = CartItemFactory.createCartItem(2, listing, 800.00);

    // Create Cart object with items
    private static List<CartItem> cartItems = Arrays.asList(cartItem1, cartItem2);


    private static Cart cart = CartFactory.createCart(14, student3, cartItems);

    private static Transaction transaction1 = TransactionFactory.createTransaction(14, student3, student4, cart, listing, 1451.2, "cash", LocalDate.now());

    @Test
    public void createTransactionthat() {
        assertNull(transaction1); // Ensure that the transaction is created
        System.out.println(transaction1); // Print the transaction to the console
    }
}

