package com.example.demo;
 
import java.nio.file.Path;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.Scheduled;
 
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
 
@SpringBootApplication
@ComponentScan(basePackages = { "com.example.demo.*" })
@OpenAPIDefinition(info = @Info(title = "Certified Deposits API", version = "3.0", description = "Certified Deposits Information"))
@EnableCaching
public class DemoApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
 
	}
 
	@Bean
	public CqlSessionBuilderCustomizer sessionBuilderCustomizer(DataStaxAstraProperties astraProperties) {
 
		Path bundle = astraProperties.getSecureConnectBundle().toPath();
		return builder -> builder.withCloudSecureConnectBundle(bundle);
	}
 
	@CacheEvict(allEntries = true, cacheNames = { "cusHis", "manHis" })
	@Scheduled(fixedDelay = 30000)
	public void cacheEvict() {
		System.out.println("Cache Evicted");
	}
}