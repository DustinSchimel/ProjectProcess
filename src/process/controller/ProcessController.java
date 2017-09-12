package process.controller;

import process.model.PlayDohCircle;
import process.model.PlayDohCube;
import java.util.Scanner;

public class ProcessController
{
	public ProcessController()
	{
		
	}

	public void start()
	{
		System.out.println("This is a practicing project.");
		System.out.println("By practicing I develop muscle memory :D");
		
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		System.out.println("Look I made a circle");
		System.out.println(firstCircle);
		System.out.println(secondCircle);
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("How big of a circle do you want?");
		int circleSize = myScanner.nextInt();
		
		PlayDohCircle thirdCircle = new PlayDohCircle(circleSize);
		System.out.println(thirdCircle);
		
		PlayDohCube firstCube = new PlayDohCube();
		PlayDohCube secondCube;
		secondCube = new PlayDohCube();
		
		System.out.println("Look I made a cube");
		System.out.println(firstCube);
		System.out.println(secondCube);
		
		PlayDohCube thirdCube = new PlayDohCube(15);
		System.out.println(thirdCube);
		
		
		
	}
}
