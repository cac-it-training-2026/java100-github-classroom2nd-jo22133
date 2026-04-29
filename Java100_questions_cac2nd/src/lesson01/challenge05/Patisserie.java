/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {

	public static void main(String[] args) throws IOException {

		int sitoronstock = 30;
		int shokorastock = 30;
		int pisterjustock = 30;

		System.out.println("たいへん待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です!!");
		System.out.println("シトロン\t\t\\250・・・残り" + sitoronstock + "個");
		System.out.println("ショコラ\t\t\\280・・・残り" + shokorastock + "個");
		System.out.println("ピスターシュ\t\\320・・・残り" + pisterjustock + "個");

		BufferedReader makaron = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？(最大30個まで)\n");

		System.out.print("シトロン　　　>");
		String citorong = makaron.readLine();
		int citoronint = Integer.parseInt(citorong);

		System.out.print("ショコラ　　　>");
		String shokoraString = makaron.readLine();
		int shokora = Integer.parseInt(shokoraString);

		System.out.print("ピスターシュ　>");
		String pitaString = makaron.readLine();
		int pistatio = Integer.parseInt(pitaString);

		System.out.println("\n合計個数" + (citoronint + shokora + pistatio) + "個");
		System.out.println("合計金額" + (citoronint * 250 + shokora * 280 + pistatio * 320) + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

	}

}
