package iunsuccessful.demo.springboot;

import iunsuccessful.demo.springboot.data.Point;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringBootApplication {

	private static final Logger logger = LoggerFactory.getLogger(DemoSpringBootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}


	@Bean
	public Point initPoint() {
		logger.info("init bean");
		return new Point(1, 2);
	}
}
