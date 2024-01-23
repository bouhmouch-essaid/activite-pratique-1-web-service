import jakarta.xml.ws.Endpoint;
import ws.BankService;

public class Server {

    public static void main(String[] args){
        Endpoint.publish("http://127.0.0.1:8001/",new BankService());
    }
}
