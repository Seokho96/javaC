package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Answer {

	public static void main(String[] args) {
		/*
			학생 성적 관리
			String student[][];
			
			메뉴----
			1. 학생 정보 추가	insert	(예: 홍길동, 나이, 영어, 수학)
			2. 학생 정보 삭제	delete
			3. 학생 정보 검색	search
			4. 학생 정보 수정	update
			5. 학생 정보 모두 출력	
			
			6. 과목의 총점		1. 영어
			7. 과목의 평균
			
			8. 성적순으로 정렬 출력
			
			9. 데이터의 저장
		*/
		
		Scanner sc = new Scanner(System.in);
		
		// data load
		String student[][] = dataLoad();
		
		// String student[][] = new String[20][4];
		
		/*
		String student[][] = {
				{ "홍길동", "24", "100", "95" },
				{ "일지매", "21", "90", "80" },
				{ "임꺽정", "27", "85", "100" },
		};
		*/
		
		int choice;
		
		// 데이터의 Load
		/*
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length; j++) {
				student[i][j] = "";
			}
		}*/
		
		while(true) {
			System.out.println("-----------------메뉴");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 삭제");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 모두 출력");
			System.out.println("6. 과목의 총점");
			System.out.println("7. 과목의 평균");
			System.out.println("8. 성적의 정렬");			
			System.out.println("9. 데이터의 저장");
			
			System.out.println("메뉴 번호를 입력해 주십시오");
			System.out.print(">>> ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:		// 학생추가
					insert(student);
					break;
				case 2:
					delete(student);					
					break;
				case 3:
					search(student);					
					break;
				case 4:
					update(student);
					break;
				case 5:
					allPrint(student);
					break;
				case 6:
					chapSum(student);
					break;
				case 7:
					chapAvg(student);
					break;
				case 8:
					sorting(student);
					break;
				case 9:
					dataSave(student);
					break;
			}			
		}
	}
		 
	static void insert(String student[][]) {
		Scanner sc = new Scanner(System.in);
				
		int findIndex = -1;
		for (int i = 0; i < student.length; i++) {			
			if(student[i][0].equals("")) {	// 0 1 2
				findIndex = i;				
				break;
			}			
		}
		System.out.println("findIndex:" + findIndex);
						
		
		System.out.print("이름:");
		String name = sc.next();
		
		System.out.print("나이:");
		String age = sc.next();
		
		System.out.print("영어:");
		String eng = sc.next();
		
		System.out.print("수학:");
		String math = sc.next();
		
		student[findIndex][0] = name;
		student[findIndex][1] = age;
		student[findIndex][2] = eng;
		student[findIndex][3] = math;
		
		System.out.println("입력완료:" + student[findIndex][0]);
	}
	
	static void delete(String student[][]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삭제할 학생의 이름 = ");
		String name = sc.next();
		
		int findIndex = getSearchIndex(student, name);
		
		if(findIndex != -1) {
			student[findIndex][0] = "";
			student[findIndex][1] = "";
			student[findIndex][2] = "";
			student[findIndex][3] = "";	
			System.out.println("데이터를 삭제하였습니다");
		}else {
			System.out.println("데이터를 찾을 수 없습니다");
		}		
	}
	
	static void search(String student[][]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 선수의 이름 = ");
		String name = sc.next();
		
		/*
		int findIndex = -1;
		for (int i = 0; i < student.length; i++) {
			String n = student[i][0];			
			if(n.equals(name)) {
				findIndex = i;			
				break;
			}
		}
		*/
		int findIndex = getSearchIndex(student, name);
		
		if(findIndex != -1) {	// 찾았다
			System.out.println("데이터를 찾았습니다");
			System.out.println("이름:" + student[findIndex][0]);
			System.out.println("나이:" + student[findIndex][1]);
			System.out.println("영어:" + student[findIndex][2]);
			System.out.println("수학:" + student[findIndex][3]);
		}else {
			System.out.println("데이터를 찾을 수 없습니다");
		}		
	}
	
	static void update(String student[][]) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수정할 학생의 이름 = ");
		String name = sc.next();
		
		int findIndex = getSearchIndex(student, name);
		
		if(findIndex != -1) {
			System.out.println("수정 데이터를 입력해 주십시오.");
			System.out.print("영어:");
			String eng = sc.next();
			
			System.out.print("수학:");
			String math = sc.next();
			
			student[findIndex][2] = eng;
			student[findIndex][3] = math;
			
			System.out.println("데이터가 수정되었습니다");
			
		}else {
			System.out.println("데이터를 찾을 수 없습니다");			
		}	
	}
	
	static void allPrint(String student[][]) {
		for (int i = 0; i < student.length; i++) {		
			if(student[i][0] == null || student[i][0].equals("") == false) {
				System.out.print(student[i][0] + " " + student[i][1] + " " + student[i][2] + " " + student[i][3]);
				System.out.println();
			}
		}		
	}
	
	static void chapSum(String student[][]) {
		Scanner sc = new Scanner(System.in);
		// 학생 수
		int count = 0;
		for (int i = 0; i < student.length; i++) {
			if(!student[i][0].equals("")) { // student[i][0].equals("") == false
				count++;
			}
		}
		System.out.println("학생 수:" + count);		
		int arrSum[] = new int[count];
		
		// 영어, 수학 선택
		System.out.print("합계를 구할 과목을 선택,  영어(1), 수학(2) = ");
		int num = sc.nextInt();
		
		int sum = 0;
		for (int i = 0; i < student.length; i++) {	// 영어 student[][2] 수학 student[][3] 
			if(!student[i][0].equals("")) {
				sum = sum + Integer.parseInt( student[i][num + 1] );
			}			
		}
		
		if(num == 1)	System.out.print("영어의 합계는 ");
		else			System.out.print("수학의 합계는 ");
			
		System.out.println(sum + "점입니다");		
	}
	
	static void chapAvg(String student[][]) {
		Scanner sc = new Scanner(System.in);
		// 학생 수
		int count = 0;
		for (int i = 0; i < student.length; i++) {
			if(!student[i][0].equals("")) { // student[i][0].equals("") == false
				count++;
			}
		}
		System.out.println("학생 수:" + count);		
		int arrSum[] = new int[count];
		
		// 영어, 수학 선택
		System.out.print("평균을 구할 과목을 선택,  영어(1), 수학(2) = ");
		int num = sc.nextInt();
		
		int sum = 0;
		for (int i = 0; i < student.length; i++) {	// 영어 student[][2] 수학 student[][3] 
			if(!student[i][0].equals("")) {
				sum = sum + Integer.parseInt( student[i][num + 1] );
			}			
		}
		
		double avg = (double)sum / arrSum.length;
		
		if(num == 1)	System.out.print("영어의 평균은 ");
		else			System.out.print("수학의 평균은 ");
			
		System.out.println(avg + "점입니다");		
	}
	
	static void sorting(String student[][]) {		
		String sortDatas[][] = new String[student.length][student[0].length];
		
		System.out.println(student[0].length);
		
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[0].length; j++) {				
				sortDatas[i][j] = student[i][j];
			}
		}
		
		// student[][2];
		String temp[] = null;
		for (int i = 0; i < sortDatas.length - 1; i++) {
			for (int j = i + 1; j < sortDatas.length; j++) {
				
				if(!sortDatas[i][2].equals("") && !sortDatas[j][2].equals("")) {
					
					int num1 = Integer.parseInt(sortDatas[i][2]);
					int num2 = Integer.parseInt(sortDatas[j][2]); 
					if(num1 > num2) {
						temp = sortDatas[i];
						sortDatas[i] = sortDatas[j];
						sortDatas[j] = temp;
					}
				}
			}			
		}
		
		for (int i = 0; i < sortDatas.length; i++) {
			if(!sortDatas[i][0].equals("")) {
				System.out.println(sortDatas[i][0] + " " 
									+ sortDatas[i][1] + " " 
									+ sortDatas[i][2] + " " 
									+ sortDatas[i][3]);
			}
		}
	}
	
	static void dataSave(String student[][]) {
		/*
			이름-나이-영어-수학
			이름-나이-영어-수학
			이름-나이-영어-수학
		*/		
		int count = 0;
		for (int i = 0; i < student.length; i++) {
			if(!student[i][0].equals("")) { // student[i][0].equals("") == false
				count++;
			}
		}
		
		String saveData[] = new String[count];
		for (int i = 0; i < saveData.length; i++) {
			saveData[i] = student[i][0] + "-" 
							+ student[i][1] + "-"
							 + student[i][2] + "-"
							  + student[i][3];							
		}
		
		for (int i = 0; i < saveData.length; i++) {
			System.out.println(saveData[i]);
		}		
		
		File file = new File("d:\\tmp\\student.txt");
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			for (int i = 0; i < saveData.length; i++) {
				pw.println(saveData[i]);
			}
			pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}						
	}
	
	static String[][] dataLoad() {
		
		String str[] = null;
		// 파일 읽기
		File file = new File("d:\\tmp\\student.txt");
		try {
			FileReader fr = new FileReader(file);
			
			// 데이터 갯수
			int count = 0;
			String s;
			BufferedReader br = new BufferedReader(fr);
			while( (s = br.readLine()) != null ) {
				count++;
			}
			br.close();
			
			// 할당
			str = new String[count];
			
			// 데이터를 저장
			int i = 0;
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while( (s = br.readLine()) != null ) {
				str[i] = s;
				i++;
			}			
			// student[][] return
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		*/
		// student[][] <- str[]
		
		String student[][] = new String[20][4];
		
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length; j++) {
				student[i][j] = ""; 
			}
		}
		
		for (int i = 0; i < str.length; i++) {
			
			String s = str[i];	// 홍길동-24-90-100
			String split[] = s.split("-");		
			
			student[i][0] = split[0];
			student[i][1] = split[1];
			student[i][2] = split[2];
			student[i][3] = split[3];
		}
		
		return student;		
	}
	
	static int getSearchIndex(String student[][], String name) {
		int findIndex = -1;
		for (int i = 0; i < student.length; i++) {
			String n = student[i][0];			
			if(n.equals(name)) {
				findIndex = i;			
				break;
			}
		}
		return findIndex;
	}
	
	

}





