package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Cart;
import za.ac.cput.domain.Residence;
import za.ac.cput.domain.Student;
import za.ac.cput.domain.CartItem;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CartFactoryTest {

    private static List<CartItem> cartItems;
    private static Residence residence;
    private static Student student;

    private static Cart validCart;
    private static Cart nullItemsCart;
    private static Cart invalidCart;

    @BeforeAll
    static void setUp() {
        cartItems = new ArrayList<>();
        residence  = ResidenceFactory.createResidence("Buke", "Cape Town", "SA", "1465", "South Africa", 25, 142);
        student = StudentFactory.createStudent(1453, "John", "Doe", residence, 1245, "john.doe@gmail.com");

        validCart = CartFactory.createCart(201, student, cartItems);
        nullItemsCart = CartFactory.createCart(202, student, null);
        invalidCart = CartFactory.createCart(-1, null, cartItems);
    }

    @Test
    @Order(1)
    void testCreateValidCart() {
        assertNotNull(validCart);
        System.out.println(validCart);
    }

    @Test
    @Order(2)
    void testCreateCartWithNullItems() {
        assertNull(nullItemsCart);
        System.out.println("Cart with null items: " + nullItemsCart);
    }

    @Test
    @Order(3)
    void testCreateInvalidCart() {
        assertNull(invalidCart);
        System.out.println("Invalid Cart: " + invalidCart);
    }

    @Test
    @Order(4)
    @Disabled("Not implemented yet")
    void testNotImplemented() {
        // This test is intentionally disabled
    }
}
