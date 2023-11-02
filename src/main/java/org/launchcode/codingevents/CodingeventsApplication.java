package org.launchcode.codingevents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class CodingeventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingeventsApplication.class, args);
	}

}
