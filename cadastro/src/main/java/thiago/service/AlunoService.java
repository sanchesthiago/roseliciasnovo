package thiago.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thiago.exceptions.CampoObrigatorioException;
import thiago.exceptions.RegistroNaoLocalizadoException;
import thiago.model.Aluno;
import thiago.model.Cadastro;
import thiago.repository.AlunoRepository;

@Service
public class AlunoService {
	@Autowired
	private AlunoRepository repository;

	public void alterar(Aluno aluno) {
		
		repository.save(aluno);
		
	}

	public Iterable<Aluno> findAll() {
		
		return repository.findAll();
	}

	
	public void deleteById(Integer id) {
		 if (id== null) {
	            throw new CampoObrigatorioException("id");
	        }
	            
	        repository.deleteById(id);
		
	}

	
	public Aluno buscar(Integer id) {
		Optional<Aluno> opt = repository.findById(id);
		if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new RegistroNaoLocalizadoException("Aluno", id);
        }
		
	}

	public void incluir(Aluno aluno) throws RegistroNaoLocalizadoException {
		if(aluno.getNivel() == null)
			throw new CampoObrigatorioException("Nivel");
		
			
		repository.save(aluno);
		
	
	}

}