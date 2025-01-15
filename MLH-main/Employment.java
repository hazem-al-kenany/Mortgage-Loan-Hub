public class Employment {
    // Create a constructor to initialize Employment objects.
    // and create a list of methods to get and retrieve the Employment's information.
    // Information about the Employment usually contains the following:
    /*
   • Name of current employer, phone, and street address
   • Length of time at current employer
   • Position/title
   • Salary including overtime, bonuses, or commissions
    * */
    
    // Initializing Employment variables
    public String employerName;
    public int employerPhone;
    public String employerAddress;
    public float lengthOfEmploymentInMonths;
    public String position;
    public float salary;
    
   // Default constructor
   public Employment(){
        
    }
    
    // Constructor to initialize Employment's objects
   public Employment(String employerName, int employerPhone, String employerAdress, 
    float lengthOfEmploymentInMonths, String position, float salary){
        this.employerName = employerName;
        this.employerPhone = employerPhone;
        this.employerAddress = employerAddress;
        this.lengthOfEmploymentInMonths = lengthOfEmploymentInMonths;
        this.position = position;
        this.salary = salary;
    }
   
   // Methods to set Employment's information that is not included in default constructor
   public void setEmployername(String name){
        employerName = name;
    }
    
    public void setEmployerPhone(int phone){
        employerPhone = phone;
    }
    
    public void setEmployerAddress(String address){
        employerAddress = address;
    }
    
    public void setLengthOfEmploymentInMonths(float length){
        lengthOfEmploymentInMonths = length;
    }
    
    public void setposition(String Position){
        position = Position;
    }
    
    public void setSalary(float Salary){
        salary = Salary;
    }
    
    // Methods to get and retrieve Employment's information
    public String getEmployerName(){
        return employerName;
    }
    
    public int getEmployerPhone(){
        return employerPhone;
    }
    
    public String getEmployerAddress(){
        return employerAddress;
    }
    
    public float getLengthOfEmploymentInMonths(){
        return lengthOfEmploymentInMonths;
    }
    
    public String getposition(){
        return position;
    }
    
    public float getSalary(){
        return salary;
    }
}
