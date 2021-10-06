package com.havrulyk.springsecurityc9.config;

import com.havrulyk.springsecurityc9.security.filter.CsrfTokenLoggerFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfFilter;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.csrf(c -> {
      c.ignoringAntMatchers("/csrfdisabled/**");
      c.csrfTokenRepository(new CookieCsrfTokenRepository());
    });
    http.addFilterAfter(new CsrfTokenLoggerFilter(), CsrfFilter.class);
  }
}
