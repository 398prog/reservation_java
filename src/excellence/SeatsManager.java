package excellence
;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SeatsManager {

	//初期値はすべてfalse
	//boolean[] seatArray = new boolean[30];

	List<Seat> seatArray = new ArrayList<>();

	Seat s1 = new Seat(true); //予約済み状態
	Seat s2 = new Seat(false); //空席状態

	//ArrayList初期化
		public void resetArray() {

			//すべての要素にs1を設定
			for(int i=0;i<Constant.seatTotal;i++) {

				seatArray.add(s2);

			}
		}


		//空席かどうか確認
		public boolean checkVacantSeat(int seatNum) throws IndexOutOfBoundsException{

			seatArray.set(Constant.reserved1,s1);
			seatArray.set(Constant.reserved2,s1);

			//空席（seatArrayがfalse）ならtrue,予約済み（seatArrayがtrue）ならfalseを返す
			//seatNum番目のseatArrayを変更

			if(seatArray.get(seatNum) == s2) {
				seatArray.set(seatNum,s1);
				return true;
			}else {
				seatArray.set(seatNum,s2);
				return false;
			}

		}


		//席を予約する
		public void reserveSeat(int seatNum) {

			//seatNum番目の席を予約済み（true）に設定
			seatArray.set(seatNum,s1);

		}

		public void reserveName(int seatNum) throws IOException{

			Seat s = new Seat(InputController.inputName());
			seatArray.set(seatNum,s);


		}


}
