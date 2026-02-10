package day10;

import java.util.Scanner;

public class Student {

	static Scanner s = new Scanner(System.in);
	
	private String stuNo;
	private String name;
	private int age;
	

	private int java;
	private int oracle;
	private int html;

	
	public Student(String stuNo, String name, int age) {
		this.stuNo = stuNo;
		this.name = name;
		this.age = age;
	}


	public String getStuNo() {
		return stuNo;
	}


	public void setStuNo(String stuNo) {
		
		this.stuNo = stuNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getJava() {
		
		return java;
	}

	// 오버로딩
	public void setJava() {  // 제어는 클래스에 있는 메서드 내에서 하는게 좋다.**
							 // 밖에 노출시키면 조작가능성있음 위험!
		
		// 메서드를 호출하면 메서드 안에서 입력받기
		
		while(true) {
			
			System.out.print("자바 : ");
			int java = s.nextInt();
			
			if(!(0 <= java && java <= 100)) {
				System.out.println("시험 점수 범위는 0~100 입니다.");
				continue;
			}
			
			this.java = java; ///참조값으로 바로 가서 담아둔다. //x003.java = java;
			
			break;
		}
		
		return; 
		
		//메서드 호출이 끝나면, 메서드를 호출한 곳으로 되돌아감!(기본)
	}
	
	public void setJava(int java) {  
		
		if(!(0 <= java && java <= 100)) {
			System.out.println("시험 점수 범위는 0~100 입니다.");
			return;
		}
		
		this.java = java;
	}


	public int getOracle() {
		return oracle;
	}

	///// 숙제(+) 메서드 오버로딩
	public void setOracle() {
		
		while(true) {
			
			System.out.print("오라클 : ");
			int oracle = s.nextInt();
			
			if(!(0 <= oracle && oracle <= 100)) {
				System.out.println("점수는 0~100 사이여야합니다!");
				continue;
			}
			
			this.oracle = oracle; // 참조값으로가서 바로 담는다
			
			break;
		}
		
		return;
		
		
	}
	
	public void setOracle(int oracle) {
		this.oracle = oracle;
	}


	public int getHtml() {
		return html;
	}

	//// 숙제(+) 메서드 오버로딩
	public void setHtml() {
		
		while(true) {
			
			System.out.print("html : ");
			int html = s.nextInt();
			
			if(!(0 <= html && html <= 100)) {
				
				System.out.println("점수는 0~100 사이여야합니다!");
				continue;
			}
			
			this.html = html; //참조값으로 가서 바로 업데이트!
			break;
		}
		return;
	}
	
	public void setHtml(int html) {
		this.html = html;
	}
	
	
	@Override
	public String toString() {
		String info = "{stuNo=" + this.stuNo 
				+ ", name=" + this.name 
				+ ", age=" + this.age
				+ ", java=" + this.java
				+ ", oracle=" + this.oracle
				+ ", html=" + this.html + "}";
		
		return info;
//		return this.name + "(" + this.stuNo + ")객체";
	}


	
}
