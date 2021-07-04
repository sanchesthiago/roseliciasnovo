package thiago.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import thiago.model.Curso;
@Repository
public interface CursoRepository 
extends CrudRepository<Curso, Integer> {
	List<Curso> findByNomeContaining(String nome);
}
