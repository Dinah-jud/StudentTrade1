package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Cart;
import za.ac.cput.factory.CartFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CartRepositoryTest {

    private static ICartRepository repository = CartRepository.getRepository();
    private static Cart cart = CartFactory.createCart(1, null, null);

    @Test
    void a_create() {
        Cart createdCart = repository.create(cart);
        assertNotNull(createdCart);
        System.out.println(createdCart.toString());
    }

    @Test
    void b_read() {
        repository.create(cart);
        Cart readCart = repository.read(cart.getId());
        assertNotNull(readCart);
        System.out.println(readCart.toString());
    }

    @Test
    void c_update() {
        Cart updatedCart = new Cart.Builder().setId(1).build();  // Just set the ID, no dependencies
        Cart updated = repository.update(updatedCart);
        assertNotNull(updated);
        System.out.println(updated.toString());
    }

    @Test
    @Disabled
    void d_delete() {
        repository.create(cart);
        boolean isDeleted = repository.delete(cart.getId());
        assertTrue(isDeleted);
        System.out.println("Deleted cart with ID " + cart.getId());
    }

    @Test
    void e_getAll() {
        var allCarts = repository.getAll();
        assertNotNull(allCarts);
        System.out.println(allCarts);
    }
}
