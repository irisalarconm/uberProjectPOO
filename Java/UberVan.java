import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){ //viene de la clase padre
        super(license, driver); //llama al metodo constructor de la clase padre - atributos y metodos
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
    public UberVan(String license, Account driver){ //viene de la clase padre
        super(license, driver); //llama al metodo constructor de la clase padre - atributos y metodos
    }



    @Override
    public void setPassenger(Integer passenger){
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 6 pasajeros");
        }
     }    
}

