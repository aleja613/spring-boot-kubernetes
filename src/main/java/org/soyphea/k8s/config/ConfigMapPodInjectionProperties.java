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


protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
  String json = "{\"key\":\""+req.getParameter("value")+"\"}";
  FileOutputStream fos = new FileOutputStream("output.json");
  fos.write(json.getBytes(Charset.forName("UTF-8")));  // Noncompliant
}
