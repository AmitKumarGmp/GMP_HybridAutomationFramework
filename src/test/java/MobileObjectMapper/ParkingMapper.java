package MobileObjectMapper;

public class ParkingMapper {
	
	private String parkingname;
    private String parkingidentifier;
    private String currency;
    
    public ParkingMapper(){}

    public String getCurrencysymbol() {
        return currency;
    }

    public void setCurrencysymbol(String currency) {
        this.currency = currency;
    }

    
    public String getParkingname() {
        return parkingname;
    }

    public void setParkingname(String parkingname) {
        this.parkingname = parkingname;
    }

    public String getParkingidentifier() {
        return parkingidentifier;
    }

    public void setParkingidentifier(String parkingidentifier) {
        this.parkingidentifier = parkingidentifier;
    }

    @Override
    public String toString() {
        return  "ParkingMapper{" +
                "parkingname='" + parkingname + '\'' +
                ", parkingidentifier='" + parkingidentifier + '\'' +
                ", currencysymbol='" + currency+ '\'' +  
                '}';
    }
}