public class TestRun {
    public static void main(String args[]) {
        MyClass c1 = new MyClass();
        MyClass c2 = new MyClass();
        c1.iVal = 40;
        c2.iVal = 50;
        duplicate(c1, c2);
        System.out.print(c1.iVal);
        System.out.print(" ");
        System.out.println(c2.iVal);
    }

    static void duplicate(MyClass x, MyClass y) {
        int temp = x.iVal;
        y.iVal = temp;
    }
}
