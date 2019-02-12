package com.jerseyExample.restDemoSession;

import java.util.ArrayList;
import java.util.List;

public class SuperHeroDao {
	static List<SuperHero> superHeroes = new ArrayList<SuperHero>();
	static int superId=1;
	
	public SuperHero createSuperHero(String name,List<String> powers,int rating) {
		SuperHero superHero = new SuperHero(superId,name,powers,rating);
		superHeroes.add(superHero);
		superId=superId+1;
		return superHero;
	}
	
	public List<SuperHero> getSuperHeroes(){
		return superHeroes;
	}
	
	public SuperHero getSuperHeroById(int id) {
		for(SuperHero superHero:superHeroes) {
			if(superHero.getId()==id)
				return superHero;
		}
		return null;
	}
	
	public List<SuperHero> getCommonPower(String superPower){
		List<SuperHero> commonSuperHeroes = new ArrayList<SuperHero>();
		for(SuperHero superHero:superHeroes) {
			if(superHero.getSuperPower().contains(superPower)) {
				commonSuperHeroes.add(superHero);
				}
		}
		return commonSuperHeroes;
	}
	
	public void deleteSuperHero(int id) {
		SuperHeroDao superHeroDao = new SuperHeroDao();
		SuperHero superHero = superHeroDao.getSuperHeroById(id);
		superHeroes.remove(superHero);
	}
}
