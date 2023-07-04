/**
 * 
 */
package clases;

/**
 * @author David
 *
 */
public class CuentaBancaria {
	
	// variable miembro o de instancia
	private long numCuenta; 
	private long dni;
	private double saldo;
	private double interes;
	
	// variable de clase 
	private static long generadorCuenta=100001;
	
	public static final double INTERESNORMAL = 0.05;
	
	public CuentaBancaria() {
		this.numCuenta= CuentaBancaria.generadorCuenta;
		CuentaBancaria.generadorCuenta++;
		this.dni=0;
		this.saldo=0;
		this.interes=INTERESNORMAL;
	}
	
	public CuentaBancaria(long dni, double saldo, double interes) {
		this.numCuenta= CuentaBancaria.generadorCuenta;
		CuentaBancaria.generadorCuenta++;
		this.dni=dni;
		this.saldo=saldo;
		this.interes=interes;
	}
	
	// Getters y setters
	
	public long getNumCuenta() {
		return this.numCuenta;
	}
	
	public long getDni() {
		return this.dni;
	}
	
	public void setDni(long dni) {
		this.dni=dni;
	}
	
	public double getInteres() {
		return this.interes;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	/**
	 * Método de la clase que actuliza el saldo de la cuenta 
	 * añadiendo los interises diarios
	 */
	public void actualizarSaldo() {
		this.saldo=this.saldo+(this.saldo*this.interes)/365;
	}
	
	/**
	 * Método de la clase que permite ingresar una cantidad de dinero
	 * Sólo se actualizará si la cantidad es positiva
	 * @param cantidad double con la cantidad a ingresar
	 * @return true si se ha ingresado la cantidad y false en caso contrario
	 */
	public boolean ingresar(double cantidad) {
		if (cantidad>0) {
			this.saldo=this.saldo+cantidad;
			return true;
		}
		return false;
	}
	
	/**
	 * Método de la clase que permite retirar iuna cantidad de la cuenta 
	 * @param cantidad cantidad a retirar
	 * @return true si ha retirado la cantidad y false en caso contrario
	 */
	public boolean retirar(double cantidad) {
		if (this.saldo >= cantidad) {
			this.saldo= this.saldo-cantidad;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [numCuenta=" + numCuenta + ", dni=" + dni 
				+ ", saldo=" + saldo + ", interes=" + interes
				+ "]";
	}

	public void setInteres(double interes) {
		this.interes = interes;
		
	}
	
	
	

}
