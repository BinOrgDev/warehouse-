package uz.wsm;

import org.springframework.boot.SpringApplication;

public class TestApplication {
    public static void main(String[] args) {
        SpringApplication
                .from(WsmApplication::main)
                .with(TestContainerConfiguration.class)
                .run(args);
    }
}