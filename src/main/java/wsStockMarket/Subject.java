package wsStockMarket;

public interface Subject
{
    void registrarObs(Observer obs);
    String notificarObs(Observer obst, String transType, Double precio);
}
