import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.println("Lüfen Kullanıcı Giriniz");
            userName = scan.next();
            System.out.println("Lüfen Parolanızı Giriniz");
            password = scan.next();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Kodluyoruz Bankasına Hoşgeldiniz.\n" +
                        "Hangi İşlemi Yapmak İstiyorsunuz?\n" +
                        "1-Para Çekme\n" +
                        "2-Para Yatırma\n" +
                        "3-Bakiye Sorgulama\n" +
                        "4-Çıkış");
                do {
                    select = scan.nextInt();
                    if (select == 1) {
                        System.out.println("Lütfen Çekmek İstediğiniz Miktarı Giriniz");
                        int price = scan.nextInt();
                        balance -= price;
                        System.out.println("Başka Hangi İşlemi Yapmak İstiyorsunuz ?\n" +
                                "1-Para Çekme\n" +
                                "2-Para Yatırma\n" +
                                "3-Bakiye Sorgulama\n" +
                                "4-Çıkış");
                    } else if (select == 2) {
                        System.out.println("Lütfen Yatırmak İstediğiniz Mİktarı Giriniz");
                        int price = scan.nextInt();
                        balance += price;
                        System.out.println("Başka Hangi İşlemi Yapmak İstiyorsunuz ?\n" +
                                "1-Para Çekme\n" +
                                "2-Para Yatırma\n" +
                                "3-Bakiye Sorgulama\n" +
                                "4-Çıkış");
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz: " + balance);
                        System.out.println("Başka Hangi İşlemi Yapmak İstiyorsunuz ?\n" +
                                "1-Para Çekme\n" +
                                "2-Para Yatırma\n" +
                                "3-Bakiye Sorgulama\n" +
                                "4-Çıkış");
                    } else if (select == 4) {
                        System.out.println("Çıkış Yapılmıştır, tekrar görüşmek üzere");
                        break;
                    } else {
                        System.out.println("Hatalı Seçim");
                        System.out.println("Lütfen Yapmak İstediğiniz İşlemi Doğru Seçiniz!\n" +
                                "1-Para Çekme\n" +
                                "2-Para Yatırma\n" +
                                "3-Bakiye Sorgulama\n" +
                                "4-Çıkış");
                    }

                } while (right != 0);
                break;
            } else {
                System.out.println("Kullanıcı Adınız/Parolanız Yanlış Girilmiştir.\n" +
                        "Lütfen Tekrar Deneyiniz");
                right--;
                System.out.println("Kalan Hakkınız: " + right);
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur.\n" +
                            "Lütfen Müşteri Hizmetleri İle Görüşünüz");
                }
            }
        }
    }
}

//SELECT CASE KULLANARAK
/*import java.util.Scanner;

            public class Main {
                public static void main(String[] args) {

                    Scanner scan = new Scanner(System.in);
                    String userName, password;
                    int right = 3;
                    int balance = 1500;
                    int select, price, security = 3;


                    while (right > 0) {
                        System.out.println("Lüfen Kullanıcı Bilgisini Giriniz");
                        userName = scan.next();
                        System.out.println("Lüfen Parolanızı Giriniz");
                        password = scan.next();
                        if (userName.equals("patika") && password.equals("dev123")) {
                            System.out.println("Kodluyoruz Bankasına Hoşgeldiniz");
                            do {
                                System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz\n" +
                                        "1-Para Çekme\n" +
                                        "2-Para Yatırma\n" +
                                        "3-Bakiye Sorgulama\n" +
                                        "4-Çıkış");
                                select = scan.nextInt();

                                switch (select) {
                                    case 1:
                                        System.out.println("Lütfen Çekmek İstediğiniz Tutarı Giriniz:");
                                        price = scan.nextInt();
                                        if (price >= balance) {
                                            System.out.println("Yetersiz Bakiye!");
                                        } else {
                                            balance -= price;
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Lütfen Yatırmak İstediğiniz Tutarı Giriniz:");
                                        price = scan.nextInt();
                                        balance += price;
                                        break;
                                    case 3:
                                        System.out.println("Bakiyeniz: " + balance);
                                        break;
                                    case 4:
                                        System.out.println("Çıkış Yapılıyor. Görüşmek Üzere!");
                                        break;
                                    default:
                                        System.out.println("Hatalı Seçim Yapıldı!");
                                        security--;
                                        if (security <= 0) {
                                            System.out.println("Çok fazla hatalı seçim yaptınız !");
                                        }
                                        break;
                                }
                            } while (select != 4);
                            break;
                        } else {
                            System.out.println("Hatalı Bilgi Girdiniz !\nLütfen Tekrar Deneyiniz");
                            System.out.println("Kalan Hakkınız: " + --right);
                            if (right == 0) {
                                System.out.println("Hesabınız Bloke Olmuştur! Lütfen Banka İle Görüşünüz");
                            }
                        }
                    }
                }
            }
        }
    }
}*/
