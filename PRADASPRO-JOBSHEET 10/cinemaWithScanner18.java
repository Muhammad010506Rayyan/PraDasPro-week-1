import java.util.Scanner;

public class cinemaWithScanner18 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

String name,next;
 System.out.println("--------------------------------------------------");  
 System.out.println("--------------------------------------------------");
//make the array 
 String [][] audience= new String[4][2];
//make the while loop
while(true){
 System.out.println("your name: ");
    name=sc.nextLine();
 System.out.println("input row:");
    int r=sc.nextInt();
 System.out.println("input column");
    int c=sc.nextInt();
   sc.nextLine();

audience[r-1][c-1]=name;

 System.out.println("is there someone need to be added too?:");
    String answer=sc.nextLine();
if(answer.equalsIgnoreCase("n")){
   break;
}

}
System.out.println(audience);

    }
    
}
