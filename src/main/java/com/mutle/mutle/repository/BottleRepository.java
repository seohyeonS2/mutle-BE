package com.mutle.mutle.repository;

import com.mutle.mutle.entity.Bottle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface BottleRepository extends JpaRepository<Bottle, Long> {
    // 특정 유저의 모든 유리병 조회


    // 랜덤 유리병 조회

}
