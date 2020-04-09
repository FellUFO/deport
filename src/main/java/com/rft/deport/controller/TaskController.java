package com.rft.deport.controller;


import com.rft.deport.dto.TakesUnit;
import com.rft.deport.entity.TakeMaster;
import com.rft.deport.entity.TakeSlave;
import com.rft.deport.exception.TaskException;
import com.rft.deport.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
//        TakesUnit unit = new TakesUnit();
        Map map = new HashMap();
        try {
            //查询主任务
            List<TakeMaster> allTask = taskService.getAllTask(Integer.valueOf(state));
            System.out.println(allTask.size());
            //根据主任务id来查询所有副任务
            for (TakeMaster takeMaster : allTask) {
                System.out.println(takeMaster.getTaskId());
                List<TakeSlave> slaves = taskService.selectTaskMessageByID(takeMaster.getTaskId());
                takeMaster.setSlaves(slaves);
            }
//            unit.setList(allTask);
            map.put("list",allTask);
        } catch (TaskException e) {
//            unit.setMessages(e.getMessage());
            map.put("message",e.getMessage());
        }
//        return unit;
        return map;
    }

    @RequestMapping("/addMasterTask")
    public Map addTask(@RequestBody String content) {
        Map map = new HashMap();



        return map;
    }
}
