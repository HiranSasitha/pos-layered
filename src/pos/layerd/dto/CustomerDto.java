/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.dto;

/**
 *
 * @author Hiran
 */
public class CustomerDto {
     private String custId;
    private String title;
    private String names;
    private String dob;
    private Double salary;
    private String address;
    private String city;
    private String province;
    private String zip;

    public CustomerDto() {
    }

    public CustomerDto(String custId, String title, String names, String dob, Double salary, String address, String city, String province, String zip) {
        this.custId = custId;
        this.title = title;
        this.names = names;
        this.dob = dob;
        this.salary = salary;
        this.address = address;
        this.city = city;
        this.province = province;
        this.zip = zip;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the names
     */
    public String getNames() {
        return names;
    }

    /**
     * @param names the names to set
     */
    public void setNames(String names) {
        this.names = names;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the salary
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "custId=" + custId + ", title=" + title + ", names=" + names + ", dob=" + dob + ", salary=" + salary + ", address=" + address + ", city=" + city + ", province=" + province + ", zip=" + zip + '}';
    }
    
    
    
}