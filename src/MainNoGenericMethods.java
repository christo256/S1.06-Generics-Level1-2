public class MainNoGenericMethods {
    public static void main(String[] args) {

        NoGenericMethods obj = new NoGenericMethods("Hello", 999, 47.5);
        obj.show();

        NoGenericMethods obj2 = new NoGenericMethods(999, "Hello", 47.5);
        obj2.show();

        obj.setArg1("Bye");
        obj.setArg2(333);
        obj.setArg3(20.1);
        obj.show();
    }
}
