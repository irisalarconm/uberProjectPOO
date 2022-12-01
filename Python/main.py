from car import Car
from account import Account

if __name__=="__main__":
    print("Hola Mundo")
    
    car = Car("AMD432", Account("Andres Herrera","102035645"))
    print(vars(car))
    print(vars(car.driver))
    
    car2 = Car("SRT325", Account("Andreihna Herrera","102521458"))
    print(vars(car2))
    print(vars(car2.driver))