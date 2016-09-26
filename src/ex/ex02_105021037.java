package ex;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。
 * 	請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。
 * 	如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)。
 * Date: 2016/09/26
 * Author: 105021037 林建宏
 */
import java.util.Scanner;
public class ex02_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.println("輸入座標(a,b)");
		int a=scn.nextInt();
		int b=scn.nextInt();
		
		double c=Math.sqrt((a-0)^2+(b-0)^2);
		if (c<=100){
			System.out.print("點在園內");
			
		}else {System.out.print("點在園外");
			
		}

	}

}
