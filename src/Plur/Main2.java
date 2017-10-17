package Plur;

public class Main2 {
    public static void main(String args[]) {
        Passenger bob = new Passenger();
        //bob.setCheckedBags(3);

        //Passenger jane = new Passenger(2,3);

//        System.out.println(jane.getCheckedBags());
//        System.out.println(jane.getFreeBags());

        Passenger cheapJoe = new Passenger();
        //System.out.println(cheapJoe.getPerBagFee());

        Passenger fred = new Passenger(2);
        Passenger jane = new Passenger(0,3);
        System.out.println(fred.getPerBagFee());
        System.out.println(fred.getFreeBags());
        System.out.println(fred.getCheckedBags());
        System.out.println(jane.getPerBagFee());
        System.out.println(jane.getFreeBags());
        System.out.println(jane.getCheckedBags());

    }
}
