package pro.sda.javaadvanced.garage;

public interface Washing {
    default Boolean wash() {
        return true;
    }
}
