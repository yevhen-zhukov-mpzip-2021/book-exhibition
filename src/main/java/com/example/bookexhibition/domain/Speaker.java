package com.example.bookexhibition.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Speaker {

    private int id;
    private String firstName;
    private String lastName;
}
