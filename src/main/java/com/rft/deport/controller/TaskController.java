package com.rft.deport.controller;


import com.rft.deport.entity.TakeMaster;
import com.rft.deport.exception.TaskException;
import com.rft.deport.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.nimbus.State;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class TaskController {

    @Autowired
    TaskService taskService;

    /**
     * 获取所有未完成状态的任务列表
     * @param state
     * @return
     */
    @RequestMapping("/getTaskByState")
    public Map getTask(@RequestParam(value = "state", required = false) String state){
        Map map = new HashMap();
        try {
            List<TakeMaster> allTask = taskService.getAllTask(state);
            map.put("data",allTask);
        } catch (TaskException e) {
            map.put("message", e.getMessage());
        }
        return map;
    }

    @RequestMapping("/addMasterTask")
    public Map addTask(@RequestBody String content) {
        Map map = new HashMap();



        return map;
    }
}
