import java.util.Scanner;
/**
 * @ Class D20
 * @ Author Fei Gu
 * @ Date 01/10/2020 - 13.15
 */

/*
p4.21  Write a program that reads an integer and displays, using asterisks,
a filled diamond of the given side length.
For example, if the side length is 4, the program should display
    *
   ***
  *****
 *******
  *****
   ***
    *

 */
public class diamondClass {
    public static void main(String[] args) {
        // ask and asking input
        System.out.println(" How big diamond would you like? ");
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();

        // make the rules for mark the *


            // 打印n行
            for(int i=0;i<h;i++){
                //每一行的开头先打印“1”
                for(int j=0;j<h-i;j++){
                    System.out.print(" ");
                }

                //中间打印“0”
                for(int m=0;m<2*i+1;m++){
                    System.out.print("*");
                }

                //打印右边的“1”
                for(int j=0;j<h-i;j++){
                    System.out.print(" ");
                }

                //一行结束换行
                System.out.println();
            }

            //打印下半部分
            for(int i=0;i<h;i++){
                //打印左边的“1”
                for(int j=h-i;j<=h;j++){
                    System.out.print(" ");
                }

                //打印中间的“0”
                for(int m=0;m<(h-i)*2-1;m++){
                    System.out.print("*");
                }

                //打印右边的“1”
                for(int n=h-i;n<=h;n++){
                    System.out.print(" ");
                }

                //一行结束换行
                System.out.println();
            }
    }

}

