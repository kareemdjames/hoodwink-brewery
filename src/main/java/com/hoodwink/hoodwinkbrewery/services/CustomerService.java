package com.hoodwink.hoodwinkbrewery.services;

import com.hoodwink.hoodwinkbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface CustomerService {

    CustomerDto getCustomerByID(UUID id);
}
