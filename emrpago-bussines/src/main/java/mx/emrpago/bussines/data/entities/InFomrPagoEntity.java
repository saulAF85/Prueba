package mx.emrpago.bussines.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "infomrpago")
public class InFomrPagoEntity {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idinfo")
	private Long idInfo;
	@Column(name = "email")
	private String email;
	@Column(name = "name")
	private String name;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "cardnumber")
	private String cardNumber;
	@Column(name = "expirationdateyear")
	private Integer expirationDateYear;
	@Column(name = "expirationdatemonth")
	private Integer expirationDateMonth;
	@Column(name = "gastype")
	private String gasType;
	@Column(name = "amount")
	private Double amount; 
	@Column(name = "gasstation")
	private String gasStation;
	@Column(name = "sellername")
	private String sellerName;
	@Column(name = "id")
	private String id;
	@Column(name = "calle")
	private String calle;
	@Column(name = "rfc")
	private String rfc; 
	@Column(name = "date_insert")
	private String date_insert;
	@Column(name = "regular")
	private String regular; 
	@Column(name = "colonia")
	private String colonia;
	@Column(name = "numeropermiso")
	private String numeropermiso;
	@Column(name = "fechaaplicacion")
	private String fechaaplicacion;
	@Column(name = "longitude")
	private String longitude;
	@Column(name = "latitude")
	private String latitude;
	@Column(name = "premium")
	private String premium; 
	@Column(name = "razonsocial")
	private String razonsocial;
	@Column(name = "codigopostal")
	private String codigopostal;
	@Column(name = "dieasel")
	private String dieasel;
	public Long getIdInfo() {
		return idInfo;
	}
	public void setIdInfo(Long idInfo) {
		this.idInfo = idInfo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Integer getExpirationDateYear() {
		return expirationDateYear;
	}
	public void setExpirationDateYear(Integer expirationDateYear) {
		this.expirationDateYear = expirationDateYear;
	}
	public Integer getExpirationDateMonth() {
		return expirationDateMonth;
	}
	public void setExpirationDateMonth(Integer expirationDateMonth) {
		this.expirationDateMonth = expirationDateMonth;
	}

	public String getGasType() {
		return gasType;
	}
	public void setGasType(String gasType) {
		this.gasType = gasType;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getGasStation() {
		return gasStation;
	}
	public void setGasStation(String gasStation) {
		this.gasStation = gasStation;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getDate_insert() {
		return date_insert;
	}
	public void setDate_insert(String date_insert) {
		this.date_insert = date_insert;
	}
	public String getRegular() {
		return regular;
	}
	public void setRegular(String regular) {
		this.regular = regular;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getNumeropermiso() {
		return numeropermiso;
	}
	public void setNumeropermiso(String numeropermiso) {
		this.numeropermiso = numeropermiso;
	}
	public String getFechaaplicacion() {
		return fechaaplicacion;
	}
	public void setFechaaplicacion(String fechaaplicacion) {
		this.fechaaplicacion = fechaaplicacion;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	public String getRazonsocial() {
		return razonsocial;
	}
	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}
	public String getCodigopostal() {
		return codigopostal;
	}
	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}
	public String getDieasel() {
		return dieasel;
	}
	public void setDieasel(String dieasel) {
		this.dieasel = dieasel;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((calle == null) ? 0 : calle.hashCode());
		result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
		result = prime * result + ((codigopostal == null) ? 0 : codigopostal.hashCode());
		result = prime * result + ((colonia == null) ? 0 : colonia.hashCode());
		result = prime * result + ((date_insert == null) ? 0 : date_insert.hashCode());
		result = prime * result + ((dieasel == null) ? 0 : dieasel.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((expirationDateMonth == null) ? 0 : expirationDateMonth.hashCode());
		result = prime * result + ((expirationDateYear == null) ? 0 : expirationDateYear.hashCode());
		result = prime * result + ((fechaaplicacion == null) ? 0 : fechaaplicacion.hashCode());
		result = prime * result + ((gasStation == null) ? 0 : gasStation.hashCode());
		result = prime * result + ((gasType == null) ? 0 : gasType.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idInfo == null) ? 0 : idInfo.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((numeropermiso == null) ? 0 : numeropermiso.hashCode());
		result = prime * result + ((premium == null) ? 0 : premium.hashCode());
		result = prime * result + ((razonsocial == null) ? 0 : razonsocial.hashCode());
		result = prime * result + ((regular == null) ? 0 : regular.hashCode());
		result = prime * result + ((rfc == null) ? 0 : rfc.hashCode());
		result = prime * result + ((sellerName == null) ? 0 : sellerName.hashCode());
		return result;
	}
	
	
	
	
	
}
