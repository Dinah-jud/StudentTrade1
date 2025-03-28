package za.ac.cput.domain;



public class Service {
    private int serviceIdentification;
    private String serviceType;
    private String serviceDescription;
    private double serviceRate;
    private String serviceAvailabilityStatus;
    private String serviceProvider;

    private Service(){}

    private Service(Builder builder){
        this.serviceIdentification = builder.serviceIdentification;
        this.serviceType = builder.serviceType;
        this.serviceDescription = builder.serviceDescription;
        this.serviceRate = builder.serviceRate;
        this.serviceAvailabilityStatus = builder.serviceAvailabilityStatus;
        this.serviceProvider = builder.serviceProvider;
    }

    public int getServiceIdentification() {
        return serviceIdentification;
    }

    public String getServiceType() {
        return serviceType;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public double getServiceRate() {
        return serviceRate;
    }

    public String getServiceAvailabilityStatus() {
        return serviceAvailabilityStatus;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceIdentification=" + serviceIdentification +
                ", serviceType='" + serviceType + '\'' +
                ", serviceDescription='" + serviceDescription + '\'' +
                ", serviceRate=" + serviceRate +
                ", serviceAvailabilityStatus='" + serviceAvailabilityStatus + '\'' +
                ", serviceProvider=" + serviceProvider +
                '}';
    }

    public static class Builder{
        private int serviceIdentification;
        private String serviceType;
        private String serviceDescription;
        private double serviceRate;
        private String serviceAvailabilityStatus;
        private String serviceProvider;

        public Builder setServiceIdentification(int serviceIdentification) {
            this.serviceIdentification = serviceIdentification;
            return this;
        }

        public Builder setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        public Builder setServiceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
            return this;
        }

        public Builder setServiceRate(double serviceRate) {
            this.serviceRate = serviceRate;
            return this;
        }

        public Builder setServiceAvailabilityStatus(String serviceAvailabilityStatus) {
            this.serviceAvailabilityStatus = serviceAvailabilityStatus;
            return this;
        }

        public Builder setServiceProvider(String serviceProvider) {
            this.serviceProvider = serviceProvider;
            return this;
        }
        
        public Builder copy(Service service){
            this.serviceIdentification = service.serviceIdentification;
            this.serviceType = service.serviceType;
            this.serviceDescription = service.serviceDescription;
            this.serviceRate = service.serviceRate;
            this.serviceAvailabilityStatus = service.serviceAvailabilityStatus;
            this.serviceProvider = service.serviceProvider;

            return this;
        }

        public Service build(){
            return new Service(this);
        }
    }
}
