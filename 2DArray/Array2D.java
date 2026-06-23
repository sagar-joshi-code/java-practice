//first 2D array program
import java.util.Scanner;
// class First{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int arr[][]=new int[3][3];

//         System.out.println("Enter 9 element ");
//         //input
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 arr[i][j]=sc.nextInt();

//             }
//         }

//         System.out.println("Matrix: ");
//         //output
//           for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 System.out.print(arr[i][j] + " ");

//             }
//             System.out.println();
//         }
//     }
// }

//Sum of All Elements in a 2D Array
class Sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        int sum=0;

        System.out.println("enter 9 element");
        //input
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix: ");
        //output
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum= sum+arr[i][j];
            }
            System.out.println();
        }
        System.out.print("Sum: " + sum);
    }
}