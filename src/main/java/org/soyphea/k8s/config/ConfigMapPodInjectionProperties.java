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

public static List<String> zipSlipNoncompliant(ZipFile zipFile) throws IOException { 
    Enumeration<? extends ZipEntry> entries = zipFile.entries(); 
    List<String> filesContent = new ArrayList<>();

    while (entries.hasMoreElements()) {
      ZipEntry entry = entries.nextElement();
      File file = new File(entry.getName());
      String content = FileUtils.readFileToString(file, StandardCharsets.UTF_8); // Noncompliant
      filesContent.add(content);
    }

    return filesContent;
}
