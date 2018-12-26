package cn.tianyi.acg.config;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEncryptableProperties
@EnableConfigServer
@EnableEurekaClient
public class AcgConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcgConfigApplication.class, args);
	}

}

