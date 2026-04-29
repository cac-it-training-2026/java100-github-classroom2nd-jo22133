/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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
		double citoronint = Double.parseDouble(citorong);

		System.out.print("ショコラ　　　>");
		String shokoraString = makaron.readLine();
		double shokora = Double.parseDouble(shokoraString);

		System.out.print("ピスターシュ　>");
		String pitaString = makaron.readLine();
		double pistatio = Double.parseDouble(pitaString);

		System.out.println("シトロン　　" + citoronint + "個");
		System.out.println("ショコラ　　" + shokora + "個");
		System.out.println("ピスターシュ" + pistatio + "個");

		System.out.println("\n合計個数" + (citoronint + shokora + pistatio) + "個");
		System.out.println("合計金額" + (citoronint * 250 + shokora * 280 + pistatio * 320) + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		System.out.println("\n本日のおすすめ商品です。");

		System.out.println("\nシトロン　　　\\250・・・残り" + (30 - citoronint) + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + (30 - shokora) + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + (30 - pistatio) + "個");

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		double goukei = citoronint * 250 + shokora * 280 + pistatio * 320;
		int goukei2 = (int) goukei;

		System.out.println("売上の割合");
		System.out.println("売上合計" + "\t\t\\" + goukei2);

		double citoronwariai = (citoronint * 250) / goukei * 100;
		int sitoronnwariai = (int) citoronwariai;
		double shokorawaeiai = (shokora * 280) / goukei * 100;
		int shokoranowariai = (int) shokorawaeiai;
		double pista = (pistatio * 320) / goukei * 100;
		int pistawariai = (int) pista;

		double cituriage = citoronint * 250;
		int curiage = (int) cituriage;
		double shoko = shokora * 280;
		int shokouriage = (int) shoko;
		double pi = pistatio * 320;
		int pisuriage = (int) pi;

		double count = citoronint + shokora + pistatio;
		int cou = (int) count;

		System.out.println("\n内訳");
		System.out.println("シトロン  　 \\" + curiage + "・・・" + sitoronnwariai + "%");
		System.out.println("ショコラ　　 \\" + shokouriage + "・・・" + shokoranowariai + "%");
		System.out.println("ピスターシュ \\" + pisuriage + "・・・" + pistawariai + "%");

		System.out.println("\n明日の三色マカロンの配合率が決まりました！");
		System.out.println("\nシトロンの味　　・・・" + sitoronnwariai + "%");
		System.out.println("ショコラの味　　　・・・" + shokoranowariai + "%");
		System.out.println("ピスターシュ　　　・・・" + pistawariai + "%");

		System.out.println("\nが楽しめます！");
		System.out.println("値段は\\" + (goukei2 / cou / 10 * 10) + "です。");

	}

}
