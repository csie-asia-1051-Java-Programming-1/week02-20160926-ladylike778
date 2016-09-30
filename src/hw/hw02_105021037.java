package hw;
/*
 * Topic: 已知男生標準體重＝(身高－80 )*0.7；女生標準體重＝(身高－70)*0.6；
 * 試寫一個程式可以計算男生女生的標準體重。
 * (輸入兩個數值，依序代表為身高及性別
 * （1代表男性；2代表女性）)
 * Date: 2016/09/26
 * Author: 105021037 林建宏
 */
import java.util.Scanner;
public class hw02_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入身高");
		int tall =scn.nextInt();
		System.out.println("請輸入性別:1為男生2為女生");
		int g= scn.nextInt();
		float w=0;
		if (g == 1){ w=(tall-80)*0.7f; 
			
		}else if (g==2){w=(tall-70)*0.6f;
		
		}
		System.out.println("標準體重為"+w);
	}

}
