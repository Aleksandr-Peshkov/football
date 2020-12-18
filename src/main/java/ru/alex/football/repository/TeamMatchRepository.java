package ru.alex.football.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.alex.football.model.TeamMatch;

@Repository
public interface TeamMatchRepository extends CrudRepository<TeamMatch,Integer> {
    @Query(value = "select 'TeamMatch';",nativeQuery = true)
    public String func();
}
