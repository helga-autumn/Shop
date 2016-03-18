package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Buyer;
import com.repository.BuyerRepository;

@Service
public class BuyerServiceImpl implements BuyerService{
	@Autowired
	private BuyerRepository buyerRepository;

	public void save ( int id, String firstName){
		Buyer buyer = new Buyer(id, firstName);
	
	
		
		
		
	}
	public Iterable<Buyer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
