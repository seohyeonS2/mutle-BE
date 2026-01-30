package com.mutle.mutle.repository;

import com.mutle.mutle.entity.Bottle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface BottleRepository extends JpaRepository<Bottle, Long> {

}
