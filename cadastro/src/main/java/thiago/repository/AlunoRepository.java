package thiago.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import thiago.model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Integer> {
	//List<Aluno> findByNomeContaining(String nome);
}
