package extra;

import java.io.IOException;

public class SystemMain{

	public static void main(String[] args) throws IOException,IndexOutOfBoundsException{
		// TODO 自動生成されたメソッド・スタブ

		//入力処理クラスと予約情報操作クラスを宣言
		InputController seat = new InputController();
		SeatsManager reserve = new SeatsManager();



		System.out.println("ようこそ浅草ジャマイカホールへ！\n\n\n\n\n");

		reserve.resetArray();

		//テスト用
		//int count = 0;


		//繰り返しテスト用、whileとcountは最終的に消す
		//while(count < Constant.seatTotal) {
		try {

			//席番号の入力と空席かどうか確認
			int num = seat.inputSeatNum();
			boolean check = reserve.checkVacantSeat(num);



			if(check == true) {

				//空席なら名前を入力
				reserve.reserveName(num);
				System.out.println("座席の予約が完了しました。");


			}else {
				System.out.println("※予約済みの座席です。他の座席を選択してください。");
			}

		}catch(IndexOutOfBoundsException e){

			//30より上の数値を入力した際

			System.out.println("システムエラーが発生しました。");
			System.out.println("システムを終了します。");

		}catch(NumberFormatException e){

			//何も入力せずEnterした際

			System.out.println("システムエラーが発生しました。");
			System.out.println("システムを終了します。");

		}finally {

			//スペース用
			System.out.print("\n\n\n");

		}
		//}


	}

}
