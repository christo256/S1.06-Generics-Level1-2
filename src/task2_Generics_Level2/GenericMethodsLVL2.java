package task2_Generics_Level2;

public class GenericMethodsLVL2 {
    public static <T> void printGeneric(T... args) {

        for (T arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }
}
