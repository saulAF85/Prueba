package mx.emrpago.bussines.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class InfoRQ {

	@NotBlank
    private String email;
	@NotBlank
    private String name;
	@NotBlank
    private String lastName;
	@NotBlank
    private String cardNumber;
	
    private Integer expirationDateYear;
	
    private Integer expirationDateMonth;

    private Integer gasType;

    private Double amount;
	@NotBlank
    private String gasStation;
	@NotBlank
    private String sellerName;
}
