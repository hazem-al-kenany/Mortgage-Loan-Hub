public class Property {
    private String propertyName;
    private String propertyNumber;
    private String streetAddress;
    private double expectedSalesPrice;
    private String typeOfHome;
    private double sizeOfProperty;
    private double realEstateTaxes;
    private double homeownerAssociationDues;

    public Property(String streetAddress, double expectedSalesPrice, String typeOfHome, double sizeOfProperty,
                    double realEstateTaxes, double homeownerAssociationDues) {
        this.streetAddress = streetAddress;
        this.expectedSalesPrice = expectedSalesPrice;
        this.typeOfHome = typeOfHome;
        this.sizeOfProperty = sizeOfProperty;
        this.realEstateTaxes = realEstateTaxes;
        this.homeownerAssociationDues = homeownerAssociationDues;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyNumber() {
        return propertyNumber;
    }

    public void setPropertyNumber(String propertyNumber) {
        this.propertyNumber = propertyNumber;
    }
    
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public double getExpectedSalesPrice() {
        return expectedSalesPrice;
    }

    public void setExpectedSalesPrice(double expectedSalesPrice) {
        this.expectedSalesPrice = expectedSalesPrice;
    }

    public String getTypeOfHome() {
        return typeOfHome;
    }

    public void setTypeOfHome(String typeOfHome) {
        this.typeOfHome = typeOfHome;
    }

    public double getSizeOfProperty() {
        return sizeOfProperty;
    }

    public void setSizeOfProperty(double sizeOfProperty) {
        this.sizeOfProperty = sizeOfProperty;
    }

    public double getRealEstateTaxes() {
        return realEstateTaxes;
    }

    public void setRealEstateTaxes(double realEstateTaxes) {
        this.realEstateTaxes = realEstateTaxes;
    }

    public double getHomeownerAssociationDues() {
        return homeownerAssociationDues;
    }

    public void setHomeownerAssociationDues(double homeownerAssociationDues) {
        this.homeownerAssociationDues = homeownerAssociationDues;
    }
}
