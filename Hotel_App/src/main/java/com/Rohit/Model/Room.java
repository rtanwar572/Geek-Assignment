package com.Rohit.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@AutoConfiguration
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Oyo")
public class Room {
    @Id
    private Integer roomId;
    private Integer roomNum;
    private double roomPrice;
    private Type roomType;
    @Column(name="isAvail")
    private boolean roomAvail;
}
