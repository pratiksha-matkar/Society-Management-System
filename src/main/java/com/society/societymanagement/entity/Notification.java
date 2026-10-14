package com.society.societymanagement.entity;

import jakarta.persistence.*;
import lombok.*;

public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificationId;

    private String email;

    private String message;
}


