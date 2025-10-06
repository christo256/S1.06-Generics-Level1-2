package task1_Generics_level1;

public class NoGenericMethods {

    private Object arg1, arg2, arg3;

    public NoGenericMethods(Object a, Object b, Object c) {

        this.arg1 = a;
        this.arg2 = b;
        this.arg3 = c;

    }

    public Object getArg1() {
        return arg1;
    }

    public Object getArg2() {
        return arg2;
    }

    public Object getArg3() {
        return arg3;
    }

    public void setArg1(Object arg1) {
        this.arg1 = arg1;
    }

    public void setArg2(Object arg2) {
        this.arg2 = arg2;
    }

    public void setArg3(Object arg3) {
        this.arg3 = arg3;
    }

    public void show() {
        System.out.println(getArg1() + " - " + getArg2() + " - " + getArg3());
    }
}




