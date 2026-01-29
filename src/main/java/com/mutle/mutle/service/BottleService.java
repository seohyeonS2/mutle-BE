package com.mutle.mutle.service;

import com.mutle.mutle.entity.Bottle;
import com.mutle.mutle.repository.BookmarkRepository;
import com.mutle.mutle.repository.BottleRepository;
import com.mutle.mutle.repository.ReactionRepository;
import com.mutle.mutle.repository.TodayQuestRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class BottleService {

    @Autowired
    private BottleRepository bottleRepository;
    @Autowired
    private TodayQuestRepository todayQuestRepository;
    @Autowired
    private BookmarkRepository bookmarkRepository;
    @Autowired
    private ReactionRepository reactionRepository;

    // 유리병 보내기
    @Transactional
    public void createBottle() {}

    //유리병 받기
    public void getBottle() {}

    // 유리병 반응 남기기
    @Transactional
    public void addReaction() {}

    //유리병 반응 조회
    public void getReactions() {}

    // 오늘의 질문 조회
    public void getTodayQuest() {}

    // 유리병 상세페이지 조회
    public void getBottleDetail() {}

    // 유리병 북마크 추가
    @Transactional
    public void addBookmark() {}

    // 북마크 목록 조회
    public void getBookmarks() {}
}
