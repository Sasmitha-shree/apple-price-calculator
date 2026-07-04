
import java.util.Scanner;

public class garden {
    int apple_price;
    int apple_count;
    void total_money(){
        int tol=apple_price*apple_count;
        System.out.println("Total price : "+tol);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        garden ob=new garden();
        System.out.println("Enter the apple price : ");
        ob.apple_price=sc.nextInt();
        System.out.println("Enter the apple count : ");
        ob.apple_count=sc.nextInt();
        ob.total_money();
        sc.close();
    }
}
