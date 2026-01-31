package com.mutle.mutle.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BottleReactionGetResponse {
    private Long bottleId;
    private int totalCount;
}
