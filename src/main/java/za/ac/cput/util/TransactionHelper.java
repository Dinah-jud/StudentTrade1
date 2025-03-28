package za.ac.cput.util;


import org.apache.commons.validator.routines.EmailValidator;
import za.ac.cput.domain.Cart;
import za.ac.cput.domain.Listing;
import za.ac.cput.domain.Student;

import java.time.LocalDate;

public class TransactionHelper {

    public static boolean isNullOrEmpty(String value) {
        if(value == null || value.isEmpty())
            return true;
        return false;
    }
    public static boolean validateInt(int i) {
        if(i<=0 || i>1000)
            return false;
        return true;
    }
    public static boolean validateDouble(double d) {
        if(d <= 0.0 || d > 1000000.0)
            return false;
        return true;
    }
    public static boolean isValidEmail(String email){

        EmailValidator validator =  EmailValidator.getInstance();
        if(validator.isValid(email)){
            return true;
        }else{
            return false;
        }
    }

    public static LocalDate getDateOfBirth(String id ) {
        int year = Integer.parseInt(id.substring(0, 4));
        int month = Integer.parseInt(id.substring(4, 6));
        int day = Integer.parseInt(id.substring(6, 8));
        LocalDate date = LocalDate.of(year,month,day);
        return date;
    }

    public static boolean isNull(String input) {

        if (input.isEmpty() || input == null) {
            return true;
        }
        return false;

    }

    public static boolean notValidAmount(double amount) {

        if (amount < 1) {
            return true;
        }
        return false;
    }
    public static boolean isNotValidDate(LocalDate date) {


        if (date == null || !date.equals(LocalDate.now())) {
            return true;
        }

        return false;
    }

    public static boolean isValidStudent(Student student) {
        if (student == null) {
            return false;
        }

        if (student.getStudentNumber() <= 0) {
            return false;
        }

        if (student.getFirstName() == null || student.getFirstName().isEmpty()) {
            return false;
        }

        if (student.getLastName() == null || student.getLastName().isEmpty()) {
            return false;
        }

//        if (student() == null || student.getEmail().isEmpty() || !student.getEmail().contains("@")) {
//            return false;
//        }


//        if (student.getContactNo() <= 0) {
//            return false;
//        }
//
//        if (student.getGender() == null || student.getGender().isEmpty()) {
//            return false;
//        }

//        if (student.getDateOfBirth() == null || student.getDateOfBirth().isEmpty()) {
//            return false;
//        }

//        if (student.getResidence() == null || student.getResidence().isEmpty()) {
//            return false;
//        }

        return true;
    }
    public static boolean isValidCart(Cart cart) {
        return cart != null && cart.getId() > 0 && cart.getOwner() != null && cart.getItems() != null;
    }

    public static boolean isCartEmpty(Cart cart) {
        return cart != null && (cart.getItems() == null || cart.getItems().isEmpty());
    }
    public static boolean notValidID(int id ){

        if(id < 0){
            return true;
        }
        return  false;

    }

    public static boolean inputNull(String s){
        if(s.isEmpty() || s == null){
            return true;
        }
        return false;
    }



    public static boolean validListing(Listing listing){

        if(!validateInt(listing.getId())){
            return true;
        }
        if(!isNull(listing.getTitle() )|| !isNull(listing.getDescription())){
            return true;
        }
        if(!isNotValidDate(listing.getDatedPosted())){
            return true;
        }
        return false;

    }

}
