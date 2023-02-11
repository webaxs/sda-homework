package pro.sda.javaadvanced.animals;

public class Animal {
    private String domain;
    private String scientificName;

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age >= 0) {
            System.out.println("Incorrect age was specified. Please, use values greater than zero!");
            return;
        }
        this.age = age;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
