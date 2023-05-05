import java.util.List;

public class Passenger extends Transport{
    private String name;

    public Passenger(String title, double capacity, List<Passenger> passengers, double speed, String name) {
        super(title, capacity, passengers, speed);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
/*
Создайте класс Passenger с полями:

name;
 */
