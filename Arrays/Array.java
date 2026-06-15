import java.util.Scanner;
//first array program
class ArrayDemo{
    public static void main(String[] args){
        int arr[]={10,20,30,40,50};
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }

    }
}

//Input and Display Array
class Array{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[10];
    System.out.print("ENter 10 number");
    for(int i=0;i<10;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<10;i++){
        System.out.println(arr[i]);
    }
   }
}

//sum of array element
class Sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int sum=0;
        System.out.print("ENter 5 number: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Sum= " + sum);
    }
}
//largest element in array
class Largest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
       System.out.print("Enter 5 number: ");
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
       }
       int largest=arr[0];
       for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
       }
       System.out.println("Largest = " + largest);
       
    }
}

//smallest element in array
class Smallest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.print("Enter 5 number: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest = " + smallest);
    }
}

//Find the Average of Array Elements 
class Average{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int sum=0;
        System.out.print("enter 5 number: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
           double avg=sum/arr.length;
            System.out.println("Average = " + avg);
    

    }
}

//Search an Element in an Array
class Search{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.print("Enter 5 number: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Search element: ");
        int key=sc.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }

    }
}