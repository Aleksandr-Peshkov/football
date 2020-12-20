package ru.alex.football.repository.bruh;

import java.util.Date;

//Даты встреч команды, ее противник и счет
public interface PlayingSup {
    Date getDate();
    String getName();
    Integer getScore1();
    Integer getScore2();
}
