package MC.UI;

import java.util.Scanner;

import DC.Service.MCService;

public class MCUI {
	// Scanner ���� ����� sc
	Scanner sc = new Scanner(System.in);
	// MCService ���� ����� mcs
	MCService mcs = new MCService();

	public MCUI() {
		menu();
		System.out.print(">�޴��� ������ �ּ��� : ");
		String firstChoice = sc.nextLine();

		switch (firstChoice) {
		case "1":
			mcs.pickHamburge();
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;
		case "5":
			break;
		case "6":
			break;
		case "7":
			break;
		case "0":
			break;
		}
	}

	public void menu() {
		System.out.println("==========MCdonalds==========");
		System.out.println("	  1 > ��  ��  ��");
		System.out.println("	  2 > ����&���̵�");
		System.out.println("	  3 > ��  ��  Ʈ");
		System.out.println("	  4 > ��	 	 ��");
		System.out.println("	  5 > ��  ��  ��");
		System.out.println("	  6 > �� �� �� ��");
		System.out.println("	  7 > �� �� �� ��");
		System.out.println("	  0 > ��		 ��");
		System.out.println("=============================");
	}

}
