import java.util.Scanner;
class Largest{
    public static void main(String[] args){
        int a=0, b=0,c=0;
        Scanner sc=new Scanner(System.in);

           
           try{
            int x = 44;
            int y = x / 0;
            }catch(Exception ee){
                System.out.print("ReEnter first number:"+ee.getMessage());
                a=sc.nextInt();
            }
           

             System.out.print("Enter second  number:");
             b=sc.nextInt();
            

             System.out.print("Enter third number:");
            c=sc.nextInt();

            //checking largest number
            
            if(a>b && a>c){
                System.out.println(a + " is largest");
            }else if(b>a && b>c){
                System.out.println(b + " is largest");
                                
            }else{
                System.out.println(c + " is largest");
            
            

        }
    }
}