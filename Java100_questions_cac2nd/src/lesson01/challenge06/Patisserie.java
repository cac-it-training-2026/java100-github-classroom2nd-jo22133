/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		System.out.println("本日のおすすめ商品です。");
		System.out.println("\nシトロン　　　\\250・・・残り" + (30 - citoronint) + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + (30 - shokora) + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + (30 - pistatio) + "個");

	}

}
