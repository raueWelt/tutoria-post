package rw.tutoria.post.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("rw.tutoria.post")
@EntityScan("rw.tutoria.post")
@EnableJpaRepositories("rw.tutoria.post.persistence")
public class PostAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostAppApplication.class, args);
    }

}
