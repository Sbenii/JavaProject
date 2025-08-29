import java.util.*;
import java.math.*;
public class Quadratic {
    public static void main(String[] args){
        Scanner Input=new Scanner(System.in);
        double d,a,b,c,root_1,root_2;
        System.out.println("In the given equation:");
        System.out.print("Enter the value of a: ");
        a=Input.nextDouble();
        System.out.print("Enter the value of b: ");
        b=Input.nextDouble();
        System.out.print("Enter the value of c: ");
        c=Input.nextDouble();
        d=(b*b)-(4*a*c);
        System.out.print("The delta of the equation: ");
        if (d==0){
            root_1=(-b+Math.sqrt(d))/(2*a);
            root_2=root_1;
            System.out.println("The first root of the equation: "+root_1);
        }
    }
}
