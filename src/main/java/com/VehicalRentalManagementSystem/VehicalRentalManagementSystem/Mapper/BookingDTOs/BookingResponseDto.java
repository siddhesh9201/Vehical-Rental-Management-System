package com.VehicalRentalManagementSystem.VehicalRentalManagementSystem.Mapper.BookingDTOs;

import com.VehicalRentalManagementSystem.VehicalRentalManagementSystem.Enum.VehicleStatus;
import com.VehicalRentalManagementSystem.VehicalRentalManagementSystem.Model.Client;
import com.VehicalRentalManagementSystem.VehicalRentalManagementSystem.Model.Payment;
import com.VehicalRentalManagementSystem.VehicalRentalManagementSystem.Model.Vehicle;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

public class BookingResponseDto {

    private Long  bookingId;


    private LocalDateTime bookingAt;

    private String model;


    private Date startDate;


    private Date endDate;


    private VehicleStatus status;

    private Double  totalCost;

    private Double latefee;


    private Client client;

    private Vehicle vehicle;


    private Payment payment;
}
