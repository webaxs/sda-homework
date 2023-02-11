package pro.sda.javaadvanced.garage;

public abstract class Vehicle  {
    private int maxSpeed;
    private Boolean washed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

}
