/*
 *   키보드 입력
 *   1) BufferedReader => java.io
 *      => 예외처리
 *   2) Scanner => java.util
 *   
 *   다른 폴더에 있는 경우에 클래스를 읽어온다
 *   ***import를 이용한다
 */
import java.util.Scanner;
public class 연산자_이항연산자_산술연산자4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스를 메모리에 저장 => new
		Scanner scan=new Scanner(System.in);
		// System.in => 키보드입력값을 받는다
		System.out.println("국어 입력:");
		int kor=scan.nextInt();//입력한 정수값 읽기
		
		System.out.println("수학 입력:");
		int math=scan.nextInt();//입력한 정수값 읽기
		
		System.out.println("영어 입력:");
		int eng=scan.nextInt();//입력한 정수값 읽기
		
		System.out.println(kor);
		System.out.println(math);
		System.out.println(eng);
		
	}

}
