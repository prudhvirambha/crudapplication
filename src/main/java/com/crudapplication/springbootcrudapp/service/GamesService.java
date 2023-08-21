package com.crudapplication.springbootcrudapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapplication.springbootcrudapp.model.Games;
import com.crudapplication.springbootcrudapp.repository.GamesRepository;

@Service
public class GamesService {
	@Autowired
	GamesRepository gamesRepository;


	public List<Games> getAllGames(){
		List<Games> games=new ArrayList<Games>();
		gamesRepository.findAll().forEach(games1->games.add(games1));
		return games;
	}
	
	public Games getGamesById(int id) {
		return gamesRepository.findById(id).get();
	}
	
	public void saveGames(Games games) {
		gamesRepository.save(games);
	}
	
	public void updateGames(Games games,int gameid) {
		gamesRepository.save(games);
	}
	public void deleteGames(int id) {
		gamesRepository.deleteById(id);
	}
}
