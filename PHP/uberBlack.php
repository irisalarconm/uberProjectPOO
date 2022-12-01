<?php

require_once('car.php');


class UberBlack extends Car {
    public $typeCarAccepted;
    public $seatsMaterial;

    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial)
    {
        parent::__construct($license, $driver);
        $this->typeCarAccepted    = $typeCarAccepted;
        $this->seatsMaterial    = $seatsMaterial;       
    }

    function centuryFromYear($year) {
        return ceil($year / 100);
    }
    function checkPalindrome($inputString) {
        echo(strrev($inputString) == $inputString);
    }
    function almostIncreasingSequence($sequence) {
        $mistakes = 0;
        
        for($i = 0; $i < count($sequence) -1; $i++){
            if($sequence[$i] >= $sequence[$i+1]){
                if(count($sequence) > $i+2 && 
                   $sequence[$i] >= $sequence[$i+2] &&
                   $i > 0 && 
                   $sequence[$i-1] >= $sequence[$i+1]){
                       echo false;
                   }
                   else
                        $mistakes++;
            }
            
            if($mistakes > 1)
                echo false;
        }
        
        echo true;
    }

}
