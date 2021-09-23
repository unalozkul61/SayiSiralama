import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int a,b,c ;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz : ");
        a = input.nextInt();
        System.out.print("ikinci  sayiyi giriniz : ");
        b = input.nextInt();
        System.out.print("üçüncü sayiyi giriniz : ");
        c = input.nextInt();

        if ((a<b)&&(a<c)){
            if (b<c){
                System.out.println("a < b < c ");
            }else {
                System.out.println("a < c < b ");
            }
        }else if ((b<a)&&(b<c)){
            if (a<c){
                System.out.println("b < a <c");
            }else {
                System.out.println("b < c < a");
            }
        }else {
            System.out.println("c < b < a ");
        }




    }
}
