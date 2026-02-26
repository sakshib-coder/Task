package Task2;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 11, 15, 4, 100};
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }
            System.out.println("largest number is: " + largest);
            System.out.println("smallest number is: " + smallest);


        }
    }
}


