import java.util.List;

public class Ship extends Transport{
    private String captainName;

    public Ship(String title, int capacity, double speed, String captainName) {
        super(title, capacity, speed);
        this.captainName = captainName;
    }

    @Override
    public String toString() {
        return "Вас приветствует " + captainName+"." +
                  super.toString();
    }
    public String getCaptainName() {
        return captainName;
    }
    public void setCaptainName(String captainName) {
        this.captainName = captainName;
    }
    public void captainGreeting(){
        System.out.println("Добро пожаловать на борт!");
    }
}
/*
Создайте производный от Transport класс Ship (корабль) с полями:
captainName - имя капитана.
И методом:
captainGreeting() - метод выводит в консоль фразу "Капитан <имя капитана> приветствует вас на борту <название транспортного средства>"
 */
