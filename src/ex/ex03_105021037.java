package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021037 林建宏
 */
import java.util.Scanner;
public class ex03_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		System.out.println("請用24小時制輸入 開始時間( 時分)   ");
		int h1 =scn.nextInt();
		int m1 =scn.nextInt();
		System.out.println("請用24小時制輸入     結束時間( 時分)  ");
		int h2 =scn.nextInt();
		int m2 =scn.nextInt();
		int t=((h2*60+m2)-(h1*60+m1))/30;
		int a=0;
		if(t<=4){a=t*30;
			
		}else if(t<=8){a=120+(t-4)*40;
			
		}else{a=120+160+(t-8)*60;
		
		
		
		}System.out.println(a);
		
		
		
		

	}

}
