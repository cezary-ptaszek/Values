package com.simple.program.repository;

import com.simple.program.bean.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValueRepo extends JpaRepository<Value,Long> {

}
