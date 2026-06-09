import java.util.Scanner;

//Addition of two number
class Addition{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            //taking input from user
            System.out.print("Enter first number: ");
            int a=sc.nextInt();
            
            System.out.print("Enter second number:");
            int b=sc.nextInt();

            int sum=a+b;
            System.out.println("sum = " + sum);

        }
}




//Arithmetic Operations

class Arithmetic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //taking input from the user
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();

        //performing calculation
        System.out.println("Addition = " + (a+b));
        System.out.println("Multiplication = " + (a*b));
        System.out.println("Subtraction = " + (a-b));
        System.out.println("Division = " + (a/b));
        System.out.println("Modulus = " + (a%b));

    }
}

//Swap two number
class Swap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //taking two number from the user
        System.out.print("Enter  value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter value of b: ");
        int b=sc.nextInt();

        //swapping values
        int temp=a;
        a=b;
        b=temp;

        System.out.println("A: " + a);
        System.out.println("B: " + b);

    }
}

//even or odd
class EvenOrOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();

        //checking even or odd
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
        
    }
}

//check positive,negative or zero
class check{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //taking input from the user
        System.out.print("Enter a number:");
        int n=sc.nextInt();

        //checking positive,negative or zero
        if(n>0){
            System.out.println("Number is positive");
        }else if(n<0){
            System.out.println("Number is Negative");
            
        }else{
             System.out.println("Number is Zero");

        }
    }
}