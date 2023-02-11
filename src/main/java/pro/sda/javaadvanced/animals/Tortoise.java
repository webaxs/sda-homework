package pro.sda.javaadvanced.animals;

public class Tortoise extends Animal {

    @Override
    public void setAge(Integer age) {
        if (age >= 300) {
            System.out.println("Too old for a tortoise, should be dead or not a tortoise.");
            return;
        }
        super.setAge(age);
    }
}
