package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


import dto.Student;
import file.FileProc;

public class StudentDao {
	
	
	
	Scanner sc = new Scanner(System.in);
	private static ArrayList<Student> stu = new ArrayList<Student>();
	
	FileProc fp;
	public StudentDao() {
		
			fp = new FileProc("baseball"); 
			fp.createFile();

			this.loadData();
	}
	public void insert() {
		
	
		System.out.print("이름:");
		String name = sc.next();
		
		System.out.print("나이:");
		int age = sc.nextInt();
		
		System.out.print("영어:");
		int eng = sc.nextInt();
		
		System.out.print("수학:");
		int math = sc.nextInt();
		
		stu.add(new Student(name, age, eng, math));
		
		
	}
	
	public void delete() {
			
		System.out.print("삭제할 학생의 이름 = ");
		String name = sc.next();
		

		if(name.equals("")) {
			System.out.println("이름을 정확히 입력해 주십시오.");
			return;		
		}
		
		int findIndex = findSearchIndex(name);
		if(findIndex == -1) {
			System.out.println("명단에 없습니다. 삭제할 수 없습니다");
			return;
		}
		
	
		stu.remove(findIndex);
		}		
	
	public void search() {
		
		
		System.out.print("검색할 선수의 이름 = ");
		String name = sc.next();
		
		int findIndex = findSearchIndex(name);
		if(findIndex == -1) {
			System.out.println("명단에 없습니다.");
		}
		else {
			Student s = stu.get(findIndex);
			
			System.out.println("이름:" + s.getName());
			System.out.println("나이:" + s.getAge());
			System.out.println("영어 점수:" + s.getEng());	
			System.out.println("수학 점수:" + s.getMath());
			
			
	}
	}
	
	public void update() {	
				
		System.out.print("수정할 학생의 이름 = ");
		String name = sc.next();
		
		int findIndex = findSearchIndex(name);
		if(findIndex == -1) {
			System.out.println("명단에 없습니다.");
			return;
		}
		
		Student s = stu.get(findIndex);
		
		if(s instanceof Student) {
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			
			s.setEng(eng);
			s.setMath(math);
					
		}
		
	}
	
	public void allPrint() {
		for (int i = 0; i < stu.size(); i++) {		
			Student s = stu.get(i);
			System.out.print(s.toString());
			
			System.out.println();
			
		}		
	}
	
	public void chapSum() {	
		
		// 학생 수
		int count = 0;
		for (int i = 0; i < stu.size(); i++) {
			count++;		
		}
		System.out.println("학생 수:" + count);		
		// 영어, 수학 선택
		System.out.print("합계를 구할 과목을 선택,  영어(1), 수학(2) = ");
		int num = sc.nextInt();
		
		int sum = 0;
		for (int i = 0; i < stu.size(); i++) {	// 영어 student[][2] 수학 student[][3] 
			Student s = stu.get(i);
			if(num ==1) {
		sum = sum + s.getEng();		
			}
			else {
				sum = sum + s.getMath();	
			}
		}
		
		if(num == 1)	System.out.print("영어의 합계는 " );
		else			System.out.print("수학의 합계는 " );
			
		System.out.println(sum + "점입니다");		
	}
	
	public void chapAvg() {	
		// 학생 수
		int count = 0;
		for (int i = 0; i < stu.size(); i++) {
				count++;
		}
		System.out.println("학생 수:" + count);		
		
		// 영어, 수학 선택
		System.out.print("평균을 구할 과목을 선택,  영어(1), 수학(2) = ");
		int num = sc.nextInt();
		
		int sum = 0;
		for (int i = 0; i < stu.size(); i++) {	// 영어 student[][2] 수학 student[][3] 
			Student s = stu.get(i);
		   if(num == 1) {
			   sum = sum + s.getEng();
		   }else {
			   sum = sum + s.getMath();
		   }			
		}	
		double avg = (double)sum / count;
		
		if(num == 1)	System.out.print("영어의 평균은 ");
		else			System.out.print("수학의 평균은 ");
			
		System.out.println(avg + "점입니다");		
	}
	
	public static void sorting() {
	
		Student obj = null;
		for (int i = 0; i < stu.size() - 1; i++) {
			for (int k = i + 1; k < stu.size(); k++) {
				Student s = stu.get(i);
				Student e = stu.get(k);
				int b1 = s.getEng();
				int b2 = e.getEng();
				if(b1 < b2) {
					obj = stu.get(i);
					stu.set(i, stu.get(k));
					stu.set(k, obj);
			}
			
				}
			
		}		
		
		// 결과 출력
		System.out.println("정렬 후 영어성적순으로 결과 출력용 -----");
	/*	for (int i = 0; i < chuman.length; i++) {
			System.out.println(chuman[i].toString());
		}*/
		
		for (Student s : stu) {
			System.out.println(s.toString());
		}
	}
	
	public void saveData() {

		String datas[] = new String[stu.size()];
		for (int i = 0; i < stu.size(); i++) {
			Student s = stu.get(i);
			datas[i] = s.toString();
		}
			
		fp.saveData(datas);		
	}
	
	public void loadData() {
		String datas[] = fp.loadData();

		
		for (int i = 0; i < datas.length; i++) {

			String data[] = datas[i].split("-");
			
			int title = Integer.parseInt(data[0]);
			
			Student s = null; 
			s = ( Integer.parseInt(data[0]), 
								      data[1], 
										Integer.parseInt(data[2]), 
										Double.parseDouble(data[3]), 
										Integer.parseInt(data[4]), 
										Integer.parseInt(data[5]), 
										Double.parseDouble(data[6]) );
						
			stu.add(s);			
			
		}	// for end		
	}
	static int findSearchIndex(String name) {
		int findIndex = -1;
		for (int i = 0; i < stu.size(); i++) {
			Student s = stu.get(i);		
			if(name.equals(s.getName())) {
				findIndex = i;			
				break;
			}
		}
		return findIndex;
	}
}
