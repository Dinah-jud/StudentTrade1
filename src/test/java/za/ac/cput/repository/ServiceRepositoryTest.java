package za.ac.cput.repository;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import za.ac.cput.domain.Service;
import za.ac.cput.factory.ServiceFactory;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ServiceRepositoryTest {

    private static IServiceRepository repository = ServiceRepository.getRepository();

    private Service service = ServiceFactory.createService(12,"Tutor","Tutoring service ADP",
            4.5, "Available", "Asanda");


    @Test
    void a_create(){
        Service created = repository.create(service);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    void b_read(){
        Service read = repository.read(service.getServiceIdentification());
        assertNotNull(read);
        System.out.println(read.toString());
    }

    @Test
    void c_update(){
        Service newService = new Service.Builder().copy(service).setServiceType("Hairstylin").
                setServiceDescription("Getting new hair cut").setServiceRate(2.55).build();

        Service updated = repository.update(newService);
        assertNotNull(updated);
        System.out.println(updated.toString());
    }

    @Test
    @Disabled
    void d_delete(){
        assertTrue(repository.delete(service.getServiceIdentification()));
        System.out.println("Deleted service: " + service.getServiceIdentification());
    }

    @Test
    void e_getAll(){
        System.out.println(repository.getAll());
    }

}