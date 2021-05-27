package Business.concretes;

import Business.abstracts.PlayerCheckService;
import Entities.concretes.Player;

public class FakePlayerCheckManager implements PlayerCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) {
		
		return true;
	}

}
