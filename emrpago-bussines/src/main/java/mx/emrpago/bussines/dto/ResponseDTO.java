package mx.emrpago.bussines.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ResponseDTO implements  Serializable {


	/**
	 * El atributo serialVersionUID.
	 */
	private static final long serialVersionUID = -1221218795945041759L;
	private Boolean success;
	private String  message;
	private String  error;
}
