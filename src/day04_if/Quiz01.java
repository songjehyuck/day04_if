package day04_if;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*문제 1번
		Scanner input= new Scanner(System.in);
		double grade;
		System.out.print("평균 학점 입력:");
		grade=input.nextDouble();
		if(grade>=3.8) {
			System.out.println("축하합니다! 장학금 지급 대상자입니다.");
		}else {
			System.out.println("아쉽지만 장학금 지급 대상자가 아닙니다.");
		}
		System.out.println("당신의 평균 학점은 "+grade+"입니다.");
		*/
		//문제 2번
		/*
		Scanner input = new Scanner(System.in);
		int age;
		System.out.print("나이 입력:");
		age = input.nextInt();
		if(age>=30) {
			System.out.println("30대 이상입니다.");
		}else if(age>=20) {
			System.out.println("20대입니다.");
		}else if(age>=10) {
			System.out.println("10대입니다.");
		}else {
			System.out.println("10살 아래입니다.");
		}
		*/
		//문제 3번
		/*
		Scanner input=new Scanner(System.in);
		int year;
		System.out.print("년도를 입력하시오 : ");
		year= input.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("윤년이 아닙니다.");
		}
		*/
		//문제 4번
		/*
		Scanner input = new Scanner(System.in);
		int month;
		System.out.print("숫자를 입력해주세요 : ");
		month= input.nextInt();
		if(month==3||month==4||month==5) {
			System.out.println("현재 계절은 봄입니다.");
		}else if(month==6||month==7||month==8) {
			System.out.println("현재 계절은 여름입니다.");
		}else if(month==9||month==10||month==11) {
			System.out.println("현재 계절은 가을입니다.");
		}else if(month==12||month==1||month==2) {
			System.out.println("현재 계절은 겨울입니다.");
		}
		*/
		//문제 5번
		/*
		Scanner input= new Scanner(System.in);
		int kor, math, eng, average;
		System.out.print("국어,수학,영어 점수를 입력하시오:");
		kor=input.nextInt();
		math=input.nextInt();
		eng=input.nextInt();
		average=(kor+math+eng)/3;
		System.out.println("평균 : "+average);
		if(average>=90) {
			System.out.println("등급 : A");
		}else if(average>=80) {
			System.out.println("등급 : B");
		}else if(average>=70) {
			System.out.println("등급 : C");
		}else if(average>=60) {
			System.out.println("등급 : D");
		}else {
			System.out.println("등급 : F");
		}
		*/
	}
}

