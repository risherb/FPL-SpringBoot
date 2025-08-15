package com.pl.premier_zone.service;

import com.pl.premier_zone.model.Player;
import com.pl.premier_zone.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player getPlayerById(Long id) {
        return playerRepository.findById(id).orElse(null);
    }

    public List<Player> getPlayersByTeam(String team) {
        return playerRepository.findByTeam(team);
    }

    public List<Player> getTopScorers() {
        return playerRepository.findTop10ByOrderByGlsDesc();
    }

    public List<Player> searchPlayers(String query) {
        return playerRepository.findByPlayerContainingIgnoreCase(query);
    }

    public List<Player> getPlayersByPosition(String position) {
        return playerRepository.findByPosOrderByGlsDesc(position);
    }

    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }
}
