package ro.fasttrack;
import java.util.Random;
import java.util.Scanner;

public class tema {
    public static void main(String[] args) {
        pb1();
        pb2();
        pb3();
        pb4();
        pb6();
    }

    public static void pb1() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] array = new int[a];
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = in.nextInt();
        }
        for (int elements : array) {
            System.out.println(elements);
        }
        int produs = 1;
        for (int i = 0; i <= array.length - 1; i++) {
            produs = produs * array[i];
        }
        System.out.println(produs);


    }

    public static void pb2() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] array = new int[a];
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = in.nextInt();
        }
        for (int elements : array) {
            if (elements % 2 != 0) {
                System.out.println(elements);
            }
        }
    }

    public static void pb3() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[] array = new int[a];
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = in.nextInt();
        }
        for (int elements : array) {
            if (b > elements) {
                System.out.println(elements);
            }
        }


    }

    public static void pb4() {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int goal = s.nextInt();
        while(sum <= goal){
            int donation=r.nextInt(1,100);
            System.out.println(donation);
            int x=sum+donation;
            System.out.println(sum + " + " + donation + "=" + x);
           sum=sum+donation;
           if(sum>=goal){
               System.out.println("succes");
           }
        }
    }
    //am facut problema 5 in problema 4
    public static void pb6(){
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String[] b=a.split("\\.");
        for(String c: b){
            System.out.println(c);
        }
    }
}

