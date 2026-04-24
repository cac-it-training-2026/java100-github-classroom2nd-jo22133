/**
 * 第4章 倉庫番のお仕事
 *
 * 問題11 荷物の入れ替え（三つの配列をまとめる）
 *
 * MQ運送から、新たに三つのコンテナ群を預かり
 * 委託管理を行うことになりました。
 * 三つのコンテナ群はそれぞれ5箱ずつからなり、
 * 合計すると15箱の入れ物になります。
 *
 * 併せてMQ運送から依頼があり、
 * コンテナ群のうち空き箱がいくつかあるので、
 * 空いてるところは詰めてほしいと言われました。
 * つまり、
 *
 * 有、空、有、空、有
 *
 * と並んでいた場合は、
 *
 * 有、有、有、空、空
 *
 * としてほしいという依頼です。
 *
 * 各コンテナのどの箱が空き箱なのかはランダムに決定し、
 * 空き箱である確率は1/4です。
 * 中身がある箱には1～10の何れかの数値が入り、
 * これもランダムに決定します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  MQ運送の件、お願いします。
 *
 *  Yさん：
 *  はい、まずは現状から確認いたします。
 *
 *  C...3,4,4,0,7
 *
 *  D...0,5,0,9,0
 *
 *  E...2,1,3,10,6
 *
 *  でした。直してきます...
 *
 *  Yさん：
 *  直してきました。
 *
 *  C...3,4,4,7,5
 *
 *  D...9,2,1,3,10
 *
 *  E...6,0,0,0,0
 *
 *  になりました。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 */

package lesson04.challenge11;

public class WarehouseManager {

	public static void main(String[] args) {

		//ここに必要な配列の宣言を記述する。
		int[] carry = new int[5];
		int[] darry = new int[5];
		int[] earry = new int[5];
		int num = 0;
		int sum = 0;

		//ここに配列に値を代入する処理を記述する。(要素はランダム)

		int[][] allarry = new int[3][5];
		allarry[0] = carry;
		allarry[1] = darry;
		allarry[2] = earry;

		for (int i = 0; i < allarry.length; i++) {
			for (int j = 0; j < allarry[0].length; j++) {
				int rand = (int) (Math.random() * 10) % 4;
				if (rand == 0) {
					allarry[i][j] = 0;
				} else {
					allarry[i][j] = (int) (Math.random() * 10) % 10 + 1;
				}

			}

		}

		System.out.println("E主任：");
		System.out.println("MQ運送の件、お願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、まずは現状から確認いたします。\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int j = 0; j < carry.length; j++) {
			System.out.print(carry[j]);

			if (j < 4) {

				System.out.print(",");
			}
		}

		//ここに配列Dの要素をすべて出力する処理を記述する。
		System.out.print("\n\nD...");
		for (int j = 0; j < darry.length; j++) {
			System.out.print(darry[j]);

			if (j < 4) {

				System.out.print(",");
			}
		}

		//ここに配列Eの要素をすべて出力する処理を記述する。
		System.out.print("\n\nE...");
		for (int j = 0; j < earry.length; j++) {
			System.out.print(earry[j]);

			if (j < 4) {

				System.out.print(",");
			}
		}
		System.out.println("\n\nでした。直してきます...\n");

		//ここに詰め替え処理を記述する

		for (int i = 0; i < darry.length; i++) {

			if (darry[i] == 0) {
				num = i;
			}
			for (int j = 0; j < earry.length; j++) {

				if (earry[j] > 0) {
					sum = darry[num];
					darry[num] = earry[j];
					earry[j] = sum;
					break;
				}

			}

		}
		for (int i = 0; i < carry.length; i++) {

			if (carry[i] == 0) {
				num = i;
			}
			for (int j = 0; j < darry.length; j++) {

				if (darry[j] > 0) {
					sum = carry[num];
					carry[num] = darry[j];
					darry[j] = sum;
					break;
				}

			}

		}
		for (int i = 0; i < darry.length; i++) {

			if (darry[i] == 0) {
				num = i;
			}
			for (int j = 0; j < earry.length; j++) {

				if (earry[j] > 0) {
					sum = darry[num];
					darry[num] = earry[j];
					earry[j] = sum;
					break;
				}

			}

		}

		for (int t = 0; t < darry.length - 1; t++) {
			for (int j = t + 1; j < darry.length; j++) {
				if (darry[t] < darry[j]) {
					sum = earry[t];
					darry[t] = darry[j];
					darry[j] = sum;

				}

			}

		}

		for (int t = 0; t < earry.length - 1; t++) {
			for (int j = t + 1; j < earry.length; j++) {
				if (earry[t] < earry[j]) {
					sum = earry[t];
					earry[t] = earry[j];
					earry[j] = sum;

				}

			}

		}

		System.out.println("Yさん：");
		System.out.println("直してきました。\n");

		System.out.print("C...");
		for (int j = 0; j < carry.length; j++) {
			System.out.print(carry[j]);

			if (j < 4) {

				System.out.print(",");
			}
		}
		//ここに配列Cの要素をすべて出力する処理を記述する。

		System.out.print("\n\nD...");

		for (int j = 0; j < darry.length; j++) {
			System.out.print(darry[j]);

			if (j < 4) {

				System.out.print(",");
			}
		}
		//ここに配列Dの要素をすべて出力する処理を記述する。

		System.out.print("\n\nE...");

		for (int j = 0; j < earry.length; j++) {
			System.out.print(earry[j]);

			if (j < 4) {

				System.out.print(",");
			}
		}
		//ここに配列Eの要素をすべて出力する処理を記述する。

		System.out.println("\n\nになりました。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}
