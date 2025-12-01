import java.util.*;//import all util library

public class kafe18{
public static void main(String[] args) {
    System.out.println("===WELCOME TO CAFE===");
    System.out.println("we have a discont for members, 30 or 50 what do you got");
    menu("Andi","DISKON50",true);
}

public static void menu(String namaPelanggan,String kodePromo, Boolean isMember){
System.out.println("welcome"+namaPelanggan+"!");

if(isMember){
    System.out.println("horee dapat diskon");
if("DISKON50".equals(kodePromo)){
    System.out.println("anda mendapatkan diskon 50%");
}else if("DISKON30".equals(kodePromo)){
    System.out.println("anda mendapatkan diskon 30%");
}}
System.out.println("==CAFE MENU==");
System.out.println("KOPI");
System.out.println("SUSU");
System.out.println("teh");
    }
}