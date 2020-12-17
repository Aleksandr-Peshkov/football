package ru.alex.football;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.alex.football.model.Trainer;
import ru.alex.football.repository.TrainerRepository;

import java.io.IOException;

@SpringBootApplication
public class FootballApplication implements CommandLineRunner {

    FootballApplication(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    TrainerRepository trainerRepository;

    public static void main(String[] args) {
        SpringApplication.run(FootballApplication.class, args);
    }
    @Override
    public void run(String... args) throws IOException {

        print("BRUH MOMENT");
        Character a=(char)System.in.read();
        print(a);
        //print(trainerRepository.govno());
        //Trainer trainer= new Trainer();
        //trainer.name="Dodik";
        //trainerRepository.save(trainer);
    }
    public void print(Object text){
        System.out.println(text);
    }
}
