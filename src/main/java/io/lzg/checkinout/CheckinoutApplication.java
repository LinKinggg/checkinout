package io.lzg.checkinout;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("io.lzg.checkinout.dao")
@EnableFeignClients
@EnableScheduling
public class CheckinoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckinoutApplication.class, args);
	}

}
