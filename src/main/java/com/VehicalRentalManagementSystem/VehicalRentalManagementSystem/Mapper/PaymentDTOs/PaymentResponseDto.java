package com.VehicalRentalManagementSystem.VehicalRentalManagementSystem.Mapper.PaymentDTOs;

import com.VehicalRentalManagementSystem.VehicalRentalManagementSystem.Enum.PaymentStatus;
import com.VehicalRentalManagementSystem.VehicalRentalManagementSystem.Model.Booking;

import java.time.LocalDate;

public class PaymentResponseDto {

    private Long id;

    private Double amountPaid;

    private String paymentMethod;


    private LocalDate paymentDate;

    private PaymentStatus paymentStatus;


    private Booking booking;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
