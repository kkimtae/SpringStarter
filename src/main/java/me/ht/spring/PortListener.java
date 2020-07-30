package me.ht.spring;

import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class PortListener implements ApplicationListener<ServletWebServerInitializedEvent> {

	@Override
	public void onApplicationEvent(ServletWebServerInitializedEvent event) {
		// 서블릿웹서버 정상 초기화 후 실행되는 이벤트
		ServletWebServerApplicationContext applicationContext = event.getApplicationContext();
		System.out.println(applicationContext.getWebServer().getPort());

	}
}
