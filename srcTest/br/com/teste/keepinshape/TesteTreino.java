package br.com.teste.keepinshape;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.keepinshape.Exercicio;
import br.com.keepinshape.Treino;
import junit.framework.Assert;

public class TesteTreino {
	
	private TesteTreino testeTreino;
	private TesteExercicio testeExercicio;
	private Treino treino;
	
	@Before
	public void config(){
		testeTreino = new TesteTreino();
		testeExercicio = new TesteExercicio();
		treino = new Treino("Treino", "Peito A", "Segunda", 100, 100);
	}
	
	@Test
	public void testeCreateTreino(){
		
		Treino expected = new Treino("Treino", "Peito A", "Segunda", 100, 100);
		Treino actual = new Treino("Treino", "Peito A", "Segunda", 100, 100);
		
		testeTreino.assertTreino(expected, actual);
	}
	
	@Test
	public void testeAdicionarExercicio(){
		Exercicio exercicio = new Exercicio(new Integer(1), "Supino A", 60, 30, 3, 100);
		treino.adicionarExercicio(exercicio);
		
		assertTreino(treino, treino);
		
		//treino.adicionarExercicio(null);
		
		assertTreino(treino, treino);
	}
	
	@Test
	public void testeRemoveExercicio(){
		Exercicio exercicio = new Exercicio(new Integer(1), "Supino A", 60, 30, 3, 100);
		treino.removerExercicio(exercicio);
		assertTreino(treino, treino);
	}
	
	
	public void assertTreino(final Treino expected, final Treino actual){
		
		config();
		
		Assert.assertEquals(expected.getNome(), actual.getNome());
		Assert.assertEquals(expected.getTipo(), actual.getTipo());
		Assert.assertEquals(expected.getDiaSemana(), actual.getDiaSemana());
		
		Assert.assertEquals(expected.getExercicios().size(), actual.getExercicios().size());
		
		List<Exercicio> exerciciosExpected = (List<Exercicio>) expected.getExercicios();
		List<Exercicio> exerciciosActual = (List<Exercicio>) actual.getExercicios();
		
		for (int i = 0; i < exerciciosExpected.size(); i++) {
			Exercicio exercicioExpected = exerciciosExpected.get(i);
			Exercicio exercicioActual = exerciciosActual.get(i); 
			testeExercicio.assertExercicio(exercicioExpected, exercicioActual);
		}
		
		Assert.assertEquals(expected.getPontosTotal(), actual.getPontosTotal());
		Assert.assertEquals(expected.getPontosMaximo(), actual.getPontosMaximo());
	}

}
