package ru.alex.football;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FootballApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(FootballApplication.class, args);
    }
    @Override
    public void run(String... args) {
        print("BRUH MOMENT");
    }
    public void print(String text){
        System.out.println(text);
    }
}
