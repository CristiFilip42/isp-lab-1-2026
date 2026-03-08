package utcluj.aut;

import java.util.Scanner;

public class SumaPara{
    public static int Suma(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++)
            sum = sum + 2*i;
        return sum;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(Suma(a));
    }
}
