package thiago;

import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import thiago.repository.AlunoRepository;
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
	/*@Bean
    public CommandLineRunner run(CursoRepository repository) throws Exception {
        return args -> {
        	Curso curso = new Curso();
        	curso.setCargaHoraria(120);
        	curso.setNivel(Nivel.AV);
        	curso.setNome("Java EE");
        	repository.save(curso);
        };
       
	}*/
        	
    @Bean
    public CommandLineRunner run(AlunoRepository repository) throws Exception {	
		  return args -> {
		
        	
        	
       Aluno a = new Aluno();
           a.setNivel(Nivel.AV);
           
           
        Cadastro c = new Cadastro();
       
           c.setNome("Thiago");
           c.setEmail("thiago.sanches023@gmail.com"); 
           c.setRg("155482");
           c.setCpf("90781881899");
           c.setTelefone(1197889789789l);
           c.setSexo(Sexo.M);
           c.setNacionalidade("Brasileiro");
          c.setDataNascimento(LocalDate.parse("1989-02-26"));
          
          
                    
   
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
        	ce.setEmail("testeste@gfdgdf");
        	ce.setParentesco(GrauParentesco.IRMAO);
        	
        	
        	c.setContato(ce);
        	
        
        	

        	ContaoEmergencia ce2 = new ContaoEmergencia();	
        	ce2.setNome("Thiagoi Sanches");        
        	ce2.setTelefone(11987654321l);
        	ce2.setEmail("testeste@gfdgdf");
        	ce2.setParentesco(GrauParentesco.IRMAO);

        	c.setContato2(ce2);
        	a.setCadastro(c);
      	
      		
      
        
        repository.save(a);
           
        };
    }
}

