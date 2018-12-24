package cn.tianyi.acg.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AcgEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcgEurekaApplication.class, args);
	}

}

