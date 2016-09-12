package br.com.teste.keepinshape;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.keepinshape.Exercicio;
import br.com.keepinshape.core.ExercicioDAOImpl;
import junit.framework.Assert;

public class TesteExercicio {
	
	private TesteExercicio testeExercicio;
	private ExercicioDAOImpl exercicioDAOImpl;
		
	
	@Before
	public void config(){
		testeExercicio = new TesteExercicio();
		exercicioDAOImpl = new ExercicioDAOImpl();
	}
	

	@Test
	public void testCreate(){
		
		Exercicio expected = new Exercicio(new Integer(1), "Supino", 60, 30, 3, 100);
		exercicioDAOImpl.createExercicio(expected);
		
		Exercicio actual = exercicioDAOImpl.findByExercicio(expected);
		
		testeExercicio.assertExercicio(expected, actual);
		
	}
	
	@Test
	public void testDelete(){
		
		Exercicio expected = new Exercicio(new Integer(2), "Supino A", 60, 30, 3, 100);
		exercicioDAOImpl.createExercicio(expected);
		exercicioDAOImpl.delete(expected);
		
		Exercicio actual = exercicioDAOImpl.findByExercicio(expected);
		Assert.assertEquals(null, actual);
		
	}
	
	@Test
	public void testFindAll(){
		
		Exercicio expected = new Exercicio(new Integer(2), "Supino A", 60, 30, 3, 100);
		Exercicio expected2 = new Exercicio(new Integer(2), "Supino B", 60, 30, 3, 100);
		exercicioDAOImpl.createExercicio(expected);
		exercicioDAOImpl.createExercicio(expected2);
		
		List<Exercicio> exercicios = exercicioDAOImpl.findAllExercicio();
		
		Assert.assertEquals(2, exercicios.size());
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
