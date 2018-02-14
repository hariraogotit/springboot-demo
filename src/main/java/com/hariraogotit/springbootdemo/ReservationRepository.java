package com.hariraogotit.springbootdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

/**
 * Created by Hari Rao on 12/02/18.
 */
@RepositoryRestResource
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    Collection<Reservation> findByReservationName(@Param("rn") String rn);

}
