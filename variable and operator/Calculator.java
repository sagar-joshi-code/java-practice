import java.util.Scanner;
class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //taking input from user
        System.out.print("Enter first number: ");
        int a=sc.nextInt();

        System.out.print("Enter second number: ");
        int b=sc.nextInt();

        char op=sc.next().charAt(0);

        switch(op){
            case '+':
                System.out.println(a+b);
                break;

                case '-':
                    System.out.println(a-b);
                break;

                case '*':
                    System.out.println(a*b);
                    break;

                    case '/':
                        System.out.println(a/b);
                        break;

                        default:
                            System.out.println("Wrong input");
                    

        }

    }
}
