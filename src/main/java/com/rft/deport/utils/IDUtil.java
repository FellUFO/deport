package com.rft.deport.utils;

import com.alibaba.fastjson.JSON;
import com.rft.deport.entity.DocumentMaster;
import com.rft.deport.entity.DocumentSlave;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class IDUtil {

    public static String getID() {
        return UUID.randomUUID().toString().replace("-","").toUpperCase();
    }

    /**
     * 随机生成两个字符
     * @return
     */
    public static String getChar(){
        String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String tmp = "";
        for(int i = 0; i < 2; i++){
            int rand = (int)(Math.random() * word.length());
            char c = word.charAt(rand);
            if(!tmp.contains(c+"")){
                tmp += c;
            }else{
                i--;
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        System.out.println(getID());
        System.out.println(getID().substring(0,1));
    }


}
