import java.time.LocalDate;

import Adapters.RealPlayerCheckAdapter;
import Business.concretes.CampaignManager;
import Business.concretes.GameManager;
import Business.concretes.PlayerManager;
import Business.concretes.SaleManager;
import Entities.concretes.Campaign;
import Entities.concretes.Game;
import Entities.concretes.Player;
import Entities.concretes.Sale;

public class Main {

	public static void main(String[] args) {
		Player player1 = new Player();
		player1.setId(1);
		player1.setFirstName("Ceren");
		player1.setLastName("Esirgenci");
		player1.setNationalityId("11111111111");
		player1.setDateOfBirthDate(LocalDate.of(1999, 8, 23));		
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("Pubg");
		game1.setPrice(50);
		game1.setDescription("Pubg ile heyecaný keþfedin");		
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setName("Yaz Kampanyasý");
		campaign1.setDiscountPercent(10);
		
		Sale sale1 = new Sale();
		sale1.setId(1);
		sale1.setGame(game1);
		sale1.setPlayer(player1);	


		PlayerManager playerManager = new PlayerManager(new RealPlayerCheckAdapter());
		playerManager.add(player1);		
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		
		SaleManager saleManager1 = new SaleManager();
		saleManager1.add(sale1);
		
		SaleManager saleManager2 = new SaleManager();
		saleManager2.add(sale1, campaign1);

	}

	}


