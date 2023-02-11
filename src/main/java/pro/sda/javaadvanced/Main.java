package pro.sda.javaadvanced;

public class Main {
    public static void main(String[] args) throws NumberFormatException{

            acceptValueAndPrint(2.15D);


    }

    private static void acceptValueAndPrint(Object o) throws  NumberFormatException{
        System.out.println(detectDatatype(o.toString()));
    }

    private static String detectDatatype(Object o) throws NumberFormatException {
        String output = "";
        //typecasting

        try {
            Integer o1 = Integer.parseInt(o.toString());
            output = "int -> " + o1;
            return output;
        } catch (NumberFormatException er){
            System.out.println("Error! " + "Number format exception");
        }

        return output;
    }
}