package mx.emrpago.bussines.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.emrpago.bussines.converter.IConverter;
import mx.emrpago.bussines.data.entities.InFomrPagoEntity;
import mx.emrpago.bussines.data.repositories.InFomrPagoRepository;
import mx.emrpago.bussines.dto.InfoRQ;
import mx.emrpago.bussines.dto.ResponseDTO;
import mx.emrpago.bussines.dto.ResponsePrecioDTO;
import mx.emrpago.bussines.dto.ResultadosDTO;
import mx.emrpago.bussines.service.IBusquedaService;
import mx.emrpago.bussines.service.IPrecioService;

@Service
public class BusquedaService  implements  IBusquedaService{

	
	@Autowired
	private IPrecioService iPrecioService;
	
	@Autowired
	private IConverter iconverter;
	
	@Autowired
	private InFomrPagoRepository inFomrPagoRepository;
	
	public ResponseDTO busquedaPrecio(InfoRQ infoReq) {
		
		
		
		
		 ResponseDTO response = new ResponseDTO();
	try {
					 ResponsePrecioDTO  responseDTO = new ResponsePrecioDTO();
					                    responseDTO  = iPrecioService.consumeRestPrecio();
					
					if(!responseDTO.getResults().isEmpty()) {
						
										
			                       System.out.println("valor del servicio  Rest"+ responseDTO.toString());
										
										
										
										List<ResultadosDTO> lstResult = new ArrayList<ResultadosDTO>();
										
										responseDTO.getResults().stream().forEach(p ->{
											
											
											if(p.get_id().equals(infoReq.getGasStation())) {
												System.out.println(" Es el mismo id" +p.get_id());
												ResultadosDTO  resultado =  new ResultadosDTO();
												resultado = p;
												lstResult.add(resultado);
												
											}
										});
										
										System.out.println("resultado de la  lista "+lstResult);
										if(!lstResult.isEmpty()) {
													lstResult.stream().forEach(r ->{
														InFomrPagoEntity  inFomrPagoEntity = iconverter.converterDTO(infoReq, r);
														
														inFomrPagoRepository.save(inFomrPagoEntity);
													});	
													response.setSuccess(true);
													response.setMessage("Informacion correcta");		
										}else {
											
											response.setSuccess(true);
											response.setMessage(" No se encontro Informacion");		
										}
										
										
					} else {
						
						response.setSuccess(true);
						response.setMessage("No se encontro  el servicio  Precios");
						
					}
	} catch(Exception e) {
		response.setSuccess(true);
		response.setMessage("Ocurrio un problema en el servicio");
		response.setError(e.getMessage());
	}
							
	 return response;	
	}
	
	
	
}
