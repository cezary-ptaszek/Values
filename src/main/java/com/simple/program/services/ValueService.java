package com.simple.program.services;

import com.simple.program.bean.Value;
import com.simple.program.repository.ValueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValueService implements IValueService {

    @Autowired
    private ValueRepo repo;

    @Override
    public List<Value> findAll(){

        List<Value> values = repo.findAll();
        return values;
    }
}
