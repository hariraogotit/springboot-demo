package com.hariraogotit.springbootdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Hari Rao on 12/02/18.
 */

@Entity
public class Reservation {

    Reservation() {

    }

    public Reservation(String reservationName) {
        this.reservationName = reservationName;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "Id=" + Id +
                ", reservationName='" + reservationName + '\'' +
                '}';
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getReservationName() {
        return reservationName;
    }

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }

    @Id
    @GeneratedValue
    private Long Id;
    private String reservationName;


}
