package me.dio.gameawards.domain.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface gameRepository extends JpaRepository<Game,Long> {

}
