package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
		
	public void  practice1() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("인원수 : ");
		int input1 = scanner.nextInt();
		System.out.print("사탕 개수 : ");
		int input2 = scanner.nextInt();
		
		System.out.println();
		System.out.println("1인당 사탕 개수 : " + input2 / input1);
		System.out.println("남은 사탕 개수 : " + input2 % input1);
		
		
	}
	public void practice2() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름  : ");
	    String input3 = scanner.nextLine();
	    System.out.print("학년(정수만) : ");
	    int input4 = scanner.nextInt();
	    System.out.print("반(정수만) : ");
	    int input5  = scanner.nextInt();
	    System.out.print("번호(정수만) : ");
	    int input6  = scanner.nextInt();
	    System.out.println("성별(남학생/여학생)  : 남학생" );
	    String input7 = scanner.nextLine();
	    System.out.print("성적(소수점 아래 둘째 자리까지) : ");
	    float input8 = scanner.nextFloat();
	    
	    System.out.println();
	    System.out.println(input3 + "학년 " + input4 + "반 " + input5 + "번호 " + input3 + "남학생"
	    		 + "의 " +"성적은 "  + input8 + "이다.");
	    	    
	}
	public void practice3() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int input9 = scanner.nextInt();
		System.out.print("영어 : ");
		int input10 = scanner.nextInt();
		System.out.print("수학 : ");
		int input11 = scanner.nextInt();
		
		System.out.println();
		System.out.println("합계 : " + (input9 + input10 + input11));
		System.out.println("평균 : " + (float)(input9 + input10 + input11) / 3);
		
		
		
		
		
		
	}
}
