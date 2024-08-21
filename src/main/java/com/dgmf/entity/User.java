package com.dgmf.entity;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data  @NoArgsConstructor @AllArgsConstructor @Builder
public class User {
    private Integer id;
    @Size(min = 2)
    private String name;
    @Past
    private LocalDate birthDate;
}
