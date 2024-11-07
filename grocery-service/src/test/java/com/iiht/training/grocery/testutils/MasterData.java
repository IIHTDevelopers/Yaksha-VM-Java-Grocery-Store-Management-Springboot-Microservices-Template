package com.iiht.training.grocery.testutils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.iiht.training.grocery.dto.GroceryDto;

import java.util.ArrayList;
import java.util.List;

public class MasterData {
    public static GroceryDto getGroceryDto() {
        GroceryDto dto = new GroceryDto();
        dto.setId(1L);
        dto.setName("Test");
        dto.setId(50L);
        dto.setName("Test");
        dto.setQuantity(15);

        return dto;
    }

    public static List<GroceryDto> getGroceryDtoList() {
        List<GroceryDto> dtos = new ArrayList<>();
        GroceryDto dto = new GroceryDto();
        dto.setId(4L);
        dto.setName("Test");
        dtos.add(dto);
        dto = new GroceryDto();
        dto.setId(50L);
        dto.setName("Test");
        dto.setQuantity(25);
        dtos.add(dto);
        return dtos;

    }

    public static String asJsonString(final Object obj) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            final String jsonContent = mapper.writeValueAsString(obj);

            return jsonContent;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
