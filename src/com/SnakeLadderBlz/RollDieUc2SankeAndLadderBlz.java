package com.SnakeLadderBlz;

import java.util.Random;

public class RollDieUc2SankeAndLadderBlz {

	public static void main(String[] args) {
		int position=0;
		int count=0;
		
		System.out.println("Start position="+position);
		
		Random r=new Random();
		
		int dice=r.nextInt(6)+1;
		
		System.out.println("Dice outcome is="+dice);
		
		count++;
		
		System.err.println("Total count="+count);

	}

}
