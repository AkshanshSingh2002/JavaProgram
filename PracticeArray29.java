public class PracticeArray29 {

    public static void main(String[] args) {
        
        //Practice Question
        /* 
        float sum = 0.0f;
        float[] num = {96.5f, 75.5f, 85.5f, 85.5f, 65.5f};
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("The sum of 5 float number is: "  + sum);
        */ 

        /* 
        //Practice Question
        boolean isInArray = false; 
        int givenInt = 67;
        int[] givenIntArray = {56, 76, 67, 87, 66, 76};
        for (int i : givenIntArray) {
            if (givenInt == i) {
                isInArray = true;
                break;               
            }
        }
        if (isInArray) {
            System.out.println("Given integer is in array");
        } else {
            System.out.println("Given integer is not in array");
        }
        */


        //Practice Question
        /*
        float[] marks = {87.f, 98.0f, 65.0f, 45.5f, 65.5f};
        float aveMarks = 0.0f;
        float sum = 0.0f;
        for (float f : marks) {
            sum += f;
        }
        aveMarks = sum / marks.length;
        System.out.println("Average marks of Students are: " + aveMarks);
        */

        //Practice Question
        /*  
        int[][] Array1 = { {1, 2, 3},
                           {4, 5, 6}};
        int[][] Array2 = { {7, 8, 9},
                           {10, 11, 12}};
        int[][] ArrayResult = { {0, 0, 0},
                                {0, 0, 0}};                   
        
        for (int i = 0; i < Array1.length; i++) {                     // row number of times
            for (int j = 0; j < Array1[i].length; j++) {              // column number of times
                //System.out.format("Setting for i = %d and j = %d \n", i, j);
                ArrayResult[i][j] = Array1[i][j] + Array2[i][j];
                System.out.print(ArrayResult[i][j] + " ");     
            }
            System.out.println("");
        }
        */

        //Practice Question: print given array in reverse order
        /*
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        
        for (int i = 0; i < n; i++) {
            // Swaping a[i] and a[l-1-i]
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        */

        //Practice Question
        /* 
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int min = 2147483647;
        int max = -2147483647;
        for (int i : arr) {
            if (i<min) {
               min = i;  
            }
        }
        System.out.println("The minimum value of the elemant is: " + min);
        
        for (int i : arr) {
            if (i>max) {
                max = i;
            }
        }
        System.out.println("The maximum value of the elemant is: " + max);
        */

        //Practice Question
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        boolean isSorted = true;

        for (int index = 0; index < arr.length-1; index++) {
            if (arr[index]>arr[index+1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Array is Sorted");
        } else{
            System.out.println("Array is not Sorted");
        }
    }
}