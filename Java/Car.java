class Car {
    private Integer id;
    private String license;
    private Account driver;
    protected Integer passenger; //encapsulamiento
    
    public Car(String license, Account driver){
        this.license = license; //this.license hace referencia a la variable global y license es la variable local.
        this.driver = driver;
    }

    void printDataCar(){
        if(passenger != null){
        System.out.println("License: " + license + " Driver: " + driver.name + " Passenger : " + passenger);
        }
    }

    public Integer getPassenger(){
        return passenger;
    }
    public void setPassenger(Integer passenger){
        if(passenger == 4){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
        
    }

    public Integer getId() {
        return id;
    }

    public String getLicense() {
        return license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }
    
    
}