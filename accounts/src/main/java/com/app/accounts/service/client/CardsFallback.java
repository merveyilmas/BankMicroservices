package com.app.accounts.service.client;

import com.app.accounts.dto.CardsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class CardsFallback implements CardsFeignClient{

    @Override
    public ResponseEntity<CardsDto> fetchCardDetails(String correlationId, String mobileNumber) {
        //buraya card mikroservisi hata alması durumunda yapmak istediklerini yazabilirsin
        return null;
    }
}
