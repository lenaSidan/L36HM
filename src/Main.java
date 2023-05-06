import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Passenger>passengers= List.of(
                new Passenger("Jack Peter"),
                new Passenger("Bob Snow"),
                new Passenger("Anna May"),
                new Passenger("Bobby Klaus"),
                new Passenger("Maria Dorris")
        );
        Passenger jack = new Passenger("Jack Peter");
        Passenger bob = new Passenger("Bob Snow");
        Passenger anna = new Passenger("Anna May");
        Passenger bobby = new Passenger("Bobby Klaus");
        Passenger maria = new Passenger("Maria Dorris");

        Ship allureOfTheSeas = new Ship("Allure of the Seas", 4, 22,"Капитан Грей");
        System.out.println(allureOfTheSeas);
        allureOfTheSeas.captainGreeting();
        System.out.println("Список пассажиров: "+passengers);
        allureOfTheSeas.pickPassenger(jack);
        allureOfTheSeas.pickPassenger(bob);
        allureOfTheSeas.pickPassenger(anna);
        allureOfTheSeas.pickPassenger(bobby);
        allureOfTheSeas.pickPassenger(maria);
        allureOfTheSeas.dropPassenger("Olaf Kung");
        allureOfTheSeas.dropPassenger("Anna May");
        allureOfTheSeas.pickPassenger(maria);
    }
}
/*
Создайте класс Passenger с полями:
name;

Создайте базовый класс Transport c приватными полями:
title
capacity - вместимость транспортного средства
List<Passenger> passengers = new ArrayList<>(); -
speed - максимальная скорость работы
Пусть в классе будет метод:
printPassengers(), который выводит всех пассажиров в печать.
pickPassenger(Passenger passenger) - метод добавляет пассажира на борт, если транспорт не заполнен (см. capacity).
(дополнительно) dropPassenger(String passengerName) - метод высаживает пассажира c указанным именем.

Создайте производный от Transport класс Ship (корабль) с полями:
captainName - имя капитана.
И методом:
captainGreeting() - метод выводит в консоль фразу "Капитан <имя капитана> приветствует вас на борту <название транспортного средства>"
 */