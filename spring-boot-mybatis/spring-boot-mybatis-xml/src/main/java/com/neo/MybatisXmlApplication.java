package com.neo;

import com.neo.lock.DisLock;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.neo.mapper")
public class MybatisXmlApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(MybatisXmlApplication.class, args);
		DisLock bean = applicationContext.getBean(DisLock.class);
		bean.lock();
		bean.unlock();
	}
}
