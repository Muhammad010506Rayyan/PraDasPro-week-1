import java.util.Scanner;
public class searching18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int[] nilai={87,88,89,90,91};
    int hasil=0;
    System.out.println("input the value:");
    int key=sc.nextInt();
//make the if program
        for(int i=0;i<nilai.length;i++){
            if(key==nilai[i]){
                hasil=i;
                System.out.println("the key "+key+ " was stored in index "+ hasil+ " or in element "+(hasil+1));
            }
        }
    }
}   
   

