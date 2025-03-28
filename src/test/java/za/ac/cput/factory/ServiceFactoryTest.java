package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Service;
import za.ac.cput.domain.Student;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ServiceFactoryTest {

    private Service serviceExample1 = new Service.Builder().setServiceAvailabilityStatus("Not Available").setServiceType("Assistant Lecturer").build();
    private Service serviceExample2 = new Service.Builder().setServiceIdentification(001).setServiceType("Teaching").
            setServiceDescription("Physics extra Classes").setServiceRate(16.44).
            setServiceAvailabilityStatus("Busy").setServiceProvider("Asanda").build();
    private Service serviceExample3 = new Service.Builder().setServiceAvailabilityStatus("Not Available").setServiceType("Assistant Lecturer").build();


    @Test
    public void testCreateService(){
        assertNotNull(serviceExample1);
        System.out.println(serviceExample1.toString());
    }

    @Test
    public void testCreateServiceWithAllAttribute(){
        assertNotNull(serviceExample2);
        System.out.println(serviceExample2.toString());
    }

    @Test
    public void testCreateServiceThatFails(){
        fail();
        assertNotNull(serviceExample3);
        System.out.println(serviceExample3.toString());

    }

    @Test
    public void notImplemented(){}
  
}