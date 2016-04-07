package Model;

import java.beans.MethodDescriptor;

public class Orden {
	
	public void pago(Carro car, DetallesPago detpago, boolean notificacionCliente){
		Object efectivo;
		Object transferencia;
		if(detpago.metodoPago() == tarjetacredito,efectivo,transferencia ){
			cargarTarjeta(detpago,car);
		}
		ReservarInventario(car);
		boolean notificarCliente;
		if(notificarCliente){
			notificarCliente(car);
		}
	}
	
	private void notificarCliente(Carro car) {
		// TODO Auto-generated method stub
		
	}

	private void ReservarInventario(Carro car) {
		// TODO Auto-generated method stub
		
	}

	private void cargarTarjeta(DetallesPago detpago, Carro car) {
		// TODO Auto-generated method stub
		
	}

	public void noficarCliente(Carro car){
	
	}

}
