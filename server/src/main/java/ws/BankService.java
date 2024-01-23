package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BankWs")
public class BankService {

    @WebMethod(operationName = "conversion")
    public double conversion(@WebParam(name = "montant") double mt){
        return  mt* 11;
    }

    @WebMethod(operationName = "getCompte")
    public Compte getCompte(@WebParam(name = "code") int id){
        return  new Compte(id,Math.random()*100,new Date());
    }
    @WebMethod(operationName = "getListComptes")
    public List<Compte> getListComptes(){
        return  List.of(
                new Compte(1,Math.random()*100,new Date()),
                new Compte(2,Math.random()*100,new Date()),
                new Compte(3,Math.random()*100,new Date())
        );
    }
}
