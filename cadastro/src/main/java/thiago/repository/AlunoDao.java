package thiago.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import thiago.model.Aluno;

@Repository
public interface AlunoDao extends JpaRepository<Aluno, Integer> {

	
	
}