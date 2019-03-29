package com.xuesheng.xcservicemanagecms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.xuecheng.framework.domain.cms")//扫描实体类
@ComponentScan(basePackages ={"com.xuecheng.api"})
@ComponentScan(basePackages = {"com.xuesheng.xcservicemanagecms"})
public class XcServiceManageCmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(XcServiceManageCmsApplication.class, args);
	}

}
