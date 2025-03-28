package za.ac.cput.util;

import za.ac.cput.domain.CartItem;
import za.ac.cput.domain.Listing;

public class CartItemHelper {


    public static boolean isNullOrEmpty(String value) {
        if (value == null || value.isEmpty())
            return true;
        return false;
    }

    public static boolean notValid(int i) {
        if (i < 0)
            return true;
        return false;
    }
}