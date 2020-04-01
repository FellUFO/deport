package com.rft.deport.service;

import com.rft.deport.entity.TakeMaster;

import java.util.List;

public interface TaskService {


    List<TakeMaster> getAllTask(String state);
}
