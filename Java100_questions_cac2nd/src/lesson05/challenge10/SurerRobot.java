package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class cooking {

	int eggNum;
	int butterNum;
	int meat;

}

class cook extends cooking {

	void humburg(int eggNum, int butterNum, int meat) {
		this.eggNum = eggNum;
		this.butterNum = butterNum;
		this.meat = meat;

	}

	void dishies() {
		if (eggNum > 0 && butterNum >= 10 && meat >= 100) {
			System.out.println("ハンバーグできました。");

		} else {
			System.out.println("材料が足りません。");
		}

	}
}

public class SurerRobot {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("\n卵の個数を入力してください＞");
		String eggNumStr = br.readLine();
		int eggNum = Integer.parseInt(eggNumStr);

		System.out.print("\nバターの量を入力してください（グラム）＞");
		String butterNumStr = br.readLine();
		int butterNum = Integer.parseInt(butterNumStr);

		System.out.print("\n肉の量を入力してください（グラム）＞");
		String meatnum = br.readLine();
		int meatn = Integer.parseInt(meatnum);

		cook ck = new cook();
		ck.humburg(eggNum, butterNum, meatn);

		ck.dishies();

	}
}
