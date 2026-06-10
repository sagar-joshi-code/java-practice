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