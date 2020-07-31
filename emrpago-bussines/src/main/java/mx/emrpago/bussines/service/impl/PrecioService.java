package mx.emrpago.bussines.service.impl;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import mx.emrpago.bussines.dto.ResponsePrecioDTO;
import mx.emrpago.bussines.service.IPrecioService;

@Service
public class PrecioService   implements IPrecioService{

	
	
	
	public  ResponsePrecioDTO consumeRestPrecio() {
		
		
		 RestTemplate restTemplate = new RestTemplate();
		 HttpHeaders headers = new HttpHeaders();
		 HttpEntity<String> entity = new HttpEntity<>("body", headers);
		 
		 String url ="https://api.datos.gob.mx/v1/precio.gasolina.publico";
			
		 ResponseEntity<String> response =  restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

		

		 String cadena = reemplazar(response.getBody(), "﻿permisoid", "permisoid");

		 ObjectMapper mapper = new ObjectMapper();
		 ResponsePrecioDTO  responseDTO = new ResponsePrecioDTO();
		 
		 try {
			 responseDTO =  mapper.readValue(cadena, ResponsePrecioDTO.class);
		}

		catch(Exception e) {	
	
		System.out.println("error {}"+e.getMessage());
		
		}
			
     return  responseDTO;
	}
	
	

	private  String reemplazar(String cadena, String busqueda, String reemplazo) {
		  return cadena.replaceAll(busqueda, reemplazo);
		}
	
	
}
