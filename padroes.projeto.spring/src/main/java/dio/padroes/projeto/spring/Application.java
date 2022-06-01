package dio.padroes.projeto.spring;

import org.springframework.boot.SpringApplication;

/**
 * Projeto via Spring Initializr
 * Modulos selecionados:
 * Spring Data JPA
 * Spring Web
 * H2 Database
 * OpenFeign
 */
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
