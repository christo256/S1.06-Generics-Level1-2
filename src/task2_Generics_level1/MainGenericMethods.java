package task2_Generics_level1;

public class MainGenericMethods {
    public static void main(String[] args) {

        Person person = new Person("Rafael", "Dominguez", 35);

        GenericMethods.printArguments(person, 45, 67.9);
        GenericMethods.printArguments(46, person, 79.1);
        GenericMethods.printArguments("A", "B", "C");
    }
}
