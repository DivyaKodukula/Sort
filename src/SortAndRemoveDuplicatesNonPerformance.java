import java.util.Arrays;

public class SortAndRemoveDuplicatesNonPerformance {

    public static void main(String[] args) throws Exception {
        removeDuplicates();
    }

    public static void removeDuplicates () {
        int[] inputArray = new int[]{2, 2, 2, 1, 7, 8, 91, 22, 33, 43, 1, 2, 4, 2,1 , 6, 5,4,2, 1,3,2,1,3,1,3,4,3,2,1};
        System.out.println("Original Input - "+ Arrays.toString(inputArray));

       // Sort array in descending order o(n)*o(n)
            int temp;
            for(int i=0;i<inputArray.length-1;i++){
                for(int j=0;j<inputArray.length-1;j++){
                    if(inputArray[j] < inputArray[j+1]){   // use > for Ascending order
                        temp = inputArray[j+1];
                        inputArray[j+1] = inputArray[j];
                        inputArray[j]=temp;
                    }
                }
            }
        // Remove duplicates
        int finalIndex = 0; // Slow moving index
        for (int a = 1; a < inputArray.length; a++) {
            if (inputArray[finalIndex] != inputArray[a]) {
                finalIndex++;
                inputArray[finalIndex] = inputArray[a];
            }
        }

        //Print the output as array
        int[] result = new int[finalIndex+1];
        for (int x = 0; x < finalIndex+1; x++) {
            result[x] = inputArray[x];
        }
        System.out.println("Result in Descending Order - "+Arrays.toString(result));
    }
}
