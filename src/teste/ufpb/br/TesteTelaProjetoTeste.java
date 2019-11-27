package teste.ufpb.br;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteTelaProjetoTeste {

	@Test
	void test() {
		TelaProjeto t = new TelaProjeto();
		t.setFabrica( new Fabrica(JanelaWindows));
		t.Montar();
		t.Desenhar();
		
		assertEquals("JanelaWindows { MenuWindows BotaoWindows }", t.Desenhar());
	}

}
