package ru.alex.football.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //класс отвечает за репрезентацию табл в бд
public class Trainer {
    @Id
    public Integer id;
    public String name;
}
