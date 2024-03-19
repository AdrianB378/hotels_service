package com.todocodeacademy.hotelsservice.controller;

import com.todocodeacademy.hotelsservice.model.Hotel;
import com.todocodeacademy.hotelsservice.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private IHotelService hotelServ;

    @GetMapping("/{idCity}")
    public List<Hotel> getHotelsByCityId(@PathVariable Long idCity) {
        return hotelServ.getHotelsByCityId(idCity);
    }

}
