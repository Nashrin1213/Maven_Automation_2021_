package ActionItem_2;

public class WhileLoopConditionalArrayA2 {
    public static void main(String[] args) {
        //create a dynamic array for 4 different states, iterate through the values but only print when state is
        //either New York or Texas
        String[] states = new String[4];
        states[0] = "New York";
        states[1] = "California";
        states[2] = "Pennsylvania";
        states[3] = "Texas";

         int i = 0;
        while (i <states.length) {
            //two if conditions
            if (states[i] == "New York") {
                System.out.println("State is " + states[i]);
            } else if (states[i] == "Texas") {
                System.out.println("State is " + states[i]);
            }//end of condition

                i++;
        }//end of while loop


    }//end of main method

}//End of java class

