package mx.emrpago.bussines.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import mx.emrpago.bussines.data.entities.InFomrPagoEntity;
import mx.emrpago.bussines.data.repositories.InFomrPagoRepository;
import mx.emrpago.bussines.dto.InfoRQ;
import mx.emrpago.bussines.dto.ResponseDTO;
import mx.emrpago.bussines.dto.ResponsePrecioDTO;
import mx.emrpago.bussines.dto.ResultadosDTO;
import mx.emrpago.bussines.enums.GasType;
import mx.emrpago.bussines.service.IBusquedaService;
import mx.emrpago.bussines.service.IPrecioService;

@SpringBootTest(classes = InitialiazerTest.class)
public class PruebaInicial {


	@Autowired
	private IPrecioService iPrecioService;
	
	
	@Autowired
	private IBusquedaService iBusquedaService;
	
	@Autowired
	private InFomrPagoRepository inFomrPagoRepository;
	

	
	
	@Test
	public void iniPrueba() {
		System.out.println("Inicio de pruebas");
		
	}
	
	
	@Test
	public void consumoRest() {
		 RestTemplate restTemplate = new RestTemplate();
		 HttpHeaders headers = new HttpHeaders();
		 HttpEntity<String> entity = new HttpEntity<>("body", headers);
		 
		 String url ="https://api.datos.gob.mx/v1/precio.gasolina.publico";
			
		 ResponseEntity<String> response =  restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

		 System.out.println("valor de la  respuesta "+response.getBody());

		 String cadena = reemplazar(response.getBody(), "﻿permisoid", "permisoid");
		 
		 
		 System.out.println("valor con la cadena de remplazo "+cadena);
		 ObjectMapper mapper = new ObjectMapper();
		 ResponsePrecioDTO  responseDTO = new ResponsePrecioDTO();
		 
		 try {
			 responseDTO =  mapper.readValue(cadena, ResponsePrecioDTO.class);
		}
//		catch (JsonProcessingException e) {
		catch(Exception e) {	
	
		System.out.println("error {}"+e.getMessage());
		
		}
		 System.out.println("valor de la  respuesta "+responseDTO.toString());
	
		
		
	}
	
	
	@Test
	public void servicetestPrecio() {
		
		String id ="587fbd68edfe99480a072f15";
		 ResponsePrecioDTO  responseDTO = new ResponsePrecioDTO();
		 responseDTO  = iPrecioService.consumeRestPrecio();
		
		System.out.println("valor del servicio  Rest"+ responseDTO.toString());
		
		
		
		List<ResultadosDTO> lstResult = new ArrayList<ResultadosDTO>();
		
		responseDTO.getResults().stream().forEach(p ->{
			
			
			if(p.get_id().equals(id)) {
				System.out.println(" Es el mismo id" +p.get_id());
				ResultadosDTO  resultado =  new ResultadosDTO();
				resultado = p;
				lstResult.add(resultado);
			}
		});
		
		
		System.out.println("resultado de la  lista "+lstResult);
		
	}
	
	
	@Test
	public  void  puebaBusqueda() {
		
		
		  InfoRQ infoRQ = getData();
	      ResponseDTO response =	iBusquedaService.busquedaPrecio(infoRQ);
		
	     System.out.println("valor del Reposnse"+response);
		
		
	}
	
	
	
	
	
	private InfoRQ getData() {
		
		InfoRQ infoRQ = new InfoRQ();
		       infoRQ.setEmail("info@srpago.com");
		       infoRQ.setName("Juan");
		       infoRQ.setLastName("Perez");
		       infoRQ.setCardNumber("4242424242424242");
               infoRQ.setExpirationDateYear(20);
               infoRQ.setExpirationDateMonth(12);
               infoRQ.setGasType(1);
               infoRQ.setAmount(350.00);	    
               infoRQ.setGasStation("587fbd68edfe99480a072f15");
               infoRQ.setSellerName("Juan Perez");
		
	 return infoRQ;	
	}
	
	
	@Test
	public void  pruebaRepo() {
		
		try {
	        List<InFomrPagoEntity> lst =	inFomrPagoRepository.findAll();
		
	        System.out.println("Se Obtuvo la lista"+ lst.toString());
		} catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	
	@Test
	public void  pruebaRepoInsert() {
		
		InFomrPagoEntity  frmpago = new InFomrPagoEntity();
		frmpago.setLastName("preuba");
		frmpago.setDate_insert("31/07/2020");
		try {
	      	inFomrPagoRepository.save(frmpago);
		
	        System.out.println("Se Guardo Correctamente");
		} catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	
	
	@Test
	public void valenum() {
		
		System.out.println(GasType.getTipoByValue(1).getNombre());
		
		
	}
	
	private  String reemplazar(String cadena, String busqueda, String reemplazo) {
		  return cadena.replaceAll(busqueda, reemplazo);
		}
	
	
}
