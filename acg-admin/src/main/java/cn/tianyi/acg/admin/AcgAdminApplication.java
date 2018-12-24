package cn.tianyi.acg.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AcgAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcgAdminApplication.class, args);
	}

}

