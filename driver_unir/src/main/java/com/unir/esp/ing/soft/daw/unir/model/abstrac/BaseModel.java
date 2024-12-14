package com.unir.esp.ing.soft.daw.unir.model.abstrac;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
public class BaseModel {

    @Id
    public UUID uuid = UUID.randomUUID();

    @Column(name = "created_at", updatable = false)
    @CreatedDate
    public LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "last_modified_at", updatable = false)
    @LastModifiedDate
    public LocalDateTime lastModifiedAt = LocalDateTime.now();
}
