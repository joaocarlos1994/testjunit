package br.com.keepinshape;

import java.util.List;

public interface ExercicioDAO {
	
	public void createExercicio(final Exercicio exercicio);
	public void delete(final Exercicio exercicio);
	public Exercicio findByExercicio(final Exercicio exercicio);
	public List<Exercicio> findAllExercicio();

}
