import java.util.Arrays;

public class SortAndRemoveDuplicates {

    public static void main(String[] args) {
        removeDuplicates();
    }

    public static void removeDuplicates () {
        int[] inputArray = new int[]{2, 2, 2, 1, 7, 8, 91, 91, 91, 22, 22, 33, 43, 1, 2, 4, 2,1 , 6, 5,4,2, 1,3,2,1,3,1,3,4,3,2,1};
        System.out.println("Original Input - "+ Arrays.toString(inputArray));

        boolean flag = true;
        int temp;
        // Sort array in descending order o(n)
        while (flag){
            flag = false;
            for(int i=0; i<inputArray.length-1; i++){
                if(inputArray[i] < inputArray[i+1]){
                    temp = inputArray[i];
                    inputArray[i] = inputArray[i+1];
                    inputArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        // Remove duplicates
        int finalIndex = 0;
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
