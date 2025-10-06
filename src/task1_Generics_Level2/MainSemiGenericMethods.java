package task1_Generics_Level2;

public class MainSemiGenericMethods {
    public static void main(String[] args) {

        SemiGenericMethods<String, Integer> obj1 = new SemiGenericMethods<>("Hello", 22, "Bye");
        obj1.show();

        obj1.setArg1("Hi");
        obj1.setArg2(88);
        obj1.setArg3("Updated message");
        obj1.show();

        SemiGenericMethods<Double, Boolean> obj2 = new SemiGenericMethods<>(42.5, false, "God");
        obj2.show();

        SemiGenericMethods<Double, String> obj3 = new SemiGenericMethods<>(99.9, "Value", "End");
        obj3.show();


    }
}
