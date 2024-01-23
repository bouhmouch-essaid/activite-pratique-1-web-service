import proxy.BankService;
import proxy.BankWs;
import proxy.Compte;

public class Client {

    public static void main(String[] args) {
        BankService bWs = new  BankWs().getBankServicePort();
        System.out.println(bWs.conversion(10));
        Compte cpt = bWs.getCompte(5);
        System.out.println(cpt.getSolde());
    }

}
