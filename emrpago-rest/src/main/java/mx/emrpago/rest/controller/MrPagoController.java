package mx.emrpago.rest.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.emrpago.bussines.dto.InfoRQ;
import mx.emrpago.bussines.dto.ResponseDTO;
import mx.emrpago.bussines.service.IBusquedaService;



@RestController
@RequestMapping(MrPagoController.ROOT_URL)
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class MrPagoController {

	
	/** The Constant ROOT_URL. */
	public static final String ROOT_URL = "/mrpago";

	
	@Autowired
	private IBusquedaService iBusquedaService;
	
	
	
	
	
	@RequestMapping(value = "/version")
	 public String version() {
     String version= "mrpago-v1"+new Date();
	return version;
    }
	
	@PostMapping(value = "/precio")
	public ResponseDTO servicioBusqueda(@Valid @RequestBody InfoRQ request) {
		
		ResponseDTO responseDTO = new ResponseDTO();
			 if(request.getAmount() != null && request.getAmount() > 1 ) {	
				
				            responseDTO = iBusquedaService.busquedaPrecio(request);
			 }else {
				 responseDTO.setSuccess(false);
				 responseDTO.setMessage("Saldo Insuficiente");
			 }
		
		return responseDTO;
	}
	

	
}
