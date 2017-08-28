public class MyClass {
    public int iVal;

    void duplicate(MyClass x, MyClass y) {
        int temp = x.iVal;
        y.iVal = temp;
    }
}
