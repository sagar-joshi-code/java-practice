import java.util.Scanner;
//Print 1 to 10
class Number{
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}

//print number according to user
class Print{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        System.out.println("You entered: ");

        for(int i=0;i<=n;i++){
            System.out.println(i);
        }

    }
}

//sum of first N number
class SumN{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int sum=0;

        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum is " + sum);



    }
}

//print multiplication table
class Table{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number for multiplication table:");
        int n=sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n + "x" + i + "=" + n*i);
        }

    }
}

//factorial of given number
class Factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial= " + fact);
    }
}

