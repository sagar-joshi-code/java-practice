import java.util.Scanner;
//practiced program using all datatype
class datatype{
    public static void main(String[] args){
        String name="Sagar joshi";
        boolean passed=true;
        char grade='A';
        double marks=85.5;
        int age=20;
        System.out.println(name);
        System.out.println(passed);
        System.out.println(grade);
        System.out.println(marks);
        System.out.println(age);
    }
}

//practice program
// Write a program named StudentInfo.java that prints:

// Name: Sagar Joshi
// Age: 19
// Semester: 2
// Grade: A
class student{
    public static void main(String[] args){
        String name="Sagar joshi";
        int age=20;
        int semester=2;
        char grade='A';
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Semester:" + semester);
        System.out.println("Grade:" + grade);
    }
}

// class Hello{
//     public static void main(String[] args){
//         int age=20;
//         String name="Sagar";
//         System.out.printf("Name=%s\n",name);
//         System.out.printf("Age=%d\n",age);
//     }
// }

//command line argument
class CommandLine{
    public static void main(String[] args){
        System.out.println(args[0]);
         System.out.println(args[1]);
        
    }
}

//Taking Integer Input Using Scanner
class InputDemo{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        System.out.println("Number= " + n);
    }
}

//Taking String Input Using Scanner
class NameInput{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter name: ");
        String name=sc.nextLine();
        System.out.println("Name = " + name);
    }
}
//takinf string and integer both
class Both{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        System.out.print("Enter age: ");
        int age=sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Simple Student Information System

class StudentInfo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        System.out.print("Enter Roll: ");
        int roll=sc.nextInt();

        System.out.println("\n----- Student Information -----");
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + roll);
    }
}