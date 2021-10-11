import java.util.Scanner;

public class DaireAC {
    public static void main(String[] args) {
        int r,alfa;
        double PI=3.14;

        Scanner input=new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz : ");
        r=input.nextInt();
        System.out.print("Daire diliminin açısının ölçüsün giriniz : ");
        alfa=input.nextInt();

        double alan = (PI * (r*r) * alfa) / 360;


        System.out.println("Girilen değerlere göre daira diliminin alanı : "+alan+"dır.");

    }
}
