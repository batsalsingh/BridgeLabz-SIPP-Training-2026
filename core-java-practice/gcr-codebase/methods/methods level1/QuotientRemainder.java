import java.util.Scanner;
public class QuotientRemainder{
    public static int[] findRemainderAndQuotient(int number,int divisor){
        return new int[]{number/divisor, number%divisor};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] r=findRemainderAndQuotient(sc.nextInt(),sc.nextInt());
        System.out.println("Quotient="+r[0]+", Remainder="+r[1]);
    }
}