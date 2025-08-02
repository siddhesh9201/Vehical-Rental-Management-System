package com.VehicalRentalManagementSystem.VehicalRentalManagementSystem.Mapper.BookingDTOs;

import com.VehicalRentalManagementSystem.VehicalRentalManagementSystem.Enum.VehicleStatus;
import com.VehicalRentalManagementSystem.VehicalRentalManagementSystem.Model.Client;
import com.VehicalRentalManagementSystem.VehicalRentalManagementSystem.Model.Payment;
import com.VehicalRentalManagementSystem.VehicalRentalManagementSystem.Model.Vehicle;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

public class BookingRequestDto {


    private Long  bookingId;


    private LocalDateTime bookingAt;


    private String model;

    @Column(nullable = false)
    private Date startDate;

    @Column(nullable = false)
    private Date endDate;

    @Column (nullable = false)
    private VehicleStatus status;

    private Double  totalCost;

    private Double latefee;

}
