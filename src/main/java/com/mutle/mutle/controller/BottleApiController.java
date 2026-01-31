package com.mutle.mutle.controller;

import com.mutle.mutle.dto.*;
import com.mutle.mutle.service.BottleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/bottles")
@RequiredArgsConstructor
public class BottleApiController {
    private final BottleService bottleService;

    // 유리병 보내기
    @PostMapping
    public ResponseEntity<BottleCreateResponse> createBottle(@RequestBody BottleCreateRequest request) {
        BottleCreateResponse response = bottleService.createBottle(1L, 101L, 1L, request);
        return ResponseEntity.ok(response);
    }

    // 유리병 받기
    @GetMapping("/random")
    public ResponseEntity<BottleRandomResponse> getRandomBottle() {
        BottleRandomResponse response = bottleService.getBottle(1L);
        return ResponseEntity.ok(response);
    }

    // 오늘의 질문 조회
    @GetMapping("/todayQuest")
    public ResponseEntity<Map<String, Object>> getTodayQuest() {
        TodayQuestResponse response = bottleService.getTodayQuest();
        Map<String, Object> result = new HashMap<>();
        result.put("data", response);
        return ResponseEntity.ok(result);
    }

    // 유리병 상세페이지 조회
    @GetMapping("/{bottleId}")
    public ResponseEntity<BottleDetailResponse> getBottleDetail(@PathVariable Long bottleId) {
        BottleDetailResponse response = bottleService.getBottleDetail(bottleId, 1L);
        return ResponseEntity.ok(response);
    }

    // 반응 남기기
    @PostMapping("/{bottleId}/reaction")
    public ResponseEntity<BottleReactionCreateResponse> addReaction(@PathVariable Long bottleId) {
        BottleReactionCreateResponse response = bottleService.addReaction(1L, bottleId);
        return ResponseEntity.ok(response);
    }

    // 반응 조회
    @GetMapping("/{bottleId}/reaction")
    public ResponseEntity<BottleReactionGetResponse> getReactions(@PathVariable Long bottleId) {
        BottleReactionGetResponse response = bottleService.getReactions(bottleId);
        return ResponseEntity.ok(response);
    }

    // 북마크 추가
    @PostMapping("/{bottleId}/bookmark")
    public ResponseEntity<BookmarkCreateResponse> addBookmark(@PathVariable Long bottleId) {
        BookmarkCreateResponse response = bottleService.addBookmark(bottleId, 1L);
        return ResponseEntity.ok(response);
    }

    // 북마크 목록 조회
    @GetMapping("/bookmarks")
    public ResponseEntity<List<BookmarkListResponse>> getBookmarks() {
        List<BookmarkListResponse> response = bottleService.getBookmarks(1L);
        return ResponseEntity.ok(response);
    }
}
