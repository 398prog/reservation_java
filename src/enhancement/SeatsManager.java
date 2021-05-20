package enhancement;

public class SeatsManager {

	//初期値はすべてfalse
	boolean[] seatArray = new boolean[30];

		//空席かどうか確認
		public boolean checkVacantSeat(int seatNum) throws IndexOutOfBoundsException{

			seatArray[24] = true;
			seatArray[13] = true;

			//空席（seatArrayがfalse）ならtrue,予約済み（seatArrayがtrue）ならfalseを返す
			//seatNum番目のseatArrayを変更

			if(seatArray[seatNum] == false) {
				seatArray[seatNum] = true;
				return true;
			}else {
				seatArray[seatNum] = false;
				return false;
			}

		}


		//席を予約する
		public void reserveSeat(int seatNum) {

			//seatNum番目の席を予約済み（true）に設定
			seatArray[seatNum] = true;

		}

//	//ArrayList初期化
//	public void resetArray() {
//
//		//すべての要素にfalseを設定
//		for(int i=0;i<30;i++) {
//
//			seatArray.add(Boolean.FALSE);
//
//		}
//	}
//
//
//	//空席かどうか確認
//	public boolean checkVacantSeat(int seatNum) throws IndexOutOfBoundsException{
//
//		seatArray.set(Constant.reserved1-1,true);
//		seatArray.set(Constant.reserved2-1,true);
//
//		//空席（seatArrayがfalse）ならtrue,予約済み（seatArrayがtrue）ならfalseを返す
//		//seatNum番目のseatArrayを変更
//
//		if(seatArray.get(seatNum) == false) {
//			seatArray.set(seatNum,true);
//			return true;
//		}else {
//			seatArray.set(seatNum,false);
//			return false;
//		}
//
//	}
//
//
//	//席を予約する
//	public void reserveSeat(int seatNum) {
//
//		//seatNum番目の席を予約済み（true）に設定
//		seatArray.set(seatNum,true);
//
//	}

}
