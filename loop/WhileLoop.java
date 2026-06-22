//While-loop
// while(condition){
//     //code 
// }


//Sum of First 10 Numbers Using While Loop
class Sum{
    public static void main(String[] args){
        int i=1;
        int sum=0;
        while(i<=10){
            sum+=i;
            i++;
        }
        System.out.println("sum = " + sum);
    }
}

//do-while loop
// do{
//     //code
// }while(condition);

//print 1-5
class Print{
    public static void main(String[] args){
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=5);
    }
}

//Sum of First 10 Numbers Using While Loop
class Add{
    public static void main(String[] args){
        int i=1;
        int sum=0;
        do{
            sum+=i;
            i++;
        }while(i<=10);
        System.out.println(sum);
    }
}

//Enhanced for-each Loop
class ForEach{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        for(int a:arr){
            System.out.println(a);
        }
    }
}

//break statement
class Break{
    public static void main(String[] args){
        for(int i=1;i<11;i++){
            if(i==7){
                continue;
            }
            System.out.println(i);
        }
    }
}

//return 
class ReturnDemo{
    public static void main(String[] args){
        for(int i=1;i<11;i++){
            if(i==5){
                return;
            }
            System.out.println(i);
        }
        System.out.println("Start");
    }
}

//nested loop
// program 1
class NestedLoop{
    public static void main(String[] args){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//program 2
class Pattern1{
    public static void main(String[] args){
        for(int i=1;i<=3;i++){

    for(int j=1;j<=i;j++){
        System.out.print("* ");
    }

    System.out.println();
}
    }
}

//program 3
class Pattern2{
    public static void main(String[] args){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
            
        }
    }
}


