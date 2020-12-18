package ru.alex.football.model;

import javax.persistence.*;


@Entity //класс отвечает за репрезентацию табл в бд
public class Team {
    @Id
    @SequenceGenerator(name = "teamSequence", sequenceName = "team_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "teamSequence")
    public Integer id;

    @ManyToOne
    @JoinColumn(name = "stadium_id")
    public Stadium stadium;//аыаываы

    public String name;
    public String city;
    public String trainerName;
    public Integer position;

}