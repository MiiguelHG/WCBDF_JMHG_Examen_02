package com.upiiz.examenll.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "invoices")
public class InvoiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_id", nullable = false)
    private Long id;

    @Column(name = "invoice_date", nullable = false)
    private Date invoiceDate;

    @Column(name = "customer_id", nullable = false)
    private Long CustomerId;

    @Column(nullable = false)
    private Double amount;
}
