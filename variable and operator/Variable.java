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

//using switch case statement perform Day of Week Program
class DayWeek{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a day from 1-7: ");
        int day=sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Sunday");
                break;

                case 2:
                    System.out.println("Monday");
                    break;

                    case 3:
                        System.out.println("Tuesday");
                    break;

                    case 4:
                        System.out.println("Wednesday");
                    break;

                    case 5:
                        System.out.println("Thursday");
                    break;

                    case 6:
                        System.out.println("Friday");
                    break;

                    case 7:
                        System.out.println("Saturday");
                    break;

                    default:
                        System.out.println("Invalid choice");




        }
    }
}


//Menu-Driven Calculator
class MenuCal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("........Menu.......");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        System.out.println("Enter choice: ");
        int choice=sc.nextInt();

        System.out.println("Enter first number: ");
        int a=sc.nextInt();

         System.out.println("Enter second number: ");
        int b=sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Addition = " + ( a+b));
                break;

        

           case 2:
                System.out.println("Subtraction = " + ( a-b));
                break;
        

           case 3:
                System.out.println("Multiplication = " + ( a*b));
                break;
        

           case 4:
                System.out.println("Division = " + ( a/b));
                break;
        

        default:
            System.out.println("Invalid choice");



        }
    }
}