package me.ht.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import me.ht.Holoman;

@Component
public class HolomanRunner implements ApplicationRunner {

	@Autowired
	Holoman holoman;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// 웹서버 기동 후 어플리케이션 Start 시 자동시작되도록 ApplicationRunner를 구현
		System.out.println(holoman);
	}

}
