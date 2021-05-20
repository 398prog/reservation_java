package excellence;

public class Seat {

	//予約ユーザーの名前と予約状態フィールド（予約状態はfalseを初期値とする）
	//String name;
	String name = "";
	boolean isReserved;



	public Seat(boolean b) {

		isReserved = b;

	}

	public Seat(String str) {
		name = str;
	}

	public void setState(boolean b) {

		Seat s = new Seat(b);

	}

	public boolean getState() {
		return isReserved;
	}

	public void setName(String str) {

		Seat s = new Seat(str);

	}

	public String getName() {
		return name;
	}


}
