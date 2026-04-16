package org.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String content;

    private Double rating;
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @Column(nullable = false)
    private Date createdAt;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    @LastModifiedDate
    private Date updatedAt;


}
