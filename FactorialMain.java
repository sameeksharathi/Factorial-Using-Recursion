import java.util.Scanner;

class FactorialMain{
    public static void main(String[] args) {
        FactorialUsingRecursion obj =new FactorialUsingRecursion();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        System.out.println(obj.fact(sc.nextInt()));
    }
}
