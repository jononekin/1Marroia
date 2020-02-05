package businessLogic;

import java.util.Collection;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import domain.Offer;

public interface OfferManager { 
	Collection<Offer> getConcreteOffers(String city, Date date);
}
 