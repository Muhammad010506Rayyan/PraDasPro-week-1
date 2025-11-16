import java.util.Arrays;
import java.util.Scanner;
public class siakad18 {
public static void main(String[] args) {
   
    //ADD SCANNER
 Scanner sc= new Scanner (System.in);
    //DECLARE ARRAY SCORE
int[][]score=new int[4][3];
    // ADD FOR LOOP TO INPUT THE VALUE
for(int i=0;i<score.length;i++){
    double sum=0;
    System.out.println("input score here for the student "+(i+1));
    for(int j=0;j<score[i].length;j++){
    System.out.println("input the score here: ");
    score[i][j]=sc.nextInt();
    sum += score[i][j];
    }
    // ADD THE DISPLAY TO SHOW AVERAGE OF EACH STUDENT SCORE
    System.out.println("the student "+(i+1)+" average is "+(sum/3));

}

//make the average for each course
for(int j=0;j<3;j++){
    double sumCourse=0;
    for(int i=0;i<4;i++){
    sumCourse += score[i][j];
    }
    System.out.println("average each content is "+ (sumCourse/4));
}

    }    
}    

