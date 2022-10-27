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

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;

public void runUnsafe(HttpServletRequest request) throws IOException {
  String cmd = request.getParameter("command");
  String arg = request.getParameter("arg");

  Runtime.getRuntime().exec(cmd+" "+arg); // Noncompliant
}
