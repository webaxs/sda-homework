package pro.sda.javaadvanced.animals;

//Model classes
public class Dog extends Animal {
    private String name;
    // "M" "F"
    private Gender gender;
    private Integer weight;
    private String breed;

    private Color color;


    @Override
    public void setAge(Integer age) {
        if (age >= 20) {
            System.out.println("Too old for a dog, should be dead or not a dog.");
            return;
        }
        super.setAge(age);
    }

    //All args constructor
    public Dog(String name, Integer age, Gender gender, Integer weight, String breed, Color color) {
        this.name = name;
        super.setAge(age);
        this.gender = gender;
        setWeight(weight);
        this.breed = breed;
        this.color = color;
        super.getDomain();
    }

    public Dog Dog(String gender, String race) {
        new Dog("Sparky", 1, Gender.F, 1, race, Color.WHITE);
       return new Dog("Sparky", 1, Gender.M, 1, race, Color.WHITE);
    }



    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        if (weight <= 0) {
            System.out.println("Incorrect weight was specified. Please, use values greater than zero!");
            return;
        }
        this.weight = weight;
    }
}
