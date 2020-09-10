import java.util.Scanner;
public class Kiem_tra_nam_nhuan {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Vui long nhap nam: ");
        int year= sc.nextInt();
        if(isGapYear(year)) System.out.println("Nam "+year+" la nam nhuan");
        else System.out.println("Nam "+year+" ko phai nam nhuan");
    }
    public static boolean isGapYear(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0) return true;
                else return false;
            } else return true;
        }else return false;
    }
}
