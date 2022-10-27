package org.soyphea.k8s.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

@ConfigurationProperties(prefix = "user")
@Component
@Data
public class ConfigMapPodInjectionProperties {

    String name;

    String blog;
    
    String user = "admin";
    
    String password = "admin";
}

@Autowired
public void configureGlobal(AuthenticationManagerBuilder auth, DataSource dataSource) throws Exception {
  auth.jdbcAuthentication()
    .dataSource(dataSource)
    .usersByUsernameQuery("SELECT * FROM users WHERE username = ?")
    .passwordEncoder(new StandardPasswordEncoder()); // Noncompliant

  // OR
  auth.jdbcAuthentication()
    .dataSource(dataSource)
    .usersByUsernameQuery("SELECT * FROM users WHERE username = ?"); // Noncompliant; default uses plain-text

  // OR
  auth.userDetailsService(...); // Noncompliant; default uses plain-text
  // OR
  auth.userDetailsService(...).passwordEncoder(new StandardPasswordEncoder()); // Noncompliant
}
