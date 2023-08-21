package com.crudapplication.springbootcrudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudapplication.springbootcrudapp.model.Games;
import com.crudapplication.springbootcrudapp.service.GamesService;

@RestController
public class GamesController {
	@Autowired
	GamesService gamesService;
	
	@GetMapping("/games")
	public  List<Games> getAllGames(){
		return gamesService.getAllGames();
	}
	
	@GetMapping("/games/{gameid}")
	public Games getGames(@PathVariable("gameid")int gameid) {
		return gamesService.getGamesById(gameid);
	}
	
	@DeleteMapping("/games/{gameid}")
	public void deleteGame(@PathVariable("gameid")int gameid) {
		gamesService.deleteGames(gameid);
	}
	
	@PutMapping("/games/{gameid}")
	public int update(@RequestBody Games games,@PathVariable("gameid")int gameid) {
		gamesService.updateGames(games, gameid);
		return games.getGameid();
	}
	
	@PostMapping("/games")
	//@RequestMapping(value = "/games", consumes="application/json", produces ="application/json", method = RequestMethod.POST)
	public void save(@RequestBody Games games) {
		
		gamesService.saveGames(games);
	}
}
