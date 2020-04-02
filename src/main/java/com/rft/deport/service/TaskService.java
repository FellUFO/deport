package com.rft.deport.service;

import com.rft.deport.entity.TakeMaster;
import com.rft.deport.entity.TakeSlave;

import java.util.List;

public interface TaskService {


    List<TakeMaster> getAllTask(int state);

    List<TakeSlave> selectTaskMessageByID(String taskId);
}
