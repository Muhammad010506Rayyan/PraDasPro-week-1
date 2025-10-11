import java.util.Scanner;
public class case2{
public static void main(String[] args) {
   Scanner input= new Scanner(System.in);
   //make the status verification
   System.out.print ("Show your status below here:");
   String status=input.nextLine();
    // make the selection
    if (status.equalsIgnoreCase("lecturer")){System.out.println("access granted");}
    else if(status.equalsIgnoreCase("student")){System.out.println("access granted");}
    else {System.out.println("sorry, you re not allowed");}

}
}