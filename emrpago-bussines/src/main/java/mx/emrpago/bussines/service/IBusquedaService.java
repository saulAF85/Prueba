package mx.emrpago.bussines.service;

import mx.emrpago.bussines.dto.InfoRQ;
import mx.emrpago.bussines.dto.ResponseDTO;

public interface IBusquedaService {
	
	ResponseDTO busquedaPrecio(InfoRQ infoReq);
}
