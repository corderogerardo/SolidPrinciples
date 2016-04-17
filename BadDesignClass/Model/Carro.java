package Model;

import java.util.ArrayList;
import java.util.List;

public class Carro {
	
	List<OrdenItem> listOrdenItem = new ArrayList<OrdenItem>();
	
	public float MontoTotal(){
		float total=0;
		float descuento=0;
		for(int i=0;i<listOrdenItem.size();i++){
			if(listOrdenItem.get(i).getRegla().equals("NORMAL")){
				total+=listOrdenItem.get(i).getCantidad()*listOrdenItem.get(i).getPrecio();
				descuento = (float) (total* 0.1);
				total = total -descuento;
			}else if(listOrdenItem.get(i).getRegla().equals("PESO")){
				total+=listOrdenItem.get(i).getCantidad()*listOrdenItem.get(i).getPrecio();
				descuento = (float) (total* 0.2);
				total = total -descuento;
			}
			else if(listOrdenItem.get(i).getRegla().equals("ESPECIAL")){
				total+=listOrdenItem.get(i).getCantidad()*listOrdenItem.get(i).getPrecio();
				descuento = (float) (total* 0.4);
				total = total -descuento;
			}
			//aqui agregarias mas reglas
		}
		return total;
		
	}
	public IEnumerable<OrdenItem> Items(){
		return null;
		
	}

}
