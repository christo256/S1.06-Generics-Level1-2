package task2_Generics_level1;

public class GenericMethods {
    public static <T, U, V> void printArguments( T arg1, U arg2, V arg3) {
        System.out.println(arg1 + " - " + arg2 + " - " + arg3);
    }
}
