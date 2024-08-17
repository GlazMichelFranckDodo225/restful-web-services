package com.dgmf.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class ErrorDetails {
    private LocalDate timestamp;
    private String message;
    private String details;
}
