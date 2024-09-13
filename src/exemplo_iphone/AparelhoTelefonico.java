package exemplo_iphone;

public class AparelhoTelefonico extends ABSTRACAO {
	public void ligar() {
		verificar_conta();
		System.out.println("CELULAR LIGADO");
	}
	
	public void verificar_conta() {
		System.out.println("VERIFICANDO LOGIN E SENHA DO CELULAR");
		}
}
