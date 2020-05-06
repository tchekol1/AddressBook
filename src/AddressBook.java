import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBook {
    //name, address, city, state, zip, phone, email.
    private String name;
    private String city;
    private String state;
    private int zip;
    private String phone;
    private String email;
    public AddressBook(){

    }
    public AddressBook(String name, String city, String state, int zip, String phone, String email) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isEmailValid(String email){
        String expression="^[\\w\\.-]+@([\\w-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern= Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
        Matcher matcher= pattern.matcher(email);

      return matcher.matches();
    }
    public boolean isPhoneNumberValid(String phoneNumber){
        boolean isValid = false;

        String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        CharSequence inputStr = phoneNumber;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()){
            isValid = true;
        }
        return isValid;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'';
    }
}

