package wsStockMarket;

public interface Subject
{
    void registrarObs(Observer o);
    String notificarObs(Observer t, String tipo_transaccion, Double precio);
}
