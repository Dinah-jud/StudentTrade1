package za.ac.cput.util;

import za.ac.cput.domain.Student;

public class ServiceHelper {

    public static boolean isNullOrEmpty(String service){
        if(service.isEmpty() || service == null) {
            return true;
        }
        return false;
    }

//    public static double isRateValidOrNot(double rate){
//        if(rate <= 0){
//            return 0;
//        }
//        return rate;
//    }

    public static Student isProvideVerified(Student studentID){
        if(studentID == null){
            return null;
        }
        return studentID;
    }
}
