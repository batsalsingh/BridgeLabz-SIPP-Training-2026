import java.util.Scanner;
public class SumNaturalNumbers{
    public static int sumN(int n){ int s=0; for(int i=1;i<=n;i++) s+=i; return s; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(sumN(sc.nextInt()));
    }
}