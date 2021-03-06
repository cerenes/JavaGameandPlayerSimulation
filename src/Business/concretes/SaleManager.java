package Business.concretes;

import Business.abstracts.SaleService;
import Entities.concretes.Campaign;
import Entities.concretes.Sale;

public class SaleManager implements SaleService {

	@Override
	public void add(Sale sale) {
		System.out.println("Say?n" + " " + sale.getPlayer().getFirstName() + " " + 
				sale.getPlayer().getLastName() + " " +  '"' + sale.getGame().getGameName() + '"'  + " " + "Adl? Oyunu" + " " +
						sale.getGame().getPrice() + "TL Kar??l???nda Sat?n Ald?n?z.");
				
			}
			
			public void add(Sale sale, Campaign campaign) {
				
				System.out.println("Say?n" + " " + sale.getPlayer().getFirstName() + " " +
						sale.getPlayer().getLastName() + " " + '"' + sale.getGame().getGameName() + '"' + " " + "Adl? Oyunu" + " " + '"' + campaign.getName() + '"' + " " 
						+ "?le" + " " + "%" + campaign.getDiscountPercent() + " " + "?ndirimli Olarak" 
				+ " " + (sale.getGame().getPrice()-(sale.getGame().getPrice()*campaign.getDiscountPercent()/100)) + "TL Kar??l???nda Sat?n Ald?n?z." + "\n" 
						+ "*Bu ?ndirimden Kazanc?n?z:" + " " + sale.getGame().getPrice()*campaign.getDiscountPercent()/100 + "TL");
				
			}
		
	}


