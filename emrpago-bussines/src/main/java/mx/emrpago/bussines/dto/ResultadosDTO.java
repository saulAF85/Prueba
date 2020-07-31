package mx.emrpago.bussines.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ResultadosDTO  implements Serializable{
	
   /**
	 * El atributo serialVersionUID.
	 */
	private static final long serialVersionUID = 6619936257229893139L;
   private String _id; 
   private String calle;
   private String rfc;
   private String date_insert;
   private String regular;
   private String colonia;
   private String numeropermiso;
   private String fechaaplicacion;
   private String permisoid;
   private String longitude;
   private String latitude;
   private String premium;
   private String razonsocial;
   private String codigopostal;
   private String dieasel;
	
}
