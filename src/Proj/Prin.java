package Proj;

public class Prin {

    private String gett = "abc";
    private String sett = "dtaaaaa";
    String go = "!@#$";


    String f1 = "ffffff";
    String f2 = "ddd";

    public void print(String f1) {
        System.out.println(f1);
    }

    public Prin() {
        //empty
    }

    public Prin(String f1, String f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public Prin(String go){
        go = go;
    }

    //public Prin(String f1) {
    //    this.f1 = f1;
    //}

    public String getFirst() { return gett;}

    public void setFirst(String gett) {
        this.gett = gett;
    }
}
