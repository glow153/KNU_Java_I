import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Problem03 {
   public static void main(String[] args) {

      int col = 2; // i
      int row = 5; // j
      Boolean[][] isCheck = new Boolean[col][row];

      for (int i = 0; i < col; i++) {
         for (int j = 0; j < row; j++) {
            isCheck[i][j] = false;
         }
      }

      System.out.println("@@  영화 예약 프로그램  @@");
      while (true) {
         System.out.println("1. 좌석 확인(O : 예약가능  ,  X : 예약완료)");
         System.out.println("2. 좌석예약");
         System.out.println("3. 종료");
         System.out.print("메뉴를 선택하시오 :");
         Scanner sc = new Scanner(System.in);
         int selectedNum = sc.nextInt();
         System.out.println();

         if (selectedNum == 1) {
            for (int i = 0; i < col; i++) {
               for (int j = 0; j < row; j++) {
                  if (isCheck[i][j] == false) {
                     System.out.print("O ");
                  } else {
                     System.out.print("X ");
                  }
               }
               System.out.println();
            }
         } else if (selectedNum == 2) {
            System.out.print("예약할 행을 입력하시오 :");
            int selectedCol = sc.nextInt()-1;
            System.out.print(selectedCol+1 + "행의 열을 입력하시오 : ");
            int selectedRow = sc.nextInt()-1;
            for (int i = 0; i < col; i++) {
               for (int j = 0; j < row; j++) {
                  isCheck[selectedCol][selectedRow] = true;
               }
            }
         } else {
            System.out.println("프로그램을 종료합니다.");
            break;
         }
         System.out.println();
      }

   }
}