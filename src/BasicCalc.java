import java.util.Scanner;
public class BasicCalc {
    public static void main(String[] args){
        Scanner Input=new Scanner(System.in);
        double nbr1,nbr2,sum;
        System.out.print("Enter first number: ");
        nbr1=Input.nextDouble();
        System.out.print("Enter second number: ");
        nbr2=Input.nextDouble();
        sum=nbr1+nbr2;
        System.out.println("The sum: "+sum);
    }
}
