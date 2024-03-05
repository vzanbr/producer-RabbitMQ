package br.com.rabiit.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProducerServiceApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(ProducerServiceApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}