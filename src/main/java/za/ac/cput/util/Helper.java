package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Residence;
import za.ac.cput.domain.Student;

import java.time.LocalDate;
import za.ac.cput.domain.*;

public class Helper {
    public static boolean isNullOrEmpty(String value) {
        if(value == null || value.isEmpty())
            return true;
        return false;
    }
    public static boolean notValid(int i) {
       if(i < 0)
            return true;
        return false;
    }
    public static boolean validateDouble(double d) {
        if(d <= 0.0 || d > 1000000.0)
            return false;
        return true;
    }
    public static boolean isStudentValid(Student student){

        if(student.getStudentNumber() < 0 || student.getFirstName() == null || student.getFirstName().isEmpty()||student.getLastName() == null || student.getLastName().isEmpty()||student.getResidence() == null || isValidEmail(student.getEmail())){
            return false;
        }

      return true ;
    }

    public static boolean notValidResidence(Residence residence) {
        return residence != null && residence.getAddress() != null;
    }
    public static boolean isValidEmail(String email){

        EmailValidator validator =  EmailValidator.getInstance();
        if(validator.isValid(email)){
            return true;
        }else{
            return false;
        }
    }
//    public static LocalDate getDateOfBirth(String id ) {
//        int year = Integer.parseInt(id.substring(0, 4));
//        int month = Integer.parseInt(id.substring(4, 6));
//        int day = Integer.parseInt(id.substring(6, 8));
//        LocalDate date = LocalDate.of(year,month,day);
//        return date;
//    }
}
