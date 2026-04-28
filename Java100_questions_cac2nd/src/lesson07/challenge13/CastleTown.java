/**
 * 第7章 武士のお仕事
 *
 * 問題13 インターフェース②
 *
 * 文化人インターフェースを作る。
 *
 * 抽象メソッドlearn()を持つ文化人インターフェースICelebrityを
 * 作成し、藩士クラスと浪人クラスにそれぞれ実装し、<実行例>と
 * 同じメッセージを表示してください。
 *
 * <実行例>
 * 藩士1：
 * 茶道を嗜むよ～。
 *
 * 浪人1：
 * 塾を開くよ～。
 *
 *
 */

package lesson07.challenge13;

//ここにICelebrityインターフェースを記述

interface IChiefTreasure {
	void learn();
}

abstract class Samurai {

	protected String name;
	protected String domain;

	void fight() {
		System.out.println("戦うよ～。");
	}

	abstract void work();

}

//ここにRetainerクラスを記述
class Retainer implements IChiefTreasure {

	public void learn() {
		System.out.println("茶道を嗜むよ～。");
	}

	void work() {

		System.out.println("年貢を取り立てるよ～。");

	}

}

//ここにRoninクラスを記述
class Ronin implements IChiefTreasure {

	public void learn() {
		System.out.println("塾を開くよ～。");

	}

	void work() {

		System.out.println("傘張るよ～。");
	}

}
//ここにSamuraiクラスを記述

//ここにRetainerクラスを記述

//ここにRoninクラスを記述

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士1：");

		//ここに適切な処理を記述
		Retainer re = new Retainer();
		re.learn();

		System.out.println("\n浪人1：");
		Ronin ro = new Ronin();
		ro.learn();

		//ここに適切な処理を記述

	}
}
