package lesson04.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Ymanotesengame {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str[] = { "東京", "新宿", "新橋", "御徒町", "五反田", "秋葉原", "浜松町", "渋谷", "田町", "恵比寿",
				"有楽町", "目黒", "大崎", "原宿", "品川", "目白", "大塚", "上野", "池袋", "日暮里", "西日暮里",
				"駒込", "田端", "高田馬場", "神田", "鴬谷", "代々木", "新大久保", "巣鴨", "高輪ゲートウェイ" };

		System.out.println("※※※ 山手線ゲーム ※※※");

		System.out.println("\tゲームスタート!\t");

		int game = 0;

		boolean hit = false;

		Random rand = new Random();

		boolean[] stationFlag = new boolean[str.length];

		Arrays.fill(stationFlag, true);

		do {
			String station = reader.readLine();

			for (int i = 0; i < str.length; i++) {

				if (str[i].equals(station)) {

					if (stationFlag[i]) {

						hit = true;

						stationFlag[i] = false;

						break;

					} else {

						break;
					}
				}
			}

			game++;

			if (!hit || (game == str.length)) {
				break;

			}

			hit = false;

			while (!hit) {

				int index = rand.nextInt(str.length);

				if (stationFlag[index]) {

					hit = true;

					stationFlag[index] = false;

					System.out.println(str[index]);

				}
			}

			game++;

			hit = false;

		} while (game < str.length);

		if (game == str.length) {
			System.out.println("あなたの勝ちです。");
		} else {
			System.out.println("あなたの負けです！");
		}

	}
}
