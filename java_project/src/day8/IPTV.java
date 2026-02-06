package day8;

public class IPTV extends ColorTV{
	
	private String addr;
	
	
	public IPTV(String addr, int size, int color) {
		super(size, color); //부모의 생성자를 지정해서 호출
		this.addr = addr;
	}
	
	@Override
	public void printProperty() {
//		System.out.println("나의 IPTV는 " + addr + " 주소의 "
//				+ super.getSize() + "인치 " + super.getColor() + "컬러"); 둘다가능
		System.out.print("나의 IPTV는 " + addr + " 주소의 ");
		super.printProperty(); //System.out.println(getSize() + "인치 " + color + "컬러");
		
	}

}
