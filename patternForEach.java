import java.util.Scanner;

public class Pattern_foreach {
    public static void main(String[] args) {
        int dim; 

        System.out.println("Enter the size\n");
        Scanner sc = new Scanner(System.in);
        dim = sc.nextInt();
        sc.close();


        int arr[] = new int[dim];
        
        int i=1;
        for (int val : arr) {
            int a[] = new int[i];
            for(int j:a){
                System.out.print(i + " ");
            }
            System.out.println();
            i++;
        }
        
    }
}