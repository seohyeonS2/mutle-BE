package com.mutle.mutle.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "today_quests")
@Builder
public class TodayQuest {
    @Id
    @GeneratedValue
    @Column(name = "question_id")
    private Long questionId;

    @Column(name = "question_text", nullable = false, length = 255)
    private String questionText;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "question_created_at", nullable = false, updatable = false)
    private Timestamp questionCreatedAt = Timestamp.valueOf(LocalDateTime.now());

    @UpdateTimestamp
    @Column(name = "question_updated_at", nullable = false)
    private Timestamp questionUpdatedAt = Timestamp.valueOf(LocalDateTime.now());


}
