package ru.alex.football.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.alex.football.model.Goal;

@Repository
public interface GoalRepository extends CrudRepository<Goal,Integer> {
    @Query(value = "select 'Goal';",nativeQuery = true)
    public String func();
}
