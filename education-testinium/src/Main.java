import model.constructor.Car;
import model.inheritance.SoftwareWorker;

public class Main {
    public static void main(String[] args) {

        String city ;
        city = "Hasan";
        String sehir ;
        sehir = "İstanbul";



        Car car = new Car(1,"bmw","red",2025);
       // Car car2 = new Car();


        car.setModel("Renault");
        car.setModel("bmq");
        car.setModel("fiat");
        car.getModel();
        System.out.println(car.getModel());
        car.setYear(2018);

        SoftwareWorker softwareWorker = new SoftwareWorker();
       softwareWorker.setAd("Hasan");
       softwareWorker.setId(1);
       softwareWorker.setPrgrammingLanguage("JAVA");




       /* Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen kullanıcı adınızı giriniz :");
        String username = scanner.nextLine();

        System.out.println("Lütfen şifrenizi giriniz :");
        String password = scanner.nextLine();
        if(username.equals("admin") && password.equals("1234")){
            System.out.println("Hoşgeldin admin ");
        }else{
            System.out.println("Giriş başarısız");
        }

        System.out.println("1. sayıyı giriniz :");
        int sayi1 = scanner.nextInt();
        System.out.println("2.Sayıyı giriniz : ");
        int sayi2 = scanner.nextInt();

        int toplam = sayi1 + sayi2;
        int carpim = sayi1 * sayi2;

        System.out.println("Sayıların Toplamı : " + (sayi1 + sayi2));
        System.out.println("Sayıların Çarpımı : " + (sayi1 * sayi2));

        if(carpim>5000 && toplam<4000){
            System.out.println("Sayıların çarpım değeri : " + carpim);
        }
        else{
            System.out.println("Sayıların çarpımı 5000den büyük ve 4000den küçük değil kapsamıyo");
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