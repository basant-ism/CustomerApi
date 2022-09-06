package com.customer.Api.dto;


import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {

    private UUID id;
    private String name;
}
