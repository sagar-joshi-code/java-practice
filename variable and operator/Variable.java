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