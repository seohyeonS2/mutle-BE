package com.mutle.mutle.dto;

import com.mutle.mutle.entity.TodayQuest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodayQuestResponse {
    private Long questionId;
    private String questionText;
    private String date;
    private Timestamp questionCreatedAt;
    private Timestamp questionUpdatedAt;

    public static TodayQuestResponse fromEntity(TodayQuest quest) {
        // date를 yyyy-mm-dd 형식으로 세팅
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = (quest.getDate() != null) ? sdf.format(quest.getDate()) : null;

        return TodayQuestResponse.builder()
                .questionId(quest.getQuestionId())
                .questionText(quest.getQuestionText())
                .date(formattedDate)
                .questionCreatedAt(quest.getQuestionCreatedAt())
                .questionUpdatedAt(quest.getQuestionUpdatedAt())
                .build();

    }
}
