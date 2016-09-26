package ex;
/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 105021037 林建宏
 */
import java.util.Scanner;
public class ex01_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		float t=scn.nextFloat();
		float b=0;
		if ( t <600){ b=t/2;
		
		}
		
		else if ( t<=1200  ){ b=t/2*0.9f;
		
		}
		
		else{b=t/2*0.79f;
			
		}
		System.out.print(b);

	}

}
