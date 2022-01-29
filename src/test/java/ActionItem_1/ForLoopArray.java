package ActionItem_1;

public class ForLoopArray {
    public static void main(String[] args) {
        //create a String dynamic array for Zipcodes
        String[] Zipcode = new String[4]; //you set the limit for array
        //now define my values by the variables indexing
        Zipcode[0] = "11208";
        Zipcode[1] = "11201";
        Zipcode[2] = "11203";
        Zipcode[3] = "11204";
        //integer dynamic array
        int[] streetNumber = new int[4];
        streetNumber[0] = 105;
        streetNumber[1] = 106;
        streetNumber[2] = 107;
        streetNumber[3] = 108;

        for (int i = 0; i < Zipcode.length; i++){
            System.out.println("My Zipcode is " + Zipcode[i] + " and my street number is " + streetNumber[i]);


        }//end of loop

    }//end of main



}//End of Java class

