package com.sun.zuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * @author maxiao
 *
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringCloudApplication
public class SpringCloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulApplication.class, args);
	}
}
