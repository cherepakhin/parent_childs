package ru.perm.v.parent_childs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc // Need for OpenApiDoc
public class SimpleParentChildsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleParentChildsApplication.class, args);
    }

}
