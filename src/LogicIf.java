import java.util.Scanner;
public class LogicIf {
    public static void main(String[] args){
        Scanner Input=new Scanner(System.in);
        int age;
        System.out.println("Please enter your age: ");
        age=Input.nextInt();
        if (age>=18){
            System.out.println("You are allowed to enter the club.");
        }
        else {
            System.out.println("You are not allowed to enter the club!!!");
        }
    }
}
