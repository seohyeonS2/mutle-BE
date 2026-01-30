package com.mutle.mutle.repository;

import com.mutle.mutle.entity.TodayQuest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TodayQuestRepository extends JpaRepository<TodayQuest, Long> {
    Optional<TodayQuest> findByQuestionId(Long questionId);
}
