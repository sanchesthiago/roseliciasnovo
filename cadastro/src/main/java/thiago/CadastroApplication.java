package thiago;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import thiago.repository.AlunoDao;
import thiago.repository.CursoRepository;
import thiago.model.Cadastro;
import thiago.model.Aluno;

import thiago.model.ContaoEmergencia;
import thiago.model.Curso;
import thiago.model.Endereco;
import thiago.model.enums.Nivel;
import thiago.model.enums.GrauParentesco;
import thiago.model.enums.Sexo;

@SpringBootApplication
public class CadastroApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroApplication.class, args);
	
		
		
	}
	@Bean
    public CommandLineRunner run(CursoRepository repository) throws Exception {
        return args -> {
        	Curso curso = new Curso();
        	curso.setCargaHoraria(120);
        	curso.setNivel(Nivel.AV);
        	curso.setNome("Java EE");
        	repository.save(curso);
        };
	}
        	
        	
       /*List<Aluno> alunos = dao.findAll();
        	
        for(Aluno a : alunos) {
        	System.out.println(a.getCadastro().getNome() +  " contato " + a.getCadastro().getContato().getNome());
        }
        	
        	
       Aluno a = new Aluno();
           a.setNivel(AlunoNivel.AV);
           
           
        Cadastro c = new Cadastro();
           c.setNome("Thiago");
           c.setEmail("thiago.sanches023@gmail.com");
           c.setRg("155482");
           c.setCpf("90781881899");
           c.setTelefone(1197889789789l);
           c.setSexo(Sexo.M);
           c.setNacionalidade("Brasileiro");
          
           
           
      
       Endereco e = new Endereco();
     e.setBairro("Bras");
     e.setCep("12345");
     e.setCidade("São Paulo");
     e.setLogradouro("Carneiro Leao");
     e.setNumero("290");
     e.setComplemento("apto 31 bloco 3");
     e.setEstado("SP");
     
     c.setEndereco(e);
        
        
        ContaoEmergencia ce = new ContaoEmergencia();
        	ce.setNome("Pedro Sanches");        
        	ce.setTelefone(11987654321l);
        	ce.setEmail("rwerwe@gfdgdf");
        	ce.setParentesco(GrauParentesco.IRMAO);
        	
        	
        	c.setContato(ce);
        	a.setCadastro(c);
        	
      	ContaoEmergencia ce2 = new ContaoEmergencia();
      
        
        dao.save(a);
           
        };
    }*/

}
