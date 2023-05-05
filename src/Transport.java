import java.util.ArrayList;
import java.util.List;

public class Transport {
    private String title;
    private double capacity;
    private List<Passenger> passengers = new ArrayList<>();
    private  double speed;

    public Transport(String title, double capacity, List<Passenger> passengers, double speed) {
        this.title = title;
        this.capacity = capacity;
        this.passengers = passengers;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "title='" + title + '\'' +
                ", capacity=" + capacity +
                ", passengers=" + passengers +
                ", speed=" + speed +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public static void printPassengers(){

    }
}
/*
Создайте базовый класс Transport c приватными полями:
title
capacity - вместимость транспортного средства
List<Passenger> passengers = new ArrayList<>(); -
speed - максимальная скорость работы
Пусть в классе будет метод:

printPassengers(), который выводит всех пассажиров в печать.
pickPassenger(Passenger passenger) - метод добавляет пассажира на борт, если транспорт не заполнен (см. capacity).
(дополнительно) dropPassenger(String passengerName) - метод высаживает пассажира c указанным именем.
 */
