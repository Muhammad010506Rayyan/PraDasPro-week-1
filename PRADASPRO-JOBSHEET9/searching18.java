import java.util.Scanner;
public class searching18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int hasil=0;
        //initialize the array value
    int[] nilai={87,88,89,90,91};
        //input the value that you want to search
    System.out.println("input the value:");
    int key=sc.nextInt();
        //make the if program
        for(int i=0;i<nilai.length;i++){
            if(key==nilai[i]){
            hasil=i;
            break;
        }
        }
        if (hasil != 0) {
            System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }

    }
}   
   

