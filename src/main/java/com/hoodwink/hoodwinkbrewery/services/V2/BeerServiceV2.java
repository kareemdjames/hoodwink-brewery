package com.hoodwink.hoodwinkbrewery.services.V2;

import com.hoodwink.hoodwinkbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface BeerServiceV2 {

    BeerDto getBeerByID(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deletebyId(UUID beerId);
}
