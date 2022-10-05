package com.SnakeLadderBlz;

import java.util.Random;

public class SankeLadderUc3Blz {

	static final int ladder = 1;
	static final int snake = 2;
	static final int noplay = 0;

	public static void main(String[] args) {

		int position = 0;
		int count = 0;

		System.out.println("Start position=" + position);

		Random r = new Random();

		int dice = r.nextInt(6) + 1;

		System.out.println("Dice outcome is=" + dice);

		int optionCheck = r.nextInt(3);

		System.out.println("Option Check=" + optionCheck);

		if (optionCheck == ladder) {

			System.err.println("It is Ladder");

			position = position + dice;

		} else if (optionCheck == snake) {

			System.err.println("It Is snake");

			position = position - dice;
		} else {

			System.out.println("No play");
		}
	
		count++;

		System.err.println("Toatl Count= " + count);
	}

}
