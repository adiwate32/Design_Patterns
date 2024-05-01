package com.assignment.question;

import com.assignment.question.models.BookingConfirmation;
import com.assignment.question.models.BookingResult;
import com.assignment.question.models.PaymentStatus;
import com.assignment.question.services.*;

import java.time.LocalDate;

public class BookingManager {

    private BookingManagerFacade bookingManagerFacade;

    public BookingManager(AvailabilityService availabilityService, PaymentService paymentService,
                          NotificationService notificationService, LoyaltyService loyaltyService,
                          AccommodationDetailsService accommodationDetailsService) {
        this.bookingManagerFacade = new BookingManagerFacade(availabilityService, paymentService, notificationService, loyaltyService, accommodationDetailsService);
    }

    public BookingResult bookAccommodation(String userId, String accommodationId, LocalDate checkInDate, LocalDate checkOutDate) {
        return bookingManagerFacade.bookAccommodation(userId, accommodationId, checkInDate, checkOutDate);
    }
}