package com.mutle.mutle.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BottleReactionCreateResponse {
    private Long bottleId;
    private int totalCount;
    private Timestamp reactionCreatedAt;
    private Timestamp reactionUpdatedAt;
}
