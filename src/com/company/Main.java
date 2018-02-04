package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Ile liczb chcesz posortowac: ");
        int ileLiczb= input.nextInt();
        int[] tablica = new int[ileLiczb];
        int d= 1;
        int i=0;
        do
        {
            System.out.println("Podaj "+d+ " liczbe.");
            tablica[i] = input.nextInt();
            i++;
            d++;
        }while(i<ileLiczb);
        System.out.println(Arrays.toString(tablica));
        Arrays.sort(tablica);
        System.out.println("Oto posortowane liczby: "+ Arrays.toString(tablica));


    }
}
