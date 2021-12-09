package com.sist.main;
/*
 * 
 *   2021.12.09 => 기본 정리 
 *   1. 변수 (메모리 저장 공간) ==> 20page , 25page 28page~29page
 *                              32page
 *      => 데이터형 
 *      정수 : byte => 파일입출력 / 네트워크 전송
 *            int 
 *            long 
 *      실수 : double
 *      문자 : char ===> 싱글(ASC => 1byte) / 멀티 (Unicode = 2byte)
 *      논리 : boolean 
 *      참조 : 배열(1차:고정) => 가변 (Collection) / 클래스
 *      *** 형변환 (데이터형 변경)  => 클래스에서 형변환 (80page)
 *                                ===== 크기 (is-a,has-a)
 *                                is-a : 상속 (재사용 => 변경해서 사용ㄴ)
 *                                has-a : 포함 (재사용 => 변경없아 사용)
 *          자동 형변환 : => UpCasting
 *            10+10.5 => 자바는 같은 데이터형만 연산이 가능 
 *            ==
 *            10.0
 *            10.0+10.5 = 20.5
 *          강제 형변환 : => DownCasting
 *            10+(int)10.5
 *          ****** int이하(byte,short,char) 데이터형이 연산되면 int
 *          byte + byte = int 
 *          char + char = int  
 *   2. 연산자 (연산자,피연산자)
 *      단항연산자 93page
 *        = 증감연산자 (++,--)
 *        = 부정연산자 (!)
 *        = 형변환 연산자 (type)
 *      이항연산자 
 *        = 산술연산자 (+ ,- , * , / , %) 97page
 *          + => 문자열 결합 , 실제 산술연산 
 *          / => 0으로 나눌수 없다
 *            => 정수/정수=정수 
 *          % => 부호가 왼쪽편이다 
 *          -5 % -2 ==> -1  
 *           5 % -2 ==> 1
 *        = 비교연산자 ( == , != , < , > , <= ,>=) => boolean
 *          109page
 *        = 논리연산자 ( &&(직렬) , ||(병렬)) 114page
 *                    효율적인 연산 처리 (118page) 
 *                    (조건) && (조건)
 *                    =====
 *                     false 
 *                    (조건) || (조건)
 *                     true      
 *                    
 *        = 대입연산자 (= , += , -=) 132page
 *    3. 제어문 
 *       = 조건문 형식
 *         = 단일 조건문 (if)
 *         = 선택 조건문 (if~else)
 *         = 다중 조건문 (if ~ else if ~ else if ~ else)
 *       = 선택문 (switch~ case)
 *         게임 (Application) => 네트워크 
 *       = 반복문 ==> 156page
 *          = while : 반복횟수가 없는 경우 (1차)
 *          = do~while : 한번이상 수행 (1차)
 *          = for : 반복횟수 지정 (2차)
 *                  정렬 /  구구단 => 알고리즘 
 *       = 반복제어문 175page
 *          = break : 반복 중단
 *          = continue : 특정 부분 제외 
 *       ================== 연산자 + 제어문 = 메소드
 *       
 *     4. 모아서 관리
 *        데이터를 모아서 관리 = 배열(형식) 
 *        명령문을 모아서 관리 = 메소드 
 *        ========================= + 클래스 (재사용이 가능)
 *        HW / SW
 *        70년대 ==> 집적회로 (필요할때 재사용)
 *        =============================== (80년대) 모방 (클래스)
 *        
 *     5. 배열 (1차)
 *        = 연속적인 메모리 구조 
 *        =  초기화
 *        = 인덱스 (0번)
 *        int[] arr
 *        arr[0] ==> arr+0
 *        arr[1] ==> arr+4
 *     6. 메소드 
 *        ======================================
 *            결과값 (리턴형)    매개변수 (사용자 요청)
 *        ======================================
 *          = 사용자가 로그인 요청 : id,password 
 *          = 매개변수 (id,password)
 *          = 로그인 OK, Fail ==> boolean
 *          
 *          boolean isLogin(String id,String pwd)
 *          
 *                    
 *                 O               O
 *        ======================================
 *          난수 , 문자열 자르기 
 *          double Math.random() 
 *        
 *                 O               X
 *        ======================================
 *           메소드 자체 처리 ==> void (insert,update,delete)
 *           System.out,println("sdsjdjsj")
 *                 X               O
 *        ======================================
 *                 X               X
 *        ======================================
 *        
 *     7. 객체 지향 (재사용)
 *     8. 클래스 
 *        = 구성요소
 *          변수 (클래스,배열)
 *          메소드 (연산자+제어문)
 *          생성자 (초기화)
 *     9. 캡슐화(시큐어 코딩) => 의무화 
 *        = 데이터 보호 
 *        = 경계 
 *        = 변수 => private , 메소드 => public 
 *     10. 재사용 (상속/포함)
 *         상속 : 변경이 있는 경우 (기존에 소스를 변경)
 *         포함 : 변경이 없는 경우 (그대로 사용)
 *     11. 변경 / 추가 => 다형성 
 *         변경 : 오버라이딩 
 *         추가 : 오버로딩 
 *     =============================================
 *     11. 클래스 종류
 *         = 일반 클래스 
 *           : 용도 
 *             = 데이터만 관리 (읽기/쓰기) => 데이터형 클래스
 *                   ~VO (MovieVO,FoodVO) , ~DTO
 *             = 기능 추가 관리 => 액션 클래스 
 *                   ~DAO , ~Manager , ~Service
 *         = 추상 클래스 : 공통적인 내용을 모아서 관리 
 *         = 인터페이스 
 *         = 내부클래스 
 *            = 멤버클래스 (네크워크 , 쓰레드)
 *               => 데들락 
 *            = 익명의 클래스 (상속없이 오버라이딩이 가능)
 *            = 지역클래스 (사용빈도가 거의 없다)
 *     12. 예외처리 => 비정상 종료를 방지하고 정상수행이 가능 
 *                   사전에 에러를 방지할 목적 
 *         = 예외 복구 (try~catch)
 *         = 예외 회피 (throws)
 *     13. 라이브러리 
 *         java.lang
 *           = Object
 *           = String 
 *           = StringBuffer
 *           = Wrapper
 *           = Math
 *         java.util
 *           = Date , Calendar 
 *           = StringTokenizer 
 *           = Collection 
 *           = Format
 *         java.io
 *           = 파일 저장 
 *           = 다운로드 
 *           = 업로드 
 *         java.net 
 *           = URL 
 *           = Socket
 *           
 *         기타 => 외부 라이브러리 (jsoup,simplejson...)
 *         java.sql => 오라클 연결 
 *         
 *      ============================================
 *      네트워크 => 온라인 게임 , ERP , 화상 (X)
 *      데이터베이스(웹) => 주력  (CURD) 
 *   
 *            
 *       
 *      
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 배열 => 1차 
		// 배열 선언
		/*
		 *   int[] 배열명 => 자바 
		 *   int 배열명[] => C
		 */
		int[] arr={1,2,3,4,5}; // 선언과 동시에 초기화 
		// int[] arr=new int[5]; => 0으로 초기화 => 나중에 값을 채운다
		// 정렬 처리 
		// 배열의 초기화 
		// 읽기 => 출력 (반복문) 
		for(int i:arr) // for-each (웹) => 제어(값변경(X))=> 출력만 
		{
			System.out.println(i);
		}
		/*
		 *   for(저장된 데이터형 변수명:배열/컬렉션)
		 *     
		 */
		String[] title={
				"스파이더맨-노 웨이 홈",
				"몬스타엑스 : 더 드리밍",
				"듄",
				"돈 룩 업",
				"연애 빠진 로맨스"
		};
		double[] reserve= {
				67.3,9.2,4.1,4.0,1.8
		};
		// 인덱스 번호를 이용해서 동시에 출력 
		for(int i=0;i<title.length;i++)
		{
			System.out.println(title[i]+"(예매율:"+reserve[i]+"%)");
		}
		
		// 예매율이 가장 높은 영화명 출력 
		double max=0.0;
		int index=0;
		for(int i=0;i<reserve.length;i++)
		{
			if(max<reserve[i])
			{
				max=reserve[i];// 가장 높은 예매율 
				index=i;// 영화명을 찾기 위한 index 저장
			}
		}
		
		// 결과 
		System.out.println(title[index]);
		System.out.println("예매율:"+max);
		
	}

}









