package com.mutle.mutle.service;


import com.mutle.mutle.repository.FriendShipRepository;
import com.mutle.mutle.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class FriendshipService {

    @Autowired
    private FriendShipRepository friendShipRepository;
    @Autowired
    private UserRepository userRepository;

    // 친구 검색
    public void searchFriend() {}

    // 친구 신청 보내기
    @Transactional
    public void requestFriendship() {}

    // 친구 신청 취소
    @Transactional
    public void cancelFriendRequest() {}

    // 받은 친구 신청 목록 조회
    public void getReceivedRequests() {}

    // 친구 신청 수락/거절
    @Transactional
    public void respondToRequest() {}

    // 친구 목록 조회
    public void getFriends() {}

    // 친구 삭제
    @Transactional
    public void deleteFriendship() {}

}
