package exemplo_iphone;

public class NavegadorInternet extends ABSTRACAO {
	private void conectarWifi() {
		System.out.println("CONECTANDO AO WIFI");
	}
	
	public void ligar() {
		conectarWifi();
		System.out.println("INICIANDO O NAVEGADOR EXPLORER");
		verificar_conta();
	}
	
	public void verificar_conta() {
		System.out.println("VERIFICANDO CONTA EXPLORER");
	}
	
}
