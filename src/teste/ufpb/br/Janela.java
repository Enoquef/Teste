package teste.ufpb.br;

public abstract class Janela implements FabricaAbstrata{
	 
	protected String janela;

	public Janela(String janela) {
		this.janela = janela;	
	}
	@Override
	public String getJanela() {
		return janela;
	}
	
	public void setJanela(String janela) {
		this.janela = janela;
	}

}
