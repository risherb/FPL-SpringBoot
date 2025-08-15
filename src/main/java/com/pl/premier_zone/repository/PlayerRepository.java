package com.pl.premier_zone.repository;

import com.pl.premier_zone.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    List<Player> findByTeam(String team);
    List<Player> findByPosOrderByGlsDesc(String position);
    List<Player> findTop10ByOrderByGlsDesc();
    List<Player> findByPlayerContainingIgnoreCase(String playerName);
}
