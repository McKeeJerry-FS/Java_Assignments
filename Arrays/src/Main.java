public class Main {
    public static void main(String[] args){
        // Problem #1: Sum of elements in an array
        int[] randomNumbers = {2, 4, 6};
        int sumOfRandomNumbers = randomNumbers[0] + randomNumbers[1] + randomNumbers[2];
        System.out.println(sumOfRandomNumbers);
        // end Problem #1

        // Problem #2: What is the output
        double[ ] exampleArray = {1,5,6,5,4,1};
        double maximum = exampleArray[0];
        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){
            if (exampleArray[ i ] > maximum) {
                maximum = exampleArray[ i ];
                index = i;
            }
        }

        System.out.println(index);
    }
    // Problem #3:
   public static void toPower()
   {
       int[] sizeArray;
       int size = 4;
       int power = 2;

   }
}













