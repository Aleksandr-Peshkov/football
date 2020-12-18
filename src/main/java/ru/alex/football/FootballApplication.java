package ru.alex.football;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.alex.football.model.*;
import ru.alex.football.repository.*;

import java.io.IOException;

@SpringBootApplication
public class FootballApplication implements CommandLineRunner {
    FootballApplication(StadiumRepository stadiumRepository,
                        TeamRepository teamRepository,
                        MatchRepository matchRepository,
                        PlayerRepository playerRepository,
                        PlayingRepository playingRepository,
                        TeamMatchRepository teamMatchRepository,
                        GoalRepository goalRepository) {
        this.stadiumRepository = stadiumRepository;
        this.teamRepository = teamRepository;
        this.matchRepository = matchRepository;
        this.playerRepository = playerRepository;
        this.playingRepository = playingRepository;
        this.teamMatchRepository = teamMatchRepository;
        this.goalRepository = goalRepository;
    }

    StadiumRepository stadiumRepository;
    TeamRepository teamRepository;
    MatchRepository matchRepository;
    PlayerRepository playerRepository;
    PlayingRepository playingRepository;
    TeamMatchRepository teamMatchRepository;
    GoalRepository goalRepository;

    public static void main(String[] args) {
        SpringApplication.run(FootballApplication.class, args);
    }
    @Override
    public void run(String... args) throws IOException {
        print("BRUH MOMENT");
        /*
        Team team=new Team();
        team.name="Рыбы";
        team.city="Рыбинск";
        team.trainerName="Рыбин Рыба Рыбович";
        team.position=1;
        //team.stadium=stadiumRepository.get_by_id(stadiumRepository.get_id("Метеор","Рыбинск"));
        team.stadium=stadiumRepository.get_stadium_by_param("Метеор","Рыбинск");
        teamRepository.save(team);*/

        //print(trainerRepository.govno());
        /*//добавление стадиона
        Stadium stadium=new Stadium();
        stadium.name="Метеор";
        stadium.city="Рыбинск";
        stadium.capacity=5000;
        stadiumRepository.save(stadium);
         */

    }
    public void print(Object text){
        System.out.println(text);
    }
}
