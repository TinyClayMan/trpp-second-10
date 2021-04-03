package ru.mirea.trppsecond10.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/** Ответ на healthCheck. */
@AllArgsConstructor
public class HealthResponse {

    /** Статус работы. */
    @Getter
    @Setter
    private String status;
    
}
