package com.VehicalRentalManagementSystem.VehicalRentalManagementSystem.Mapper.VehicalDTOs;

import com.VehicalRentalManagementSystem.VehicalRentalManagementSystem.Enum.VehicalType;
import com.VehicalRentalManagementSystem.VehicalRentalManagementSystem.Enum.VehicleStatus;

public class VehicalResponseDto {


    private Long  vehicleId;

    private String vehicalBrand;

    private String model;

    private VehicalType vehicalType;


    private String vehicalRegestrationNo;


    private Integer  SeatingCapacity;

    private Double pricePerDay;

    private VehicleStatus status;

    private String vehicleImageUrl;

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
}
