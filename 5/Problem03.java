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

      System.out.println("@@  ��ȭ ���� ���α׷�  @@");
      while (true) {
         System.out.println("1. �¼� Ȯ��(O : ���డ��  ,  X : ����Ϸ�)");
         System.out.println("2. �¼�����");
         System.out.println("3. ����");
         System.out.print("�޴��� �����Ͻÿ� :");
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
            System.out.print("������ ���� �Է��Ͻÿ� :");
            int selectedCol = sc.nextInt()-1;
            System.out.print(selectedCol+1 + "���� ���� �Է��Ͻÿ� : ");
            int selectedRow = sc.nextInt()-1;
            for (int i = 0; i < col; i++) {
               for (int j = 0; j < row; j++) {
                  isCheck[selectedCol][selectedRow] = true;
               }
            }
         } else {
            System.out.println("���α׷��� �����մϴ�.");
            break;
         }
         System.out.println();
      }

   }
}