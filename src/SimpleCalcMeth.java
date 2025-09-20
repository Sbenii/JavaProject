import java.sql.SQLOutput;
import java.util.Scanner;
public class SimpleCalcMeth {
    public static void main(String[] args){
        Scanner Input=new Scanner(System.in);
        double x,y;
        String Op ;
        System.out.print("Enter a sign for your operation among:+,-,/,* = ");
        Op=Input.nextLine();
        System.out.print("Enter the first number: ");
        x=Input.nextInt();
        System.out.print("Enter the second number: ");
        y=Input.nextInt();
        if(Op.equals("*")) {
            System.out.println("The product of the two numbers: " + MCalc(x, y));
        }
        else if (Op.equals("+")) {
            System.out.println("The sum of the two numbers: "+SCalc(x,y));
        }
        else if (Op.equals("-")) {
            System.out.println("The difference of the two numbers: "+SuCalc(x,y));
        }else {
            System.out.println("The quotient of the two numbers is: "+DCalc(x,y));
        }
    }
    public static double MCalc(double a, double b){
        return a*b;
    }
    public static double SCalc(double a,double b){
        return a+b;
    }
    public static double SuCalc(double a,double b){
        return a-b;
    }
    public static double DCalc(double a,double b){
        return a/b;
    }
}
