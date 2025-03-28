package za.ac.cput.repository;

import za.ac.cput.domain.CartItem;
import java.util.ArrayList;
import java.util.List;

public class CartItemRepository implements ICartItemRepository {

    private static ICartItemRepository repository = null;

    private final List<CartItem> cartItemList;

    private CartItemRepository() {
        cartItemList = new ArrayList<>();
    }

    public static ICartItemRepository getRepository() {
        if (repository == null) {
            repository = new CartItemRepository();
        }
        return repository;
    }

    @Override
    public CartItem create(CartItem cartItem) {
        boolean success = cartItemList.add(cartItem);
        if (success) {
            return cartItem;
        }
        return null;
    }

    @Override
    public CartItem read(Integer cartItemId) {
        if (cartItemId == null) {  // Check for null to avoid NullPointerException
            return null;
        }
        for (CartItem cartItem : cartItemList) {
            if (cartItem.getId() == cartItemId) {  // Directly compare primitive int
                return cartItem;
            }
        }
        return null;
    }


    public CartItem update(CartItem cartItem) {
        Integer cartItemId = cartItem.getId();
        CartItem existingCartItem = read(cartItemId);
        if (existingCartItem == null) {
            return null;
        }

        boolean success = delete(cartItemId);
        if (success) {
            if (cartItemList.add(cartItem)) {
                return cartItem;
            }
        }
        return null;
    }


    public boolean delete(Integer cartItemId) {
        CartItem cartItemToDelete = read(cartItemId);
        if (cartItemToDelete == null) {
            return false;
        }

        return cartItemList.remove(cartItemToDelete);
    }

    @Override
    public List<CartItem> getAll() {
        return cartItemList;
    }
}

