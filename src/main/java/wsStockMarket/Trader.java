package wsStockMarket;
import java.util.*;

public class Trader implements Observer
{
	String name;
	StockMarket mercado_acciones;
	private Map<Stock,Double> stonks;

	public Trader(String nombre, StockMarket mercado_acciones)
	{
		this.stonks = new HashMap<>();
		this.name = nombre;
		this.mercado_acciones = mercado_acciones;
	}

	public String getName() {return this.name;}

	public void update(Subject suj, String trans, Double precio)
	{
		if (suj instanceof Stock)
		{
			Stock stonk = (Stock) suj;
			if (trans.equals("buy")) {this.stonks.put(stonk, precio);}
			if (trans.equals("sell")) {this.stonks.remove(stonk);}
		}
	}
}
