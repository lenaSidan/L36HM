public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
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