package com.jerseyExample.restDemoSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("superHeroes")
public class SuperHeroResource {
	
	SuperHeroDao superHeroDao = new SuperHeroDao();
	
	@POST
	@Path("search")
	@Produces(MediaType.APPLICATION_JSON)
	public SuperHero searchSuperHero(@FormParam("id") int id) {
		SuperHero superHero = superHeroDao.getSuperHeroById(id);
		return superHero;
	}
	
	@POST
	@Path("powers")
	@Produces(MediaType.APPLICATION_JSON)
	public List<SuperHero> getSuperHeroPowers(@FormParam("power") String power){
		List<SuperHero> superHeroes = superHeroDao.getCommonPower(power);
		return superHeroes;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<SuperHero> getSuperHeroes(){
		return superHeroDao.getSuperHeroes();
	}
	
	@POST
	@Path("delete")
	public void deleteSuperHero(@FormParam("id") int id) {
		superHeroDao.deleteSuperHero(id);
	}
	
	@POST
	@Path("add")
	@Produces(MediaType.APPLICATION_JSON)
	public SuperHero addSuperHero(@FormParam("name") String name,@FormParam("powers") String powers,@FormParam("rating") int rating) {
		String[] Arraypowers = powers.split(",");
		ArrayList<String> superPowers = new ArrayList<String>(Arrays.asList(Arraypowers));
		SuperHero superHero = superHeroDao.createSuperHero(name, superPowers, rating);
		return superHero;
	}
}
