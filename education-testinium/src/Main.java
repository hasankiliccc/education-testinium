import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen kullanıcı adınızı giriniz :");
        String username = scanner.nextLine();

        System.out.println("Lütfen şifrenizi giriniz :");
        String password = scanner.nextLine();
        if(username.equals("admin") && password.equals("1234")){
            System.out.println("Hoşgeldin admin ");
        }else{
            System.out.println("Giriş başarısız");
        }

      /*  System.out.println("Helsdsladsdso and welcwsasdsdasdastatusome!");

        int hasan = 23 ;
        int hüseyin = 10 ;



        System.out.println("hasan : " + hasan);


        int[] isimler = {1,2,3,4,5,6,7,8,9,33};


        for (int i = 0; i < hüseyin; i++) {
            System.out.println("i = sadas" + i);
            System.out.println("isimler = " + isimler[i]);

        }*/
    }
}