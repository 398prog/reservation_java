package extra;

public class Seat {

	//予約ユーザーの名前と予約状態フィールド（予約状態はfalseを初期値とする）
	//String name;
	String name;
	boolean isReserved;


	//isReservedの初期値変更
	public Seat(boolean b) {

		isReserved = b;

	}

	//nameの初期値変更
	public Seat(String str) {
		name = str;
	}


	//Seat型のisReservedを変更
	public void setState(boolean b) {

		Seat s = new Seat(b);

	}

	//Seat型のisReservedを出力
	public boolean getState() {
		return isReserved;
	}

	//Seat型のnameを変更
	public void setName(String str) {

		Seat s = new Seat(str);

	}

	//Seat型のnameを出力
	public String getName() {
		return name;
	}


}
