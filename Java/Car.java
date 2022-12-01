class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger;
    
    public Car(String license, Account driver){
        this.license = license; //this.license hace referencia a la variable global y license es la variable local.
        this.driver = driver;
        passenger = 3;
        System.out.println("Passenger: " + passenger);
    }

    void printDataCar(){
        System.out.println("License: " + license + " Driver: " + driver.name);
    }

}