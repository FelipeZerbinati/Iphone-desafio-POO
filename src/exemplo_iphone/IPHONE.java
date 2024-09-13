package exemplo_iphone;

public class IPHONE {
	public static void main(String[] args) {
		AparelhoTelefonico iphone = new AparelhoTelefonico();
		iphone.ligar();
		
		ReprodutorMusical ipod= new ReprodutorMusical();
		ipod.ligar();
		
		NavegadorInternet explorer = new NavegadorInternet();
		explorer.ligar();
		
		ABSTRACAO coringa = iphone;
		coringa.ligar();
	}
}
