package com.wolf.sty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ServletComponentScan  //注册过滤器注解
@EnableConfigurationProperties
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public ServletWebServerFactory webServerFactory() {
		TomcatServletWebServerFactory fa = new TomcatServletWebServerFactory();
		fa.addConnectorCustomizers(connector -> {
			connector.setProperty("relaxedQueryChars", "(),/:;<=>?@[\\]{}");
			connector.setProperty("rejectIllegalHeader", "false");
		});
		return fa;
	}

}
