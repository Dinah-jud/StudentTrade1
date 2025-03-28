package za.ac.cput.factory;


import za.ac.cput.domain.Cart;
import za.ac.cput.domain.Listing;
import za.ac.cput.domain.Student;
import za.ac.cput.domain.Transaction;
import za.ac.cput.util.TransactionHelper;

import java.time.LocalDate;

public class TransactionFactory {

    public static Transaction createTransaction(int id, Student buyer, Student seller, Cart cart, Listing listing, double amount, String deliveryOption, LocalDate date) {

        if(TransactionHelper.notValidID(id)){

            return null;

        }
        if(!TransactionHelper.isValidStudent(buyer)
                || TransactionHelper.isValidStudent(seller))
        {
               return null;

        }
        if(!TransactionHelper.isValidCart(cart)){
            return null;

        }
        if(!TransactionHelper.validListing(listing)){
            return null;
        }
        if(TransactionHelper.notValidAmount(amount)){

            return  null;


        }
        if(TransactionHelper.isNotValidDate(date)){
            return null;
        }

        return  new Transaction.Builder().setId(id).setBuyer(buyer).setSeller(seller).setCart(cart).setListing(listing).setAmount(amount).setDeliveryOption(deliveryOption).setDate(date).build();

    }
}
