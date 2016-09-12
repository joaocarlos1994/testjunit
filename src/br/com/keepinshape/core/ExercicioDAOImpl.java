package br.com.keepinshape.core;

import java.util.List;

import com.db4o.ObjectSet;

import br.com.keepinshape.Exercicio;
import br.com.keepinshape.ExercicioDAO;
import br.com.keepinshape.service.DataBaseConnection;

public class ExercicioDAOImpl implements ExercicioDAO {
	
	private DataBaseConnection dataBaseConnection;
	

	@Override
	public void createExercicio(Exercicio exercicio) {
		dataBaseConnection = new DataBaseConnection();
		dataBaseConnection.getConexao().store(exercicio);
		dataBaseConnection.closeConexa();
	}

	@Override
	public void delete(final Exercicio exercicio) {
		dataBaseConnection = new DataBaseConnection();
		dataBaseConnection.getConexao().delete(exercicio);
		dataBaseConnection.closeConexa();
	}

	@Override
	public Exercicio findByExercicio(final Exercicio exercicio) {
		
		dataBaseConnection = new DataBaseConnection();
		
		ObjectSet<Exercicio> listaExercicio = dataBaseConnection.getConexao().get(exercicio);
		Exercicio exercicioEncotrado = listaExercicio.next();
		
		dataBaseConnection.closeConexa();
				
		return exercicioEncotrado;
	}

	@Override
	public List<Exercicio> findAllExercicio() {
		
		dataBaseConnection = new DataBaseConnection();
		ObjectSet<Exercicio> exercicios = dataBaseConnection.getConexao().get(Exercicio.class);
		dataBaseConnection.closeConexa();
		
		return exercicios;
	}

}
