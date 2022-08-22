import java.util.Scanner;

public class Main {

    static int negative(int x){
        if (x<0){
            return x;
        }else{
            System.out.println(x+" ");
            return negative(x-5);
        }

    }
    static int  positive(int x,int y){
        if (x>y){
            return x;
        }else {
            System.out.println(x+" ");
            return positive(x+5,y);
        }
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        while (true){
            System.out.println("Bir sayi giriniz:");
            int number=input.nextInt();

            positive(negative(number),number);
            break;

        }

        }

    }

