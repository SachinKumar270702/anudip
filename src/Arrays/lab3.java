package Arrays;

import java.util.Scanner;

public class lab3 {
    static Scanner sc;

    public  static int[] createArray(int n){
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public  static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void rotateClockwise(int[] arr, int k) {
        k=k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
     public static void rotateArrAntiClockWise(int[] arr, int d) {
        int n=arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
     public static int findIndex(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
    public static void replaceTarget(int[] arr,int target,int newValue){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                arr[i]=newValue;
        }
    }
    public static int[] insertAtStart(int[] arr){
        System.out.println("Enter the number to insert at start index: ");
        int num=sc.nextInt();
        int[] newArr=new int[arr.length+1];
        newArr[0]=num;
        for(int i=0;i<arr.length;i++){
            newArr[i+1]=arr[i];
        }
        return newArr;
    }
    public static int[] insertAtEnd(int[] arr){
        System.out.println("Enter the number to insert at end index: ");
        int num=sc.nextInt();
        int[] newArr=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        newArr[arr.length]=num;
        return newArr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lab3.sc = sc;
        System.out.println("Enter the number of elements in the array: ");
        int[] a=createArray(sc.nextInt());
        System.out.println("Array created: ");
        printArray(a);
        int choice;

        while(true){
            System.out.println("\n Welcome To Array Manipulation Game ");
            System.out.println("1. Rotate Array Clock Wise");
            System.out.println("2. Rotate Array Anti-Clock Wise");
            System.out.println("3. find Index of a target number");
            System.out.println("4. replace the target number with any number");
            System.out.println("5: insert a number at start index");
            System.out.println("6: insert a number at end index");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Number of times to rotate: ");
                    int k=sc.nextInt();
                    rotateClockwise(a,k);
                    System.out.println("Array after rotation: ");
                    printArray(a);
                    break;
                case 2:
                    System.out.println("Enter Number of times to rotate: ");
                    int d=sc.nextInt();
                    rotateArrAntiClockWise(a,d);
                    System.out.println("Array after rotation: ");
                    printArray(a);
                    break;
                case 3:
                    System.out.println("Enter the target number: ");
                    int target=sc.nextInt();
                    int index=findIndex(a,target);
                    System.out.println("Index of target number: "+index);
                    break;
                case 4:
                    System.out.println("Enter the target number: ");
                    int targetNum=sc.nextInt();
                    System.out.println("Enter the new value: ");
                    int newValue=sc.nextInt();
                    replaceTarget(a,targetNum,newValue);
                    System.out.println("Array after replacement: ");
                    printArray(a);
                    break;

                case 5:
                    a = insertAtStart(a);
                    System.out.println("Array after insertion: ");
                    printArray(a);
                    break;
                case 6:
                    a = insertAtEnd(a);
                    System.out.println("Array after insertion: ");
                    printArray(a);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }
    }
}
