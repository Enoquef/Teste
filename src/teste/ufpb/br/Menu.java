package teste.ufpb.br;

public abstract class Menu implements FabricaAbstrata {
	
	protected String menu;
	

	public Menu(String menu) {
		this.menu = menu;
		
	}
	@Override
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}

	

}
