package Day8_122621;

import java.util.ArrayList;

public class ArrayList_examples {
    public static void main(String[] args) {

      /*ArrayList is a resizable array which means you do not need to add the length
      to add more array values
       */
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Manhattan");

        //shortcut for print ln is sout lowercase
        System.out.println("My city is " + cities.get(2));

        ArrayList<Integer> streetNumber = new ArrayList<>();
        streetNumber.add(111);
        streetNumber.add(101);
        streetNumber.add(131);

        //System.out.println("My city is " + cities.get(2)) + " and my third house number is " + streetNumber.get(2);





    }//end of main method


}//end of java class
