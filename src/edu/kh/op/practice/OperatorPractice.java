package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
		
	public void  practice1() {
		/*
		 * 모든사람이 사탕을 골고루 나눠가지려고 한다 .
		 * 인원 수와 사탕 개수를 키보드로 입력을 받고
		 * 1인당 동일하게 나눠가진 사탕 개수와 
		 * 나눠주고 남은 사탕의 개수를 출력하세요.
		 * 
		 * [실행화면]
		 * 인원 수 :29
		 * 사탕 개수 :100
		 * 1인당 사탕 개수 :3
		 * 남는 사탕 개수 : 13*/
		
		
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
		
		/*
		 * 키보드로 입력 받은 값들을 변수에 기록하고
		 * 저장된 변수 값을 화면에 출력하세요
		 * ex.
		 * 이름 :홍길동
		 * 학년(정수만) :
		 * 반(정수만) :
		 * 번호(정수만) : 15
		 * 성별(남학생/여학생) : 남학생
		 * 성적(소수점 아래 둘째 자리까지) : 85.75
		 * 3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.
		 *
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름  : ");
	    String input3 = scanner.next();
	    
	    System.out.print("학년(정수만) : ");
	    int input4 = scanner.nextInt();
	    
	    System.out.print("반(정수만) : ");
	    int input5  = scanner.nextInt();
	   
	    System.out.print("번호(정수만) : ");
	    int input6  = scanner.nextInt();
	    
	    System.out.print("성별(남학생/여학생) : ");
	    String input7 = scanner.next();
	   
	    System.out.print("성적(소수점 아래 둘째 자리까지) : ");
	    float input8 = scanner.nextFloat();
	    
	    
	    //System.out.println(input3 + "학년 " + input4 + "반 " + input5 + "번호 " + input3 + input7
	    		 //+ "의 " +"성적은 "  + input8 + "이다.");
	    System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다.",
	    				input4, input5 , input6 , input3 , input7 , input8 );	    
	}
	public void practice3() {
		/*
		 * 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 세 과목에 대한 합계와 평균을 구하세요.
		 * [실행화면]
		 * 국어 :60
		 * 영어 :80
		 * 수학 :40
		 * 합계 :180
		 * 평균 :60.0*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int input9 = scanner.nextInt();
		
		System.out.print("영어 : ");
		int input10 = scanner.nextInt();
		
		System.out.print("수학 : ");
		int input11 = scanner.nextInt();
		
		int sum = input9 + input10 + input11; // 합계
		double avg = sum / 3.0 ; //평균
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f " , avg);
		
		
		
		
		
		
	}
}
