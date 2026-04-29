/**
 * 第7章 武士のお仕事
 *
 * 問題14 複数のインターフェースを実装する
 *
 * 勘定奉行インタフェース、文化人インターフェースを実装する。
 *
 * 藩士クラスに勘定奉行インターフェースと文化人インターフェースを
 * 実装してください。
 *
 * <実行例>
 * 藩士1：
 * 藩の資産を計算するよ～。
 * 茶道を嗜むよ～。
 *
 */

package lesson07.challenge14;

//ここにIChiefTreasurerインターフェースを記述

//ここにICelebrityインターフェースを記述

interface IChiefTreasure {
	void figure();
}

interface ICelebrity {

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
class Retainer implements IChiefTreasure, ICelebrity {

	public void figure() {
		System.out.println("藩の資産を計算するよ～。");
	}

	public void learn() {
		System.out.println("茶道を嗜むよ～。");
	}

	void work() {

		System.out.println("年貢を取り立てるよ～。");

	}

}

//ここにRoninクラスを記述
class Ronin implements ICelebrity {

	public void learn() {
		System.out.println("塾を開くよ～。");

	}

	void work() {

		System.out.println("傘張るよ～。");
	}

}

//ここにSamuraiクラスを記述

//ここにRetainerクラスを記述

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士1：");

		//ここに適切な処理を記述;
		Retainer re = new Retainer();
		re.figure();
		re.learn();

	}
}
