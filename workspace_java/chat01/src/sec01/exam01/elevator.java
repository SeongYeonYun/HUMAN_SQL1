package sec01.exam01;

public class elevator {

	public static void main(String[] args) {
//		1. 5층 엘리베이터로 한다.
//		2. 고장이 났을 경우를 포함한다.
//		3. 만약 1000kg이상의 탔을때 경고를 표시한다. 사실상 불가능
//		4. 다른사람이 버튼을 누르지 않는이상 엘리베이터는 잠시 정지한다.
//		5. 한 층에 멈춘후 5초간 있다가 다음층으로 이동한다.
//		6. 처음 승강기를 움직이는 쪽이 우선권을 가진다.
//		7. 각층의 외부에는 누를수 위는 위 아래 버튼이 존재한다.
		
		
//		1. 각층의 위 아래 버튼을 구현하자.
//		2. 각층의 입력값을 고려한다.
//		3. 사람 한명의 몸무게를 60~80kg 사이의 난수값으로 1000kg을 계산한다.
//		4. 엘리베이터가 움직이는 동작을 구현하자

//		엘리베이터의 현제 위치를 저장하는 값 생성
//		각 층의 위 아래 버튼을 누른 순서값을 리스트에 저장
//		무게 데이터를 저장하는 값 생성
	
		// TODO Auto-generated method stub
		//알고리즘 이네 이거 scan알고림즘 
		class scan_algo{
			//현제 움직이는 방향을+ 와 -로 구분한뒤
			
			//자신의 현제 방향이 +인데 다음 이동해야 하는 층수(리스트) 값이
			//하나라도 자신의 현제 위치보다 위에 있으면 +방향 유지
			
			//자신의 현제 방향이 +인데 다음 이동해야 하는 층수(리스트) 값이 
			//모두 자신의 현제 위치보다  아래 있으면 -방향 변경
			
			
			//자신의 현제 방향이 -인데 다음 이동해야 하는 층수(리스트) 값이
			//하나라도 자신의 현제 위치보다 아래 있으면 -방향 유지
			
			//자신의 현제 방향이 -인데 다음 이동해야 하는 층수(리스트) 값이 
			//모두 자신의 현제 위치보다  위에 있으면 +방향 변경
			
			//만약 이동 리스트의 값이 비어있을경우 stop
			
			
		}
		
		//버튼이 입력된 위치와 방향, 어디서 어디로 가는지와 언제 눌렷는지 저장할 필요가 있다.
		int elevator_input;
		int floor_input;
		
		
		/////엘리베이터의 위치///////////
		//왜 엘리베이터는 0층이 없지????? 
		double ele_loc = 0; //연산상의 층수
		double ele_floor; //표면상, 표시상의 층수
		
		
		
		//만약 지하가 있을 겅우
		if(ele_loc<=0) {
			ele_floor = ele_loc - 1;			
			}
		
		else {
			ele_floor = ele_loc;
		}
		
		
		
		
		
		
		
	}

}
