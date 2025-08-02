package com.VehicalRentalManagementSystem.VehicalRentalManagementSystem.Model;

import com.VehicalRentalManagementSystem.VehicalRentalManagementSystem.Enum.VehicalType;
import com.VehicalRentalManagementSystem.VehicalRentalManagementSystem.Enum.VehicleStatus;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  vehicleId;
    @Column(nullable = false)
    private String vehicalBrand;
    @Column(nullable = false)
    private String model;

    private VehicalType vehicalType;

    @Column(nullable = false)
    private String vehicalRegestrationNo;

    @Column(nullable = false)
    private Integer  SeatingCapacity;

    private Double pricePerDay;

    private VehicleStatus status;

    private String vehicleImageUrl;

    @OneToMany(mappedBy = "vehicle",cascade = CascadeType.ALL)
    private List<Booking> booking;


    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicalBrand() {
        return vehicalBrand;
    }

    public void setVehicalBrand(String vehicalBrand) {
        this.vehicalBrand = vehicalBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public VehicalType getVehicalType() {
        return vehicalType;
    }

    public void setVehicalType(VehicalType vehicalType) {
        this.vehicalType = vehicalType;
    }

    public String getVehicalRegestrationNo() {
        return vehicalRegestrationNo;
    }

    public void setVehicalRegestrationNo(String vehicalRegestrationNo) {
        this.vehicalRegestrationNo = vehicalRegestrationNo;
    }

    public Integer getSeatingCapacity() {
        return SeatingCapacity;
    }

    public void setSeatingCapacity(Integer seatingCapacity) {
        SeatingCapacity = seatingCapacity;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }

    public String getVehicleImageUrl() {
        return vehicleImageUrl;
    }

    public void setVehicleImageUrl(String vehicleImageUrl) {
        this.vehicleImageUrl = vehicleImageUrl;
    }

    public List<Booking> getBooking() {
        return booking;
    }

    public void setBooking(List<Booking> booking) {
        this.booking = booking;
    }
}
