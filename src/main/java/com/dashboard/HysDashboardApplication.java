package com.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableEurekaClient 
@EnableHystrixDashboard 
@EnableHystrix
@SpringBootApplication 
public class HysDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HysDashboardApplication.class, args);
	}

}
