/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author n0211301
 */
public class Reservation {
    private int reservationId;
    private LocalDate reservationDate;
    private int memberId;
    private int instructorId;

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.reservationId;
        hash = 17 * hash + Objects.hashCode(this.reservationDate);
        hash = 17 * hash + this.memberId;
        hash = 17 * hash + this.instructorId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reservation other = (Reservation) obj;
        if (this.reservationId != other.reservationId) {
            return false;
        }
        if (this.memberId != other.memberId) {
            return false;
        }
        if (this.instructorId != other.instructorId) {
            return false;
        }
        if (!Objects.equals(this.reservationDate, other.reservationDate)) {
            return false;
        }
        return true;
    }
    
    
}
