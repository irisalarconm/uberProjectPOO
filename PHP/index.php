<?php
require_once('car.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('uberBlack.php');
require_once('uberVan.php');
require_once('account.php');


$uberX = new UberX("ASO154", new Account("Felipe Solorno","1022254824"), "Chevrolet", "2018");
$uberX->setPassenger(2);
$uberX->printDataCar();
$uberPool = new UberPool("KMT123", new Account("Rosa Melano","10564514"), "KIA", "2012");
$uberPool->setPassenger(2);
$uberPool->printDataCar();
$uberVan = new UberVan("KMT123", new Account("Penelope Cruz","15486541"), "Camaro", "2014");
$uberVan->setPassenger(2);
$uberVan->printDataCar();
