package za.ac.cput.factory;
import za.ac.cput.domain.Service;
import za.ac.cput.util.ServiceHelper;
import za.ac.cput.domain.Student;

public class ServiceFactory {

    public static Service createService(int serviceId, String serviceType, String serviceDescription,
                                        double serviceRate, String serviceAvailabilityStatus, Student serviceProvider){

        if(ServiceHelper.isNullOrEmpty(serviceId) || ServiceHelper.isProvideVerified(serviceProvider)){
            return null;
        }

        return new Service.Builder().setServiceIdentification(serviceId).setServiceDescription(serviceDescription).
                setServiceType(serviceType).setServiceRate(serviceRate).setServiceProvider(serviceProvider).
                setServiceAvailabilityStatus(serviceAvailabilityStatus).build();

    }
}
