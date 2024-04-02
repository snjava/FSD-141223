package com.institute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.institute.bean.Admin;

@SpringBootApplication
public class SbCoreScopeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SbCoreScopeApplication.class, args);
		Admin ad1 = ctx.getBean(Admin.class);
		Admin ad2 = ctx.getBean(Admin.class);
		Admin ad3 = ctx.getBean(Admin.class);
		Admin ad4 = ctx.getBean(Admin.class);
	}

}
