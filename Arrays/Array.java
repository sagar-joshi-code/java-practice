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

//Reverse Array
class Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.print("Enter 5 number: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Reversed array: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

    }
}

//Count Even and Odd Numbers in an Array
class CountEvenOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [5];
        int even=0;
        int odd=0;
        System.out.print("Enter 5 number : \n");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Even and odd number : \n");
                for(int i=0;i<arr.length;i++){
                    if(arr[i] % 2 == 0){
                        even ++;
                    }else{
                        odd ++;
                    }
                }
                    System.out.println("Even : " + even);
                    System.out.println("Odd : " + odd);

        

    }
}

//Count Frequency of an Element
class CheckFrequency{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int Count=0;
        System.out.print("Enter 5 number : \n");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("Checking Frequency : ");
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                Count++;
            }

        }

            System.out.println("Frequency : " + Count);

    }
}

//Copy One Array into Another Array
class CopyArr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int copy[]=new int[5];

        System.out.print("Enter 5 element : \n");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //copying element
        for(int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }

        System.out.print("Copied Element : \n");
        for(int i=0;i<arr.length;i++){
            System.out.println(copy[i]);
        }
    }
}


//Second Largest Element in Array
class SecondLargest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];

        System.out.print("Enter 5 element: \n");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int secondlargest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondlargest){
                secondlargest=arr[i];
            }
        }
        System.out.println("Largest= " + largest);
        System.out.println("SecondLargest= " + secondlargest);
    }
}