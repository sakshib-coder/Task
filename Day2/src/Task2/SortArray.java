package Task2;

import java.util.Scanner;

public class SortArray {
    public static  void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size=scanner.nextInt();
        int []arr=new int[size];
        System.out.println("Enter "+size +"elements");
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if (arr[j]>arr[j + 1]){
                    int temp =arr[j];
                    arr[j]=arr[j  +1];
                    arr[j + 1]=temp;
                }
            }
        }
        System.out.println("Sorted array in ascending order: ");
        for(int num:arr){
            System.out.println(num +" ");
        }
        scanner.close();
    }
}


