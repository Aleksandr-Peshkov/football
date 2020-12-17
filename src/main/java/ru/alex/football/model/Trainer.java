package ru.alex.football.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity //класс отвечает за репрезентацию табл в бд
public class Trainer {
    @Id
    @SequenceGenerator(name = "trainerSequence", sequenceName = "trainer_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "trainerSequence")
    public Integer id;
    public String name;
}
