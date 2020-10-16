package main;

import java.util.Scanner;

import dao.StudentDao;

public class mainClass {
	public static void main(String[] args) {
		/*
		 * DTO DAO
		 * File
		 * ArrayList
		 * 
		 */
		StudentDao Dao = new StudentDao();
			Scanner sc = new Scanner(System.in);
			
			// data load
		//	String student[][] = dataLoad();
			

			int choice;
			

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
						Dao.insert();
						break;
					case 2:
						Dao.delete();					
						break;
					case 3:
						Dao.search();					
						break;
					case 4:
						Dao.update();
						break;
					case 5:
						Dao.allPrint();
						break;
					case 6:
						Dao.chapSum();
						break;
					case 7:
						Dao.chapAvg();
						break;
					case 8:
						Dao.sorting();
						break;
					case 9:
					//	Dao.dataSave();
						break;
				}			
			}
		}
	
	
	}


