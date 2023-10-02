package java101;

import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		String userName,password;
		
		 Scanner inp = new Scanner(System.in);

	        System.out.print("Kullanıcı Adınız: ");
	        userName = inp.nextLine();

	        System.out.print("Şifreniz: ");
	        password = inp.nextLine();

	        if (userName.equals("patika") && password.equals("java123")) {
	            System.out.println("Giriş Başarılı !");
	        } else {
	            System.out.println("Bilgileriniz Yanlış !");
	            System.out.print("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
	            String cevap = inp.nextLine();

	            if (cevap.equalsIgnoreCase("Evet")) {
	                System.out.print("Yeni Şifrenizi Girin: ");
	                String yeniSifre = inp.nextLine();

	                if (yeniSifre.equals(password)) {
	                    System.out.println("Yeni şifre eski şifre ile aynı olamaz. Şifre oluşturulamadı.");
	                } else {
	                    System.out.println("Şifre oluşturuldu.");
	                }
	            }
	        }
	    }
	}
