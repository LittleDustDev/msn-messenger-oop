public class MSNMessenger {
	public void enviarMensagem() {
		//Confirmar se esta conectado a internet
		validarConectadoInternet();
		
		System.out.println("Enviando mensagem");
		
		//Depois de enviada, salva o histórico da mensagem
		salvarHistoricoMensagem();
		
		
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	//Métodos privados, visíveis somente na classe
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}