package wsStockMarket;
import java.util.*;

public class Stock implements Subject
{
	String tipo; //Nombre del stock
	StockMarket mercado_acciones;
	ArrayList<Observer> observers;
	double precio;

	public Stock(String tipo, double precio_inicial, StockMarket mercado_acciones)
	{
		this.mercado_acciones = mercado_acciones;
		this.precio = precio_inicial;
		this.tipo = tipo;
		observers = new ArrayList<>();
	}
	@Override
	public void registrarObs(Observer obs) {observers.add(obs);}
	@Override
	public String notificarObs(Observer t, String tipo_transaccion, Double precio)
	{
		StringBuilder trans = new StringBuilder();
		if (t instanceof Trader)
		{
			for (Observer observer : observers)
			{
				trans.append(observer.getName()).append(":The latest trade is Trader:").append(t.getName()).append(" ").append(tipo_transaccion).append(" $").append(precio).append(" Stock: ").append(this.tipo).append("\n");
			}
		}
		return trans.substring(0,trans.length()- 1);
	}
}
