package me.ht.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 해당 어노테이션 내부에 몇가지 어노테이션과 로직들이 wrapping 되있음
// 그중 중요한 3가지 어노테이션은 다음과 같음
// @SpringBootConfiguration 스프링부트의 기본설정을 처리
// @EnableAutoConfiguration 자동설정을 처리. ComponentScan 이후에 수행 (여기서 설정값이 덮어써짐, Optional에 따라 다를 수 있음)
// @ComponentScan 컴포넌트를 스캔하여 Bean으로 등록. EnableAutoConfiguration 이전에 수행
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application.class);
		// 웹서버가 아닌 일반 어플리케이션으로 동작하도록 설정
		// application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

}
