package mx.emrpago.bussines.converter;

import mx.emrpago.bussines.data.entities.InFomrPagoEntity;
import mx.emrpago.bussines.dto.InfoRQ;
import mx.emrpago.bussines.dto.ResultadosDTO;

public interface IConverter {

	InFomrPagoEntity converterDTO(InfoRQ infoReq, ResultadosDTO resultadosDTO);
}
