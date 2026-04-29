package lesson08.challenge02;

import lesson08.challenge01.Nurse;
import lesson08.challenge01.NurseSchoolChild;

public class NurserySchool {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Nurse nurse1 = new Nurse("保育太郎");
		Nurse nurse2 = new Nurse("保育次郎");
		Nurse nurse3 = new Nurse("保育三郎");

		System.out.println(nurse1.getName() + "が出勤しました。");
		System.out.println(nurse2.getName() + "が出勤しました。");
		System.out.println(nurse3.getName() + "が出勤しました。");

		NurseSchoolChild child1 = new NurseSchoolChild("園児①");
		NurseSchoolChild child2 = new NurseSchoolChild("園児②");
		NurseSchoolChild child3 = new NurseSchoolChild("園児③");

		System.out.println(child1.getName() + "が登園しました。");
		System.out.println(child2.getName() + "が登園しました。");
		System.out.println(child3.getName() + "が登園しました。");

	}

}
