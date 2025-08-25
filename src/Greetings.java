import java.util.Scanner;
public class Greetings {
    public static void main(String[] args){
        Scanner Input=new Scanner(System.in);
        String name1,name2;
        System.out.println("What is your first name: ");
        name1=Input.nextLine();
        System.out.println("What is your second name: ");
        name2=Input.nextLine();
        System.out.println("Welcome to this place "+name1+" "+name2);
    }
}
