package mx.emrpago.bussines.enums;

import java.util.Arrays;



public enum GasType {

	
	Magna(1,"Magna"),
	Premium(2,"Premium");
	
	   //Campos tipo constante   
    private final int tipoGas; 
    private final String nombre; 

    
    
    GasType(int tipoGas, String nombre){
        this.tipoGas = tipoGas;
        this.nombre = nombre;
    }
    
   
    
    public int getTipoGas() {
		return tipoGas;
	}

    
	public String getNombre() {
		return nombre;
	}
	
	public static GasType getTipoByValue(int tipoGas) {
		GasType gasType = Arrays.asList(GasType.values())
				.stream()
				.filter(x -> x.tipoGas == tipoGas)
				.findAny()
				.orElse(null);
		return gasType;
	}
	







}