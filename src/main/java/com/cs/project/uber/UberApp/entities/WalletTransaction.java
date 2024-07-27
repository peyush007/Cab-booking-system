package com.cs.project.uber.UberApp.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.cs.project.uber.UberApp.entities.enums.TransactionMethod;
import com.cs.project.uber.UberApp.entities.enums.TransactionType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class WalletTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Double ammount;
	
	private TransactionType transactionType;
	
	private TransactionMethod transactionMethod;
	
	@OneToOne
	private Ride ride;
	
	private String transactionId;
	
	@ManyToOne
	private Wallet wallet;
	
	@CreationTimestamp
	private LocalDateTime timeStamp;
}
