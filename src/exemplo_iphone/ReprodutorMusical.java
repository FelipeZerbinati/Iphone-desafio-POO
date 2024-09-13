package exemplo_iphone;

public class ReprodutorMusical extends ABSTRACAO {
	public void ligar() {
		verificar_conta();
		System.out.println("REPRODUTOR MUSICAL LIGADO");
		playlist();
	}
	
	public void verificar_conta() {
		System.out.println("AUTENTICANDO LOGIN E SENHA DO IPOD");
	}
	    //ENCAPSULAMENTO
	private void playlist() {
		System.out.println("SUGERINDO PLAYLIST AO USUÁRIO");
	}
}
