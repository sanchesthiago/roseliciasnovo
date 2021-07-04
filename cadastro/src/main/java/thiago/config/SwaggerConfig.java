package thiago.config;

import java.util.Arrays;
import java.util.HashSet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket detalheApi() {
		Docket docket = new Docket(DocumentationType.SWAGGER_2);
		docket
		.select()
		.apis(RequestHandlerSelectors.basePackage("thiago.controller"))
		.paths(PathSelectors.any())
		.build()
		.apiInfo(this.informacoesApi().build())
		.consumes(new HashSet<String>(Arrays.asList("application/json")))
		.produces(new HashSet<String>(Arrays.asList("application/json")));
	return docket;
	}
private ApiInfoBuilder informacoesApi() {
	ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
	apiInfoBuilder.title("Thiago Sanches - Springboot - Rest API");
	apiInfoBuilder.description("API exemplo de uso de Springboot REST API");
	apiInfoBuilder.version("1.0");
	apiInfoBuilder.termsOfServiceUrl("Termo de uso: Thiago Sanches");
	apiInfoBuilder.license("Licença - Thiago Sanches");
	apiInfoBuilder.licenseUrl("http://www.thiagosanches.com.br");
	apiInfoBuilder.contact(this.contato());
	return apiInfoBuilder;
}
private Contact contato() {
		return new Contact(
				"Thiago Sanches",
				"http://www.thiagosanches.com.br",
				"thiago.sanches023@gmail.com.br");
	}
}