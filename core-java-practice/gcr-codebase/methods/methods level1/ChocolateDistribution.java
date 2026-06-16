import java.util.Scanner;
public class ChocolateDistribution{
    public static int[] findRemainderAndQuotient(int chocolates,int children){
        return new int[]{chocolates/children,chocolates%children};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] r=findRemainderAndQuotient(sc.nextInt(),sc.nextInt());
        System.out.println("Each Child="+r[0]+", Remaining="+r[1]);
    }
}