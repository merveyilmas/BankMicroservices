package com.app.cards;

import com.app.cards.dto.CardsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableFeignClients
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "MerYilBank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Merve Yılmaz",
						email = "yilmaz.67@outlook.com",
						url = "http://merveyilmaz.org/"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.meryil.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "MerYilBank Cards microservice REST API Documentation",
				url = "https://www.meryil.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
