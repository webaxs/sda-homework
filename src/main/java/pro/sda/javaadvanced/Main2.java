package pro.sda.javaadvanced;

public class Main2 {
    public static void main(String[] args) {
        acceptValueAndPrint(2.15D);
    }

    private static void acceptValueAndPrint(Object o) {
        System.out.println(detectDatatype(o.toString()));
    }

    private static String detectDatatype(Object o) {
        String output = "";
        //typecasting
        try {
            Integer o1 = Integer.parseInt(o.toString());
            output = "int -> " + o1;
        } catch (Exception ew) {

            try {

            } catch (Exception eee) {
                try {

                } catch (Exception eeeee) {

                }
            }

            System.exit(1);
        }
        return output;
    }
}