package pro.sky.skyprospringdemo.domain;

public class TruckDriver extends Driver {

    public TruckDriver(String name, String surname, String passport, String driverLicenseNumber, int professionNumber) {
        super(name, surname, passport, driverLicenseNumber, professionNumber);
    }

    public void setDriverLicenceNumber(String driverLicenceNumber) {
        if (driverLicenceNumber != null && driverLicenceNumber.startsWith("2")) {
            super.setDriverLicenseNumber(driverLicenceNumber);
        }
    }
}
