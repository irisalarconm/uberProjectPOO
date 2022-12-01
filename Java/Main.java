class Main{
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "984513"),"Chevrolet", "2018");
        uberX.printDataCar();


        /*Car car2 = new Car("ATR456", new Account("Andreihna Herrera", "451687"));
        car2.printDataCar();*/
    }
}

//public -> todas las clases
//protected -> clases paques y subclases
//default -> clases y paquetes
//private -> clases