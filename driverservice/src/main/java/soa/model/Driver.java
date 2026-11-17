package soa.model;

public class Driver {

    private int driver_id;
    private String driver_name;
    private String vehicle;

    public Driver(int driver_id, String driver_name, String vehicle) {
        this.driver_id = driver_id;
        this.driver_name = driver_name;
        this.vehicle = vehicle;
    }

    public int getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(int driver_id) {
        this.driver_id = driver_id;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
}