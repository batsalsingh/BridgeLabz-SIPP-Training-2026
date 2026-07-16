import java.util.Scanner;
public class TriangularParkRun{
    public static double roundsFor5Km(double a,double b,double c){
        return 5000.0/(a+b+c);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(roundsFor5Km(sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
    }
}