package br.com.teste.keepinshape;

import org.junit.Before;
import org.junit.Test;

import br.com.keepinshape.Exercicio;
import junit.framework.Assert;

public class TesteExercicio {
	
	private TesteExercicio testeExercicio;
	
	@Before
	public void config(){
		testeExercicio = new TesteExercicio();
	}
	

	@Test
	public void testCreate(){
		
		Exercicio expected = new Exercicio(new Integer(1), "Supino", 60, 30, 3, 100);
		Exercicio actual = new Exercicio(new Integer(1), "Supino", 60, 30, 3, 100);
		
		testeExercicio.assertExercicio(expected, actual);
		
	}
	
	@SuppressWarnings("deprecation")
	public void assertExercicio(Exercicio expected, Exercicio actual){
		Assert.assertEquals(expected.getNome(), actual.getNome());
		Assert.assertEquals(expected.getTempo(), actual.getTempo());
		Assert.assertEquals(expected.getPeso(), actual.getPeso());
		Assert.assertEquals(expected.getQuantidade(), actual.getQuantidade());
		Assert.assertEquals(expected.getPontuacao(), actual.getPontuacao());
	}

}
