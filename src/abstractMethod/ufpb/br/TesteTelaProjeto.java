package abstractMethod.ufpb.br;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteTelaProjetoTeste {

	@Test
	void test() {
		TelaProjeto t = new TelaProjeto();
		t.setFabrica( new FabricaWindows());
		t.montar();
		
		
		assertEquals( "janelaWindows{menuWindows,botaoWindows}" , t.desenhar());
	}
	@Test
	void test1() {
		TelaProjeto t = new TelaProjeto();
		t.setFabrica( new FabricaAndroid());
		t.montar();
		
		
		assertEquals( "janelaAndroid{menuAndroid,botaoAndroid}" , t.desenhar());
	}

}
