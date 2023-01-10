public class Petuh implements Flyable1{
    private String name;
    private int speed;

    public Petuh(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void notfly() {
        System.out.println("самый медленны");
    }

    @Override
    public String toString() {
        return "Petuh{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
