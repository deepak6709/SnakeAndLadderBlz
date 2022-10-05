package com.SnakeLadderBlz;

import java.util.Random;

public class Uc4WinnigBlz {

	static final int ladder = 1;
	static final int snake = 2;
	static final int noply = 0;

	public static void main(String[] args) {
		int postion = 0;

		Random rn = new Random();

		int dice1 = rn.nextInt(6) + 1;

		System.out.println("dice= " + dice1);

		int OptionCheck1 = rn.nextInt(3);

		System.out.println("OptionCheck=" + OptionCheck1);

		if (OptionCheck1 == ladder) {

			while (postion < 100) {

				Random r = new Random();

				int dice = r.nextInt(6) + 1;

				System.out.println("dice= " + dice);

				int OptionCheck = r.nextInt(3);

				System.out.println("OptionCheck=" + OptionCheck);

				if ((OptionCheck == ladder) && (postion + dice) < 100) {

					System.out.println("ladder=");

					postion = postion + dice;

					System.out.println("Position= " + postion);

				} else if (OptionCheck == snake) {

					System.out.println("snake=");

					postion = postion - dice;

					System.out.println("Position= " + postion);
				} else {

					System.out.println("Noplay");

				}
				if (postion < 0) {

					postion = 0;
					System.out.println("Position= " + postion);

				} else if (OptionCheck1 == snake) {

					System.out.println("snake=");
					postion = postion - dice;

				} else {

					System.out.println("Noplay");
				}
				if (postion < 0) {

					postion = 0;
					
					System.out.println("Position= " + postion);

				}

			}

		}
	}

}
