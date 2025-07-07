package com.learning.statics;

public class PlayerTestDrive {

    public static void main(String[] args) {
		System.out.println("Inside main method...");
        System.out.println("Player.playerCount = " + Player.playerCount);

        Player one = new Player("Tiger Woods");
        System.out.println("Player.playerCount = " + Player.playerCount);
		System.out.println("one.count = " + one.count);

        Player two = new Player("Nadal");
        System.out.println("Player.playerCount = " + Player.playerCount);
		System.out.println("two.count = " + two.count);

        two.play();
        go();
    }

    public static void go() {
        System.out.println("Hey it's done");
    }

	static {
		System.out.println("Inside static block...");
	}

}


class Player {
    static int playerCount;
    int count;
	String name;

    Player(String name) {
        this.name = name;
        playerCount++;
        count++;
    }

    public void play() {
		System.out.println();
        System.out.println("Player:play()");
        System.out.println("playerCount = " + playerCount);
        Player three = new Player("Manish");
        Player four = new Player("Sandesh");
        Player five = new Player("Kiran");
        System.out.println("Count = " + five.count);
    }
}