package extra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class InputController {

	public int inputSeatNum() throws IOException{


		//席番号を入力させるよう表示
		System.out.println("何番の座席を予約しますか？（1～30）");
		System.out.print(">");


		//標準入力処理
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int num = Integer.parseInt(str);

		//入力数値より1を引いた数を返す
		return num-1;

	}


	public static String inputName() throws IOException{


		System.out.println("お名前を入力してください");
		System.out.print(">");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();

		return str;
	}

}
