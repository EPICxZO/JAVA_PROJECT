package com.lab.Project_JAVA;

import org.hibernate.annotations.Check;

import jakarta.persistence.*;

@Entity
@Check(constraints = "qty > 0")
@Check(constraints = "unitCost > 0")
@Table
public class PurchaseDetail {

    @Id
    @Column(name = "purchaseDetailID", length = 4)
    private int purchaseDetailID;

    @ManyToOne
    @JoinColumn(name = "purchaseID", nullable = false)
    private Purchase purchase;

    @ManyToOne
    @JoinColumn(name = "partID", nullable = false)
    private SparePart sparePart;

    @Column(name = "qty", length = 5, nullable = false)
    private int qty;

    @Column(name = "unitCost", length = 10, nullable = false)
    private double unitCost;

}
