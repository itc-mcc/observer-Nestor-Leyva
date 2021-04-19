package wsStockMarket;

public class StockMarket {

	public void register(Trader t, Stock s) {s.registrarObs(t);}

	public String trade(Trader t, Stock s, String tipo_transaccion, double precio)
	{
		t.update(s, tipo_transaccion, precio);
		return s.notificarObs(t, tipo_transaccion, precio);
	}
}
