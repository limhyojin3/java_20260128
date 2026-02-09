package day9;

public class GStack<T> {

	int tos;  //위치
	Object [] stck;
	
	public GStack() {
	tos = 0; 
	stck = new Object [10];
	}
	
	public void push(T item) {
	if(tos == 10) {
		return; 
	}
	stck[tos] = item; //2번인덱스에 넣고
	tos++; //tos = 3이됨.
	}
	
	public T pop() { //3개 들어가있으면 tos=3  인덱스는 0,1,2번 까지 있음.
	if(tos == 0) {
		return null;
	}
	tos--; //2번인덱스 꺼내기 => tos = 3 -> tos= 2로 만들기
	return (T)stck[tos]; //2번 인덱스 꺼내기  (T)stack[2];
	}
}
