import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        String userName, password;
        int right=3,secim,balance=1500,price;

        while(right>0) {
            System.out.println("Kullanıcı Adınız: ");
            userName = giris.nextLine();
            System.out.println("Şifreniz: ");
            password = giris.nextLine();
            if (userName.equals("Patika")&&password.equals("dev123")){
                System.out.println("Merhaba ÇiftlikBank'a Hoşgeldiniz!");

                do {

                    System.out.println("1- Para Yatırma \n" +
                            "2- Para Çekme \n" +
                            "3- Bakiye Sorgulama \n" +
                            "4- Çıkış Yap\n");
                    System.out.print("Lütfen yapmak istediğiniz işlermi seçiniz:");
                    secim = giris.nextInt();

                    switch (secim){
                        case 1:
                            System.out.println("Para miktarını giriniz");
                            price = giris.nextInt();
                            balance += price;

                            break;
                        case 2:
                            System.out.println("Para miktarını giriniz");
                            price = giris.nextInt();
                            if(price>balance){
                                System.out.println("Bakiye yetersiz!");
                            }else{
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz = " + balance);

                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere!");

                            break;
                        default:

                    }





                }while(secim != 4);
                break;
            }else{
                right = right-1;
                System.out.println("Hatalı kullanıcı adı ve şifre!");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }else{
                    System.out.println("Kalan hakkınız : " + right);
                }


            }

        }

    }
}
