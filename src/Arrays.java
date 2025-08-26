import java.util.Scanner;
public class Arrays {
    public static void main(String[] args){
        Scanner Input=new Scanner(System.in);
        int[] nbrs=new int[5];
         for(int i=0;i<5;++i){
             System.out.print("Enter value for index["+i+"]= ");
             nbrs[i]=Input.nextInt();
         }
         for (int j=0;j<5;++j){
             System.out.println("Nbrs["+j+"]= "+nbrs[j]);
         }

    }
}
