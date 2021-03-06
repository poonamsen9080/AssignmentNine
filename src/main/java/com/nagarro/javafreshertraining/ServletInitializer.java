/**
 * @package com.nagarro.javafreshertraining
 * @description This package contains views and mappings for the web app.
 */
package com.nagarro.javafreshertraining;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/* To initialize servlets */
public class ServletInitializer extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Assignment9Application.class);
	}
}
