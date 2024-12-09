// #학생 3명 국영수 점수 받아 => 총점/평균/학점 출력
//new 3번 => 메모리 공간 다르게 적용
import java.util.Scanner;

class Student//데이터형 => 배열 가능
{
	String name;
	int kor,eng,math;
	int total;
	double avg;
	char score;
	String school_name;//범위에 따라 다름 => 같은 학교:static(공유) / 다른 학교: 인스턴스(따로 저장)
}

public class 클래스_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std=new Student[3];//단순 배열 선언(생성자x)
		//초기화
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<std.length;i++)
		{
			std[i]=new Student();//학생에 대한 데이터 저장 메모리 주소 할당 => 한 사람당 메모리 주소 다름
			//System.out.println(std[i]);
			System.out.print((i+1)+"번째 국어 점수 입력:");
			std[i].kor=scan.nextInt();
			System.out.print((i+1)+"번째 영어 점수 입력:");
			std[i].eng=scan.nextInt();
			System.out.print((i+1)+"번째 수학 점수 입력:");
			std[i].math=scan.nextInt();
			
			std[i].total=std[i].kor+std[i].eng+std[i].math;
			
			std[i].avg=std[i].total/3.0;
			
			switch(std[i].total/30)
			{
			case 10: case 9:
				std[i].score='A';
				break;
			case 8:
				std[i].score='B';
				break;
			case 7:
				std[i].score='C';
				break;
			case 6:
				std[i].score='D';
				break;
		    default:
				std[i].score='F';
			}
			
		}
		//출력
		for(int i=0;i<std.length;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5c\n",std[i].kor,std[i].eng,std[i].math,std[i].total,std[i].avg,std[i].score);
		}

	}

}
