package com.hoodwink.hoodwinkbrewery.services;

import com.hoodwink.hoodwinkbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerByID(UUID id) {
        return CustomerDto.builder().id((UUID.randomUUID()))
                .name("Kenny")
                .build();
    }
}
