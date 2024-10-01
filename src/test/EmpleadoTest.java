package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Practica2B.Empleado;
import Practica2B.Empleado.TipoEmpleado;

class EmpleadoTest {
	
	private TipoEmpleado tipoE;
	private float ventas;
	private float horasExtras;
	private Empleado emp = new Empleado();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}

	/*TEST NOMINA BRUTA VENDEDOR*/
	
	@Test
	void testCalculoNomimaBrutaVendedorSinNada() {
		this.tipoE=TipoEmpleado.Vendedor;
		this.ventas=999;
		this.horasExtras=0;
		
		float expected=2000;
		float calculado=emp.CalculoNomimaBruta(tipoE, ventas, horasExtras);
		
		assertEquals(expected, calculado);
	}
	@Test
	void testCalculoNomimaBrutaVendedor_Prima100_HorasExtras0() {
		this.tipoE=TipoEmpleado.Vendedor;
		this.ventas=1200;
		this.horasExtras=0;
		
		float expected=2100;
		float calculado=emp.CalculoNomimaBruta(tipoE, ventas, horasExtras);
		
		assertEquals(expected, calculado);
	}
	@Test
	void testCalculoNomimaBrutaVendedor_Prima200_HorasExtras0() {
		this.tipoE=TipoEmpleado.Vendedor;
		this.ventas=1700;
		this.horasExtras=0;
		
		float expected=2200;
		float calculado=emp.CalculoNomimaBruta(tipoE, ventas, horasExtras);
		
		assertEquals(expected, calculado);
	}
	@Test
	void testCalculoNomimaBrutaVendedor_Prima0_HorasExtras15() {
		this.tipoE=TipoEmpleado.Vendedor;
		this.ventas=999;
		this.horasExtras=15;
		
		float expected=2450;
		float calculado=emp.CalculoNomimaBruta(tipoE, ventas, horasExtras);
		
		assertEquals(expected, calculado);
	}
	@Test
	void testCalculoNomimaBrutaVendedor_Prima100_HorasExtras15() {
		this.tipoE=TipoEmpleado.Vendedor;
		this.ventas=1200;
		this.horasExtras=15;
		
		float expected=2550;
		float calculado=emp.CalculoNomimaBruta(tipoE, ventas, horasExtras);
		
		assertEquals(expected, calculado);
	}
	@Test
	void testCalculoNomimaBrutaVendedor_Prima200_HorasExtras15() {
		this.tipoE=TipoEmpleado.Vendedor;
		this.ventas=1700;
		this.horasExtras=15;
		
		float expected=2650;
		float calculado=emp.CalculoNomimaBruta(tipoE, ventas, horasExtras);
		
		assertEquals(expected, calculado);
	}
	
	/*TEST NOMINA BRUTA ENCARGADO*/
	@Test
	void testCalculoNomimaBrutaEncargadoSinNada() {
		this.tipoE=TipoEmpleado.Encargado;
		this.ventas=999;
		this.horasExtras=0;
		
		float expected=2500;
		float calculado=emp.CalculoNomimaBruta(tipoE, ventas, horasExtras);
		
		assertEquals(expected, calculado);
	}
	@Test
	void testCalculoNomimaBrutaEncargado_Prima100_HorasExtras0() {
		this.tipoE=TipoEmpleado.Encargado;
		this.ventas=1200;
		this.horasExtras=0;
		
		float expected=2600;
		float calculado=emp.CalculoNomimaBruta(tipoE, ventas, horasExtras);
		
		assertEquals(expected, calculado);
	}
	@Test
	void testCalculoNomimaBrutaEncargado_Prima200_HorasExtras0() {
		this.tipoE=TipoEmpleado.Encargado;
		this.ventas=1700;
		this.horasExtras=0;
		
		float expected=2700;
		float calculado=emp.CalculoNomimaBruta(tipoE, ventas, horasExtras);
		
		assertEquals(expected, calculado);
	}
	@Test
	void testCalculoNomimaBrutaEncargado_Prima0_HorasExtras15() {
		this.tipoE=TipoEmpleado.Encargado;
		this.ventas=999;
		this.horasExtras=15;
		
		float expected=2950;
		float calculado=emp.CalculoNomimaBruta(tipoE, ventas, horasExtras);
		
		assertEquals(expected, calculado);
	}
	@Test
	void testCalculoNomimaBrutaEncargado_Prima100_HorasExtras15() {
		this.tipoE=TipoEmpleado.Encargado;
		this.ventas=1200;
		this.horasExtras=15;
		
		float expected=3050;
		float calculado=emp.CalculoNomimaBruta(tipoE, ventas, horasExtras);
		
		assertEquals(expected, calculado);
	}
	@Test
	void testCalculoNomimaBrutaEncargado_Prima200_HorasExtras15() {
		this.tipoE=TipoEmpleado.Encargado;
		this.ventas=1700;
		this.horasExtras=15;
		
		float expected=3150;
		float calculado=emp.CalculoNomimaBruta(tipoE, ventas, horasExtras);
		
		assertEquals(expected, calculado);
	}

	/*COMPROBACION CALCULO NOMINA NETA*/
	
	@Test
	void testCalculoNominaNeta_SinRetencion() {
		float sueldoBase=2000;
		float expected=2000;
		float calculado=emp.CalculoNominaNeta(sueldoBase);
		
		assertEquals(expected, calculado);
	}
	
	@Test
	void testCalculoNominaNeta_Retencion15() {
		float sueldoBase=2200;
		float expected=1870;
		float calculado=emp.CalculoNominaNeta(sueldoBase);
		
		assertEquals(expected, calculado);
	}
	
	@Test
	void testCalculoNominaNeta_Retencion18() {
		float sueldoBase=2700;
		float expected=2214;
		float calculado=emp.CalculoNominaNeta(sueldoBase);
		
		assertEquals(expected, calculado);
	}

}
