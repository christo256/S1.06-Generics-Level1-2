package task1_Generics_Level2;

public class SemiGenericMethods<C, L> {

    private C arg1;
    private L arg2;
    private String arg3;

    public SemiGenericMethods(C arg1, L arg2, String arg3) {

        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    public C getArg1() {
        return arg1;
    }

    public L getArg2() {
        return arg2;
    }

    public String getArg3() {
        return arg3;
    }

    public void setArg1(C arg1) {
        this.arg1 = arg1;
    }

    public void setArg2(L arg2) {
        this.arg2 = arg2;
    }

    public void setArg3(String arg3) {
        this.arg3 = arg3;
    }

    public void show() {
        System.out.println(getArg1() + " - " + getArg2() + " - " + getArg3());
    }
}

