package mx.emrpago.bussines.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;


@Data
public class ResponsePrecioDTO  implements Serializable {

	
	/**
	 * El atributo serialVersionUID.
	 */
	private static final long serialVersionUID = 699606938746148074L;
	private PaginationDTO pagination;
	private List<ResultadosDTO> results;
}
