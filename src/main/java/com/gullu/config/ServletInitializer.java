package com.gullu.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
		@Override
		protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
			System.out.println("ServletInitializer::configure(-)");
			return application.sources(WebMvcAppConfig.class);
		}
}
