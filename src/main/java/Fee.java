package main.java;
public class Fee {

    private String customerType;
    private String dayType;
    private int fee;

    public Fee(String customerType, String dayType, int fee) {
        this.customerType = customerType;
        this.dayType = dayType;
        this.fee = fee;
    }

    public String getDayType() {
        return dayType;
    }

    public void setDayType(String dayType) {
        this.dayType = dayType;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
}
