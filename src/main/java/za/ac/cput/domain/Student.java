package za.ac.cput.domain;


//Zamandlovu C Ndlovu (211204803)
public class Student {
    private int studentNumber;
    private String firstName;
    private String lastName;
    //private Identity identity;
   private Residence residence;
   // private Contact contact;
    private int cellNumber;
    private String email;

    private Student(){}
//Constructor
    private Student(StudentBuilder builder){
        this.studentNumber = builder.studentNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.residence = builder.residence;
        this.cellNumber = builder.cellNumber;
        this.email = builder.email;

        //this.identity = builder.identity;
        //this.residence = builder.residence;
        //this.contact = builder.contact;
    }
    //Getters
    public int getStudentNumber() {
        return studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Residence getResidence() {
        return residence;
    }

    public int getCellNumber() {
        return cellNumber;
    }
    //public Identity getIdentity() {
     //   return identity;
   // }

    //public Residence getResidence() {
      //  return residence;
    //}

    //public Contact getContact() {
//        return contact;
//    }
// toString Method
//    @Override
//    public String toString() {
//        return "Student: " + "\n" +
//                "studentNumber= " + studentNumber +
//                " firstName= " + firstName + "\n" +
//                " lastName= " + lastName + "\n" +
//                " identity= " + identity + "\n" +
//                " residence=" + residence + "\n" +
//                " contact=" + contact + "\n" ;
//    }
//Student Builder class
    public static class StudentBuilder{
        private int studentNumber;
        private String firstName;
        private String lastName;
        private int cellNumber;
        private String email;
       // private Identity identity;
        private Residence residence;
      //  private Contact contact;
// Builder setters
        public StudentBuilder setStudentNumber(int studentNumber){
            this.studentNumber = studentNumber;
            return this;
        }
        public StudentBuilder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public StudentBuilder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder setCellNumber(int cellNumber) {
            this.cellNumber = cellNumber;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        //        public StudentBuilder setIdentity(Identity identity){
//            this.identity = identity;
//            return this;
//        }
        public StudentBuilder setResidence(Residence residence){
            this.residence = residence;
            return this;
        }
//        public StudentBuilder setContact(Contact contact){
//            this.contact = contact;
//            return this;
//        }
//Builder constructor
        public StudentBuilder copy(Student s){
            this.studentNumber = s.studentNumber;
            this.firstName = s.firstName;
            this.lastName = s.lastName;
            this.residence = s.residence;
            this.cellNumber = s.cellNumber;
            this.email = s.email;


        return this;
        }
        //Method that collect all the variables under Student class
        public Student build(){
            return new Student(this);
        }
    }
}//End of Class
