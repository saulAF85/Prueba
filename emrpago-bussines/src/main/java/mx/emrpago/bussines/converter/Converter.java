package mx.emrpago.bussines.converter;

import org.springframework.stereotype.Component;

import mx.emrpago.bussines.data.entities.InFomrPagoEntity;
import mx.emrpago.bussines.dto.InfoRQ;
import mx.emrpago.bussines.dto.ResultadosDTO;
import mx.emrpago.bussines.enums.GasType;

@Component 
public class Converter implements IConverter {

	
	
	public InFomrPagoEntity converterDTO(InfoRQ infoReq, ResultadosDTO resultadosDTO) {
		

		InFomrPagoEntity  frmpago = new InFomrPagoEntity();
//		frmpago.setIdInfo(Long idInfo);
				frmpago.setEmail(infoReq.getEmail());
				frmpago.setName(infoReq.getName());
				frmpago.setLastName(infoReq.getLastName());
				frmpago.setCardNumber(infoReq.getCardNumber());
				frmpago.setExpirationDateYear(infoReq.getExpirationDateYear()) ;
				frmpago.setExpirationDateMonth(infoReq.getExpirationDateMonth());
				frmpago.setGasType(GasType.getTipoByValue(infoReq.getGasType()).getNombre());
				frmpago.setAmount(infoReq.getAmount());
				frmpago.setGasStation(infoReq.getGasStation());
				frmpago.setSellerName(infoReq.getSellerName());
				frmpago.setId(resultadosDTO.get_id());
				frmpago.setCalle(resultadosDTO.getCalle());
				frmpago.setRfc(resultadosDTO.getRfc());
				frmpago.setDate_insert(resultadosDTO.getDate_insert());
				frmpago.setRegular(resultadosDTO.getRegular());
				frmpago.setColonia(resultadosDTO.getColonia());
				frmpago.setNumeropermiso(resultadosDTO.getNumeropermiso());
				frmpago.setFechaaplicacion(resultadosDTO.getFechaaplicacion());
				frmpago.setLongitude(resultadosDTO.getLongitude());
				frmpago.setLatitude(resultadosDTO.getLatitude());
				frmpago.setPremium(resultadosDTO.getPremium());
				frmpago.setRazonsocial(resultadosDTO.getRazonsocial());
				frmpago.setCodigopostal(resultadosDTO.getCodigopostal());
				frmpago.setDieasel(resultadosDTO.getDieasel());
		
		
		
		
		
		
		return frmpago;
		
	}
	

}
