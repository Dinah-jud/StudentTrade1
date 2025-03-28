package za.ac.cput.repository;
import za.ac.cput.domain.Service;
import java.util.List;

public interface IServiceRepository extends IRepository<Service, Integer> {
    
    List<Service> getAll();

}
