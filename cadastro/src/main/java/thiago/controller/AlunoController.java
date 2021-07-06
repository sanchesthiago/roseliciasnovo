package thiago.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import thiago.model.Aluno;
import thiago.model.Curso;
import thiago.service.AlunoService;

@RestController
	@RequestMapping("/alunos")
	public class AlunoController {
	    @Autowired
	    private AlunoService service;
	    
	    @GetMapping
	    public Iterable<Aluno> list(){
	        return service.findAll();
	    }
	    
	    @PostMapping()
	    public void incluir(@RequestBody Aluno aluno){
	    	service.incluir(aluno);
	    }
	    
	    @PutMapping
	    public void alterar(@RequestBody Aluno aluno){
	    	service.alterar(aluno);
	    }
	    
	   
	  	  	    
	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable("id")Integer id){
	    	service.deleteById(id);
	    }
	   
	    
	    @GetMapping(value = "handler/{id}")
	    public Aluno handlerFind(@PathVariable("id") Integer id) {
	       Aluno aluno = service.buscar(id);
	        return aluno;
	    }
	    
	 /*   @GetMapping(value="/{id}")
	    public Aluno buscar(@PathVariable("id") Integer id){
	        return service.findById(id);
	    }*/
	}

