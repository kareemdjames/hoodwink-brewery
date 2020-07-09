package com.hoodwink.hoodwinkbrewery.services.V2;

import com.hoodwink.hoodwinkbrewery.services.BeerService;
import com.hoodwink.hoodwinkbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2ImplV2 implements BeerServiceV2 {
    @Override
    public BeerDto getBeerByID(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();

    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        log.debug("Updating...");

    }

    @Override
    public void deletebyId(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}
