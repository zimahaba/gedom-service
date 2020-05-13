package com.zimahaba.gedom;

import com.zimahaba.gedom.entity.Employee;
import com.zimahaba.gedom.entity.Punch;
import com.zimahaba.gedom.entity.resource.PunchResource;
import com.zimahaba.gedom.entity.resource.custommapper.PunchResourceMapper;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@ComponentScan({"com.zimahaba.gedom"})
@EnableJpaRepositories(basePackages = "com.zimahaba.gedom.repository")
@EntityScan("com.zimahaba.gedom.entity")
public class GedomApplication {

	public static void main(String[] args) {
		SpringApplication.run(GedomApplication.class, args);
	}

	@Bean
	public MapperFacade getMapperFacade() {
		MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
		mapperFactory.classMap(Punch.class, PunchResource.class).customize(new PunchResourceMapper()).register();
		return mapperFactory.getMapperFacade();
	}

}
