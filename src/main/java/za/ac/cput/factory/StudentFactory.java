package za.ac.cput.factory;

import za.ac.cput.domain.*;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

// Zamandlovu C Ndlovu (211204803)


public class StudentFactory {
    //Student factory Method
    public static Student createStudent(int studentNumber, String firstName, String lastName, Identity identity,
                                        Residence residence, Contact contact) {
        if (Helper.validateInt(studentNumber) || Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName) || identity == null
                || residence == null || contact == null) {

            throw new IllegalArgumentException("Values cannot be null or empty");
        }
        return new Student.StudentBuilder()
                .setStudentNumber(studentNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setIdentity(identity)
                .setResidence(residence)
                .setContact(contact)
                .getStudent();
    }

    //Identity factory Method
    public static Identity createIdentity( String idNumber, String gender, String nationality, String race) {
        if(Helper.isNullOrEmpty(idNumber) || Helper.isNullOrEmpty(gender) || Helper.isNullOrEmpty(nationality)
                || Helper.isNullOrEmpty(race)) {
            throw new IllegalArgumentException("Values cannot be null or empty");
        }
        LocalDate dateOfBirth = Helper.getDateOfBirth(idNumber);
        return new Identity.IdentityBuilder()
                .setDateOfBirth(dateOfBirth)
                .setIdNumber(idNumber)
                .setGender(gender)
                .setNationality(nationality)
                .setRace(race)
                .getIdentity();
    }
    //Residence factory Method
public static Residence createResidence(String locationAddress, String roomNumber) {
        if(Helper.isNullOrEmpty(locationAddress) || Helper.isNullOrEmpty(roomNumber)) {
            throw new IllegalArgumentException("Values cannot be null or empty");
        }
        return new Residence.ResidenceBuilder()
                .setLocationAddress(locationAddress)
                .setRoomNumber(roomNumber)
                .getResidence();
}
//Contact factory Method

    public static Contact createContact(int cellNumber, String email){
    if(Helper.validateInt(cellNumber)|| Helper.isValidEmail(email))
        {
            throw new IllegalArgumentException("Values cannot be null or empty");
        }
    return new Contact.ContactBuilder()
            .setCellNumber(cellNumber)
            .setEmail(email)
            .getContact();
    }
}

