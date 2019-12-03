package abstractMethod.ufpb.br;

public class TelaProjeto {
	
	private FabricaAbstrata fabrica;
	private Janela janela;
	private Menu menu;
	private Botao botao;
	
	public void montar() {
		this.janela = fabrica.criarJanela();
		this.menu = fabrica.criarMenu();
		this.botao = fabrica.criarBotao();
		
	}
	public String desenhar() {
		return janela.desenhar() +"{"+ menu.desenhar() +","+ botao.desenhar()+"}";
		
	}
	public void setFabrica(FabricaAbstrata fabrica) {
		this.fabrica = fabrica;
		
	}

}
