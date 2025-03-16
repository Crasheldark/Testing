package clasePersona;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class TestPersona {
	
	private static clasePersona.Persona persona1;
	private static clasePersona.Persona persona2;
	private static clasePersona.Persona persona3;
	private static clasePersona.Persona persona4;
	private static clasePersona.Persona persona5;
	private static clasePersona.Persona persona6;
	private static clasePersona.Persona persona7;
	private static clasePersona.Persona persona8;

	@BeforeAll
	public static void createObjects () {
		persona1 = new Persona();
		persona2 = new Persona("Julio", 23, 'H');
		persona3 = new Persona("Pepe", 45, 'P');
		persona4 = new Persona("Persona1", 98, 'M', 76.56, 1.67);
		persona5 = new Persona("Persona2", 56, 'H', 0.0, 0.0);
		persona6 = new Persona("Persona3", 71, 'M', 126.56, 1.34);
		persona7 = new Persona("Persona4", 13, 'L');
		persona8 = new Persona("", 29, 'J');
	}
	
	@Test 
	void testConstructor() {
		assertEquals(persona1.toString(), "Informacion de la persona:\n"
                + "Nombre: " + "" + "\n"
                + "Sexo: " + "hombre" + "\n"
                + "Edad: " + 0 + " años\n"
                + "DNI: " + persona1.getDNI() + "\n"
                + "Peso: " + 0.0 + " kg\n"
                + "Altura: " + 0.0 + " metros\n");
		assertEquals(persona2.toString(), "Informacion de la persona:\n"
                + "Nombre: " + "Julio" + "\n"
                + "Sexo: " + "hombre" + "\n"
                + "Edad: " + 23 + " años\n"
                + "DNI: " + persona2.getDNI() + "\n"
                + "Peso: " + 0.0 + " kg\n"
                + "Altura: " + 0.0 + " metros\n");
		assertEquals(persona3.toString(), "Informacion de la persona:\n"
                + "Nombre: " + "Pepe" + "\n"
                + "Sexo: " + "hombre" + "\n"
                + "Edad: " + 45 + " años\n"
                + "DNI: " + persona3.getDNI() + "\n"
                + "Peso: " + 0.0 + " kg\n"
                + "Altura: " + 0.0 + " metros\n");
		assertEquals(persona4.toString(), "Informacion de la persona:\n"
                + "Nombre: " + "Persona1" + "\n"
                + "Sexo: " + "mujer" + "\n"
                + "Edad: " + 98 + " años\n"
                + "DNI: " + persona4.getDNI() + "\n"
                + "Peso: " + 76.56 + " kg\n"
                + "Altura: " + 1.67 + " metros\n");
		assertEquals(persona5.toString(), "Informacion de la persona:\n"
                + "Nombre: " + "Persona2" + "\n"
                + "Sexo: " + "hombre" + "\n"
                + "Edad: " + 56 + " años\n"
                + "DNI: " + persona5.getDNI() + "\n"
                + "Peso: " + 0.0 + " kg\n"
                + "Altura: " + 0.0 + " metros\n");
		assertEquals(persona6.toString(), "Informacion de la persona:\n"
                + "Nombre: " + "Persona3" + "\n"
                + "Sexo: " + "mujer" + "\n"
                + "Edad: " + 71 + " años\n"
                + "DNI: " + persona6.getDNI() + "\n"
                + "Peso: " + 126.56 + " kg\n"
                + "Altura: " + 1.34 + " metros\n");
		assertEquals(persona7.toString(), "Informacion de la persona:\n"
                + "Nombre: " + "Persona4" + "\n"
                + "Sexo: " + "hombre" + "\n"
                + "Edad: " + 13 + " años\n"
                + "DNI: " + persona7.getDNI() + "\n"
                + "Peso: " + 0.0 + " kg\n"
                + "Altura: " + 0.0 + " metros\n");
		assertEquals(persona8.toString(), "Informacion de la persona:\n"
                + "Nombre: " + "" + "\n"
                + "Sexo: " + "hombre" + "\n"
                + "Edad: " + 29 + " años\n"
                + "DNI: " + persona8.getDNI() + "\n"
                + "Peso: " + 0.0 + " kg\n"
                + "Altura: " + 0.0 + " metros\n");
	}
	/**
	 * SOlo lo hago de aqui, pues supongo que los metodos que crean el dni funcionan, da igual como, mientras generen el dni
	 */
	@Test
	void testDNI() {
		String dniRegExp = "\\d{8}[A-Z]";
		assertTrue(persona1.getDNI().matches(dniRegExp));
		assertTrue(persona2.getDNI().matches(dniRegExp));
		assertTrue(persona3.getDNI().matches(dniRegExp));
		assertTrue(persona4.getDNI().matches(dniRegExp));
		assertTrue(persona5.getDNI().matches(dniRegExp));
		assertTrue(persona6.getDNI().matches(dniRegExp));
		assertTrue(persona7.getDNI().matches(dniRegExp));
		assertTrue(persona8.getDNI().matches(dniRegExp));
		
	}
	
	@Test
	@Order(2)
	void testIMC() {
		assertEquals(persona1.calcularIMC(), Persona.INFRAPESO);
		assertEquals(persona2.calcularIMC(), Persona.INFRAPESO);
		assertEquals(persona3.calcularIMC(), Persona.INFRAPESO);
		assertEquals(persona4.calcularIMC(), Persona.SOBREPESO);
		assertEquals(persona5.calcularIMC(), Persona.INFRAPESO);
		assertEquals(persona6.calcularIMC(), Persona.SOBREPESO);
		assertEquals(persona7.calcularIMC(), Persona.INFRAPESO);
		assertEquals(persona8.calcularIMC(), Persona.INFRAPESO);
		

	}
	@Test
	void testMayorEdad() {
		assertFalse(persona1.esMayorDeEdad());
		assertTrue(persona2.esMayorDeEdad());
		assertTrue(persona3.esMayorDeEdad());
		assertTrue(persona4.esMayorDeEdad());
		assertTrue(persona5.esMayorDeEdad());
		assertTrue(persona6.esMayorDeEdad());
		assertFalse(persona7.esMayorDeEdad());
		assertTrue(persona8.esMayorDeEdad());
		
	}
	
	/**
	 * test Setters, aqui no usaré las personas estaticas, por que afectan a los test del constructor
	 */
	@Test
	void testSetterNombre() {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();
		Persona persona4 = new Persona();
		persona1.setNombre("nombre");
		assertEquals(persona1.getNombre(), "nombre");
		persona2.setNombre("hola");
		assertEquals(persona2.getNombre(), "hola");
		persona3.setNombre("julio");
		assertEquals(persona3.getNombre(), "julio");
		persona4.setNombre("erbmon");
		assertEquals(persona4.getNombre(), "erbmon");
	}
	
	@Test
	void testSetterEdad() {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();
		Persona persona4 = new Persona();
		persona1.setEdad(23);
		assertEquals(persona1.getEdad(), 23);
		persona2.setEdad(66);
		assertEquals(persona2.getEdad(), 66);
		persona3.setEdad(98);
		assertEquals(persona3.getEdad(), 98);
		persona4.setEdad(12);
		assertEquals(persona4.getEdad(), 12);
	}
	
	/**
	 * Por primera vez tengo que hacer esto, a persar de haber hecho ya test con double en el pasado
	 * Parece ser que al haver assertEquals con double, existen errores de redondeo aunque solo uses 2 decimales
	 * Asi que debo añadirle un valor de redondeo llamado "delta" al final de el test
	 */
	
	@Test
	void testSetterPeso() {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();
		Persona persona4 = new Persona();
		persona1.setPeso(23);
		Assert.assertEquals(persona1.getPeso(), 23, 0.01);
		persona2.setPeso(66);
		Assert.assertEquals(persona2.getPeso(), 66, 0.01);
		persona3.setPeso(98);
		Assert.assertEquals(persona3.getPeso(), 98, 0.01);
		persona4.setPeso(12);
		Assert.assertEquals(persona4.getPeso(), 12, 0.01);
	}
	
	@Test
	void testSetterSexo() {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();
		Persona persona4 = new Persona();
		persona1.setSexo('M');
		assertEquals(persona1.getSexo(), 'M');
		persona2.setSexo('H');
		assertEquals(persona2.getSexo(), 'H');
		persona3.setSexo('a');
		assertEquals(persona3.getSexo(), 'H');
		persona4.setSexo('M');
		assertEquals(persona4.getSexo(), 'M');
	}
	
	@Test
	void testSetterAltura() {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();
		Persona persona4 = new Persona();
		persona1.setAltura(1.27);
		Assert.assertEquals(persona1.getAltura(), 1.27, 0.01);
		persona2.setAltura(6.66);
		Assert.assertEquals(persona2.getAltura(), 6.66, 0.01);
		persona3.setAltura(0.15);
		Assert.assertEquals(persona3.getAltura(), 0.15, 0.01);
		persona4.setAltura(3.89);
		Assert.assertEquals(persona4.getAltura(), 3.89, 0.01);
	}
}
