package za.ac.cput.util;


import java.time.LocalDate;

public class ListingHelper {

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

    public static boolean notValidAmount(double amount){
        if(amount < 0 ){
            return true;

        }
        return false;
    }

    public static boolean notValidDate(LocalDate date){

        if(date == null || date.equals(LocalDate.now())){
            return  true;
        }
        return false;
    }




}
