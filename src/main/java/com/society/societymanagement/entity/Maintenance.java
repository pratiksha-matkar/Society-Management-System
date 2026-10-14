package com.society.societymanagement.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;


@Entity
@Table(name = "maintenance")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MaintenanceId;

    private Double amount;

    private Double penalty;

    private Double totalAmount;

    private LocalDate dueDate;

    private String status;
}


