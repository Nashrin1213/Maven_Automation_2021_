package ActionItem_1;

public class WhileLoopArray {
    public static void main(String[] args) {
        //create a String dynamic array for Zipcodes
        String[] zipcode = new String[4]; //you set the limit for array
        //now define my values by the variables indexing
        zipcode[0] = "11208";
        zipcode[1] = "11201";
        zipcode[2] = "11203";
        zipcode[3] = "11204";
        //integer dynamic array
        int[] streetNumber = new int[4];
        streetNumber[0] = 105;
        streetNumber[1] = 106;
        streetNumber[2] = 107;
        streetNumber[3] = 108;

        int i = 0;
        while (i<zipcode.length){
        System.out.println("My Zipcode is " + zipcode[i] + " and my street number is " + streetNumber[i]);
            i = i+1;

        }//end of loop

    }//end of main


}//End of java class
