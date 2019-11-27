package teste.ufpb.br;

public abstract class Botao implements FabricaAbstrata{
	protected String botao;

	public Botao(String botao) {
		this.botao = botao;
		
	}
	@Override
	public String getBotao() {
		return botao;
	}
	public void setBotao(String botao) {
		this.botao = botao;
	}

}
