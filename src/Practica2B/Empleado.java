package Practica2B;

public class Empleado{
	
	public enum TipoEmpleado{Vendedor, Encargado};
	float salarioBase=0;
	float primas=0;
	float extras=0;
	
	public float CalculoNomimaBruta(TipoEmpleado tipo, float ventaMes, float horasExtras) {
		//Determinar Salario Base
		if(tipo==TipoEmpleado.Vendedor) {
			salarioBase=2000;
		}
		else if(tipo==TipoEmpleado.Encargado) {
			salarioBase=2500;
		}
		
		//Determinar Primas
		if(ventaMes>=1000 && ventaMes<1500) {
			primas=100;
		}
		else if(ventaMes>=1500) {
			primas=200;
		}
		
		//Determinar Horas Extras
		extras=horasExtras*30;
		
		return salarioBase+primas+extras;
	}
	public float CalculoNominaNeta(float NominaBruta) {
		float retencion=0;
		
		if(NominaBruta>=2500) {
			retencion=18;
		}
		else if(NominaBruta>=2100) {
			retencion=15;
		}
		
		return salarioBase*(100-retencion);
	}
}