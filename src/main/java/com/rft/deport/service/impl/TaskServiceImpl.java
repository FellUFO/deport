package com.rft.deport.service.impl;

import com.rft.deport.dao.TakeMasterMapper;
import com.rft.deport.dao.TakeSlaveMapper;
import com.rft.deport.entity.TakeMaster;
import com.rft.deport.exception.TaskException;
import com.rft.deport.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TakeMasterMapper takeMasterMapper;
    @Autowired
    TakeSlaveMapper takeSlaveMapper;

    @Override
    public List<TakeMaster> getAllTask(String state) {
        List<TakeMaster> takeMasters = takeMasterMapper.selectByState();
        if (takeMasters.isEmpty()) {
            throw new TaskException("根据状态查询任务失败");
        }
        return takeMasters;
    }
}
