package com.todocodeacademy.hotelsservice.model;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {



    private Long idHotel;
    private String name;
    private int stars;
    private Long idCity;


}
