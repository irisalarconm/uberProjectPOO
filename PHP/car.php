<?php
require_once('account.php');

class Car {
    public  $id;
    public  $license;
    public  $driver;
    protected $passenger;

    public function __construct($license, Account $driver)
    {
        $this->license  = $license;
        $this->driver   = $driver;       
    }

    public function printDataCar(){
        if($this->passenger != null){
        echo "
        License : $this->license 
        Conductor: {$this->driver->name}
        Document: {$this->driver->document} 
        Passengers: $this->passenger
        
        ";
        }
    }

    public function getPassenger(){
        return $this->passenger;
    }

    public function setPassenger($passenger){

        if($passenger == 4){
            $this->passenger = $passenger;
        }else{
            echo " Necesitas asignar 4 pasajeros";
        }
    }
}