package ru.alex.football.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.alex.football.model.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team,Integer> {
    @Query(value = "select 'Team';",nativeQuery = true)
    public String func();
}
