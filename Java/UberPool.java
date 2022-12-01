class UberPool extends Car {
    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model){ //viene de la clase padre
        super(license, driver); //llama al metodo constructor de la clase padre - atributos y metodos
        this.brand = brand;
        this.model = model;
    }
    
}