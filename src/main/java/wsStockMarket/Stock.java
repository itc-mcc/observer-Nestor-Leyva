package wsStockMarket;
import java.util.*;

public class Stock implements Subject
{
	String tipo;
	StockMarket stockMkt;
	ArrayList<Observer> observer;
	double precio;

	public Stock(String tipo, double precio_inicial, StockMarket mercado_acciones)
	{
		this.stockMkt = mercado_acciones;
		this.precio = precio_inicial;
		this.tipo = tipo;
		observer = new ArrayList<>();
	}

	public void registrarObs(Observer obs) {observer.add(obs);}

	public String notificarObs(Observer obst, String transType, Double precio)
	{
		StringBuilder trans = new StringBuilder();
		if (obst instanceof Trader)
		{
			for (Observer observer : observer)
			{
				trans.append(observer.getName()).append(":The latest trade is Trader:").append(obst.getName()).append(" ").append(transType).append(" $").append(precio).append(" Stock: ").append(this.tipo).append("\n");
			}
		}
		return trans.substring(0,trans.length()- 1);
	}
}
