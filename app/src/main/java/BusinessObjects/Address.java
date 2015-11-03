package BusinessObjects;

/**
 * Created by Das on 03/11/15.
 */
public class Address {

    private String addressLine;
    private String city;
    private String state;
    private  String country;
    private String postalCode;

    public Address(String addressLine, String city, String state, String country, String postalCode)
    {
        this.addressLine = addressLine;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
    }

    public String getAddressLine()
    {
        return this.addressLine;
    }

    public void setAddressLine(String addressLine)
    {
        this.addressLine = addressLine;
    }

    public String getCity()
    {
        return this.city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return this.state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getCountry()
    {
        return this.country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getPostalCode()
    {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
    }
}
