package ru.alex.football.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.alex.football.model.Match;

@Repository
public interface MatchRepository extends CrudRepository<Match,Integer> {
    @Query(value = "select 'Match';",nativeQuery = true)
    public String func();
}
