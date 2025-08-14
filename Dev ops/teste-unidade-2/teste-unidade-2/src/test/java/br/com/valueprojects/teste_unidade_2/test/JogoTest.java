package br.com.valueprojects.teste_unidade_2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.valueprojects.teste_unidade_2.model.*;
import br.com.valueprojects.teste_unidade_2.builder.*;

public class JogoTest {
	
		
	@Test
	public void deveTerJogoComUnicoParticipante() {
		Jogo jogo = new Jogo("Jogo de corrida");
		assertEquals(0, jogo.getResultados().size());

		jogo.anota(new Resultado(new Participante("Leonardo"), 150));

		assertEquals(1, jogo.getResultados().size());

		assertEquals(150.0, jogo.getResultados().get(0).getMetrica(), 0.00001);
	}
	
	

	@Test
	public void deveTerVariosResultados() {
		Jogo jogo = new CriadorDeJogo()
        .para("Cata moedas")
        .resultado(new Participante("Nelson"), 150.0)
        .resultado(new Participante("Pedro"), 200.0)
        .constroi();

		assertEquals(2, jogo.getResultados().size());
		assertEquals(150.0, jogo.getResultados().get(0).getMetrica(), 0.00001);
		assertEquals(200.0, jogo.getResultados().get(1).getMetrica(), 0.00001);
		
	}
	
	@Test
	public void naoDeveAceitarDoisResultadosDoMesmoParticipante(){

		Jogo jogo = new Jogo("Ca�a pe�as");
		Participante leonardo = new Participante("Leonardo");

		jogo.anota(new Resultado(leonardo, 500.0));
		//deve ser ignorado
		jogo.anota(new Resultado(leonardo, 600.0));

		assertEquals(1, jogo.getResultados().size());
        assertEquals(500, jogo.getResultados().get(0).getMetrica(), 0.00001);
		}

	
	@Test
	public void deveCalcularMediaDosResultados() {
		//cenario
		Jogo jogo = new Jogo("Caca pecas");
		Participante joel = new Participante("Joel");
		Participante rafael = new Participante("Rafael");
		Participante thais = new Participante("Thais");
		Participante guilherme = new Participante("Guilherme");
		Participante vini = new Participante("Vinicius");
		
		jogo.anota(new Resultado(joel, 350.0));
		jogo.anota(new Resultado(rafael, 100.0));
		jogo.anota(new Resultado(thais, 400.0));
		jogo.anota(new Resultado(guilherme, 275.0));
		jogo.anota(new Resultado(vini, 650.0));
		
		//execucao
		double media = jogo.avaliarMedia(jogo);
		
		//resultados
		assertEquals(355.0, media, 0.00001);
	}
	

	@Test
	public void deveRetornarMediaVaziaParaJogosSemResultados() {
		
		//cenario
		Jogo jogo = new Jogo("Caca pecas");
		
		//execucao
		double media = jogo.avaliarMedia(jogo);
		
		//resultados
		assertEquals(Double.NaN, media, 0.00001);
	}

}