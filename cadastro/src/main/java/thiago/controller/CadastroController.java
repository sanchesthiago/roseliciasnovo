package thiago.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import thiago.repository.CadastroDao;
import thiago.model.Cadastro;

@RestController
public class CadastroController {
	@Autowired
	private CadastroDao cadastroDao;
	
	@GetMapping(value = "/")
	public List<Cadastro> listagemCadastros(){
		return cadastroDao.listAll();
	}
}
