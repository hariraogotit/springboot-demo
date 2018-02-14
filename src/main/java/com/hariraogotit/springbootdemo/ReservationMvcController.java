package com.hariraogotit.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *   1. No view resolver provided :) but spring boot works it out.
 *   2. Navigate localhost:8080/reservationsfrommvc/metrics
 *   3. Navigate localhost:8080/reservationsfrommvc/trace
 *   4. Navigate localhost:8080/reservationsfrommvc/beans
 *   5. Navigate localhost:8080/reservationsfrommvc/dump
 *   6. Navigate localhost:8080/reservationsfrommvc/mappings
 */
@Controller
public class ReservationMvcController {

    @RequestMapping("/reservationsfrommvc")
    String reservations(Model model){
          model.addAttribute("reservations", this.reservationRepository.findAll());
          return "reservations";
    }

    @Autowired
    ReservationRepository reservationRepository;
}
