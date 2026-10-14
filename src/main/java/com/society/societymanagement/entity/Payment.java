package com.society.societymanagement.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "Payment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PaymentId;

    private LocalDate paymentDate;

    @ManyToOne
    @JoinColumn(name = "maintenance_id")
    private Maintenance maintenance;


}

