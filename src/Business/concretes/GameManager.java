package Business.concretes;

import Business.abstracts.GameService;
import Entities.concretes.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		if(game.getGameName().length()<3 && game.getPrice()<0) 
		{
			System.out.println("Oyun Sisteme Eklenemedi");
		}
		else 
		{
			System.out.println("Oyun Sisteme Baþarýyla Eklendi: " + game.getGameName());
		}
		
		
	}

	@Override
	public void update(Game game) {
		if(game.getGameName().length()<3 && game.getPrice()<0) 
		{
			System.out.println("Oyun Güncellenemedi");
		}
		else 
		{
			System.out.println("Oyun Baþarýyla Güncellendi: " + game.getGameName());
		}		
		
		
	}

	@Override
	public void delete(Game game) {
		if(game.getGameName().length()<3 && game.getPrice()<0) 
		{
			System.out.println("Oyun Sistemden Silinemedi");
		}
		else 
		{
			System.out.println("Oyun Baþarýyla Sistemden Silindi");
		}		
		
		
	}

}
