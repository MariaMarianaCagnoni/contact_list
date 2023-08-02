package com.example.agenda.domain;

import java.time.LocalDateTime;

/**
 * @author mariana
 * @Project: agenda
 */
public interface BaseModel <T>{
    T safeUpdateInfo(T entity);


    void setCreatedAt(LocalDateTime createdAt);

}
