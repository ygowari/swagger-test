package com.example.swagger.Entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking_request")
public class Booking_request {

    @Id
    @Column(name = "request_id", length = 100, nullable = false)
    private String requestId;

    @Column(name = "request_date")
    private LocalDateTime requestDate;

    @Column(name = "title_id")
    private Integer titleId;

    @Column(name = "theatre_id")
    private Integer theatreId;

    @Column(name = "play_week")
    private LocalDate playWeek;

    @Column(name = "play_dates", length = 250)
    private String playDates;

    @Column(name = "booking_status", length = 50)
    private String bookingStatus;
    
    @Column(name = "contract_id")
    private Integer contractID;

    @Column(name = "reject_reason", length = 250)
    private String rejectReason;

    @Column(name = "request_by", length = 250)
    private String requestBy;

    @Column(name = "requester_comments", length = 2500)
    private String requesterComments;
    
    

}
