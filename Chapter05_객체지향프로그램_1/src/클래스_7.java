/*
 *   프로그램 : 설계
 *   설계
 *    - 변수: 데이터
 *    - 메소드: 기능
 *   -------------
 *      class ====> 메모리에 저장 ====> 활용 ====> 객체 소멸
 *                  객체/인스턴스
 *                  
 *      class 클래스명
 *      {
 *          사용할 데이터 설정: 웹 => 상세보기 ==> 변수
 *          데이터 활용도 ==> 메소드
 *          변수 => 데이터 수집 => 생성자, 초기화 블록
 *      }
 *      
 *      메모리에 저장 => Call By Reference 가능
 *             => 여러 개의 변수 제어
 *             ----변수
 *      클래스명 객체명=new 클래스명()
 *      ------      ---클래스 크기에 맞게 메모리 생성
 *      데이터형(사용자 정의) | => 객체명에 생성된 주소를 넘겨줌
 *                         => new: 리턴형 => 메모리 주소(정수형)
 *                            new: 메소드
 *                                int malloc(클래스) => 메모리 저장 => 주소값 리턴
 *                                => 승격 => new 등장
 *                                => 메모리 해제 => free() => delete(이젠 사용 안 함 => GC)
 *                                
 *   객체 활용
 *   객체명.변수 , 객체명.메소드 , ...
 *   
 *   객체 소멸
 *   객체명=null
 *   ==> 생명 주기
 *   
 *   설계 => 저장 => 활용 => 소멸
 *   -------------------------
 *   소멸 => GC가 바로 회수하지 않음 => 프로그램 종료시 회수
 *   => 윈도우 / 웹 => 최적화
 *   -------------------------
 *   눈에 보이거나 가상 세계 => 객체화 => 시뮬레이션
 *   
 */
/*
 *  *** class ClassName
 *  {
 *    1. 선언 => 기본값으로 초기화
 *              int=0
 *              long=0L
 *              double=0.0
 *              boolean=false
 *              String=null(주소가 없는 상태)
 *    2. 선언과 동시에 값을 지정
 *              int a=10 => 명시적 초기화
 *    ==> 연산처리, 메소드 호출, 제어문 모두 불가
 *    
 *    int a;
 *    a=10; ==> 불가
 *    
 *    int a;
 *    {
 *     a=10;    => 인스턴스 블록
 *    }
 *    ==> 가능
 *    
 *    
 *  }
 */
public class 클래스_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
