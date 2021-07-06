package thiago.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import thiago.service.CadastroService;
import thiago.exceptions.RegistroNaoLocalizadoException;

import thiago.model.Cadastro;
import thiago.model.Curso;
import thiago.repository.CadastroRepository;


@RestController
@RequestMapping("/cadastros")
public class CadastroController {
	@Autowired
	private CadastroService service;
	
	@PostMapping()
	public void incluir(@RequestBody Cadastro cadastro){
		service.incluir(cadastro);    
	}
		
	@GetMapping(value = "handler/{id}")
	public Cadastro handlerFind(@PathVariable("id") Integer id){
		Cadastro cadastro = service.buscar(id);
		return cadastro;
	}
	
	@PutMapping(value = "alterar/{id}")
	public void alterar(@RequestBody Cadastro cadastro){
		service.alterar(cadastro);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id ) {
		service.deleteById(id);
	}
	
}
