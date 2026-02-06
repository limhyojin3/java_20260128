package day8;

public class TVMain {

	public static void main(String[] args) {
		
		ColorTV myTV = new ColorTV(32, 1024); //TV를 상속받은 ColorTV 클래스
		myTV.printProperty();  //32인치 1024컬러
		
		//ColorTV를 상속받는 IPTV 클래스
		//"192.1.1.2" 주소에 32인치, 2048컬러
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); 
		iptv.printProperty(); //나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
	}

}
