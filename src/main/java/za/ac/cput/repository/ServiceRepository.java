package za.ac.cput.repository;
import za.ac.cput.domain.Service;
import java.util.List;
import java.util.ArrayList;

public class ServiceRepository implements IServiceRepository {

    private static IServiceRepository repository = null;
    private List<Service> serviceList;

    private ServiceRepository(){
        serviceList = new ArrayList<Service >();
    }

    public static IServiceRepository getRepository(){
        if(repository== null){
            repository = new ServiceRepository();
        }
        return repository;
    }

    @Override
    public Service create(Service service) {
        boolean serviceCreated = serviceList.add(service);

        if(serviceCreated){
            return service;
        }
        return null;
    }

    @Override
    public Service read(Integer serviceId) {
        if(serviceId == null){
            return null;
        }

        for (Service service: serviceList){
            if (service.getServiceIdentification() == serviceId){
                return service;
            }
        }

        return null;
    }

    @Override
    public Service update(Service service) {

        int id = service.getServiceIdentification();
        Service oldService = read(id);

        if(oldService == null){
            return null;
        }

        boolean success = delete(id);
        if(success){
            if (serviceList.add(service)){
                return service;
            }
        }
        return null;
    }

    @Override
    public boolean delete(Integer serviceId) {
        Service serviceToDelete = read(serviceId);

        if(serviceId == null){
            return false;
        }

        return serviceList.remove(serviceToDelete);
    }

    @Override
    public List<Service> getAll() {
        return serviceList;
    }

}
