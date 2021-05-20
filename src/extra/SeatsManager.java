package extra;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SeatsManager {

	//初期値はすべてfalse
	//boolean[] seatArray = new boolean[30];

	List<Seat> seatList = new ArrayList<>();

	Seat s1 = new Seat(true); //予約済み状態
	Seat s2 = new Seat(false); //空席状態

	//ArrayList初期化
		public void resetArray() {

			//すべての要素にs2を設定
			for(int i=0;i<Constant.seatTotal;i++) {

				seatList.add(s2);

			}
		}


		//空席かどうか確認
		public boolean checkVacantSeat(int seatNum) throws IndexOutOfBoundsException{

			seatList.set(Constant.reserved1,s1);
			seatList.set(Constant.reserved2,s1);

			//空席（seatArrayがfalse）ならtrue,予約済み（seatArrayがtrue）ならfalseを返す
			//seatNum番目のseatArrayを変更

			if(seatList.get(seatNum) == s2) {
				seatList.set(seatNum,s1);
				return true;
			}else {
				seatList.set(seatNum,s2);
				return false;
			}

		}


		//席を予約する
		public void reserveSeat(int seatNum) {

			//seatNum番目の席を予約済み（true）に設定
			seatList.set(seatNum,s1);

		}


		//予約した人の名前を登録
		public void reserveName(int seatNum) throws IOException{

			Seat s = new Seat(InputController.inputName());
			seatList.set(seatNum,s);


		}


}
