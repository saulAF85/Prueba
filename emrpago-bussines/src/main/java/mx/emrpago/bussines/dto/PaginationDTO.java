package mx.emrpago.bussines.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PaginationDTO  implements Serializable{

   /**
	 * El atributo serialVersionUID.
	 */
	private static final long serialVersionUID = -2912382404842600189L;
   private Integer pageSize;
   private Integer page;
   private Integer total;
	
}
