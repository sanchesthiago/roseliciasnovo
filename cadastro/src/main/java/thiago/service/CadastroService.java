package thiago.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thiago.exceptions.CampoObrigatorioException;
import thiago.exceptions.RegistroNaoLocalizadoException;
import thiago.model.Cadastro;
import thiago.model.Endereco;
import thiago.repository.CadastroRepository;

@Service
public class CadastroService {
	@Autowired
	private CadastroRepository repository;
	
	public void incluir(Cadastro cadastro) throws RegistroNaoLocalizadoException{
		//TRATAR CADA CENÁRIO COM AS RESPECTIVAS CONSIDERAÇÕES
			/*if(cadastro.getCpf() == null){
			throw new CampoObrigatorioException("CPF");
			}
		    if (cadastro.getNacionalidade() == null) {
	            throw new CampoObrigatorioException("Nacionalidade");
	        }*/
		    
	       
		
		repository.save(cadastro);
		
	}
	public Cadastro buscar(Integer id) throws RegistroNaoLocalizadoException {
		Optional<Cadastro> opt = repository.findById(id);
		if(opt.isPresent())
			return opt.get();
		else
		 throw new RegistroNaoLocalizadoException("Cadastro", id);
		
	}
	
	public void alterar(Cadastro cadastro) {
		
		repository.save(cadastro);
	}
	
	public void deleteById(Integer id) {
		repository.deleteById(id);
		
		
	}
}
