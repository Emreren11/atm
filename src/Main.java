import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        String userName,password;
        int op; //op = operation
        int right=3,balance=1500,tempBalance=0;

        System.out.print("Kullanıcı Adı: ");
        userName=inp.nextLine();

        System.out.print("Şifre: ");
        password=inp.nextLine();
        while(!userName.equals("patika") || !password.equals("123"))
        {
            while (!userName.equals("patika"))
            {
                System.out.println("Hatalı kullanıcı adı. Lütfen tekrar giriniz..!!");
                System.out.print("Kullanıcı Adı: ");
                userName=inp.nextLine();

                System.out.print("Şifre: ");
                password=inp.nextLine();
            }
            while (!password.equals("123"))
            {
                System.out.println("Hatalı şifre. Lütfen tekrar giriniz..!!");
                System.out.print("Kullanıcı Adı: ");
                userName=inp.nextLine();

                System.out.print("Şifre: ");
                password=inp.nextLine();
            }
        }
        do {
            System.out.println("\n1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış");
            System.out.print("Yapmak istediğiniz işlem numarasını giriniz: ");
            op=inp.nextInt();

            switch (op)
            {
                case 1:
                    System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                    balance+=inp.nextInt();
                    System.out.println("Yeni bakiye tutarınız: "+balance+" TL");
                    break;
                case 2:
                        System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                        tempBalance=inp.nextInt();
                        while (balance-tempBalance<0)
                        {
                            System.out.print("Yetersiz bakiye. Tekrar giriniz: ");
                            tempBalance=inp.nextInt();
                        }
                        if(balance-tempBalance>=0) {
                            balance-=tempBalance;
                            System.out.println("Yeni bakiye tutarınız: "+balance+" TL");
                        }else
                            System.out.println("Bakiye yetersiz.!!");

                    break;
                case 3:
                    System.out.println("Bakiye tutarınız: "+balance+" TL");
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor. İyi günler dileriz..!!");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız. Lütfen 1-4 arasında bir rakam giriniz..!!");
                    break;

            }

        }while(op!=4);


    }
}