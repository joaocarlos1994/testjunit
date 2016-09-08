package br.com.teste.keepinshape;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import br.com.keepinshape.Exercicio;
import junit.framework.Assert;

public class TesteExercicio {
	
	private TesteExercicio testeExercicio;
	private ObjectContainer db;
	private ObjectSet result;
	
	@Before
	public void config(){
		testeExercicio = new TesteExercicio();
		db = Db4o.openFile("Teste.yap");
	}
	@After
	public void afterTest(){
		db.close();
	}
	

	@Test
	public void testCreate(){
		
		Exercicio expected = new Exercicio(new Integer(1), "Supino", 60, 30, 3, 100);
		db.store(expected);
		
		result = db.get(expected);
		Exercicio actual = (Exercicio) result.next();
		
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
