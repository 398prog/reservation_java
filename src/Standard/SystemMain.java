package Standard;

import java.io.IOException;

public class SystemMain{

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ

		//入力処理クラスと予約情報操作クラスを宣言
		InputController seat = new InputController();
		SeatsManager reserve = new SeatsManager();



		System.out.println("ようこそ浅草ジャマイカホールへ！\n\n\n\n\n");

		//reserve.resetArray();

		//テスト用
		//int count = 0;




			//席番号の入力と空席かどうか確認
			int num = seat.inputSeatNum();
			boolean check = reserve.checkVacantSeat(num);



			if(check == true) {

				//seat.inputName();
				System.out.println("座席の予約が完了しました。");

				//予約できたらカウンタをすすめる
				//++count;


			}else {
				System.out.println("※予約済みの座席です。他の座席を選択してください。");
			}

		//}


	}

}
