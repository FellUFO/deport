package com.rft.deport.utils;

import com.rft.deport.entity.Location;
import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.List;

public class LocationUtil {


    public static List<Location> getLocation(int a, int b, int c, int d) {
        StringBuffer sb =new StringBuffer();
        int ch = 64;
        List<String> locations = new ArrayList<>();
        List<Location> arrayList = new ArrayList<>();
        for (int i =0 ;i<a; i++) {
            ch+=1;
            for (int w =1; w<=b; w++) {
                for (int e=1; e<=c; e++) {
                    for (int r=1; r<=d; r++) {
                        char x = (char) ch;
                        sb.append(x).append(w).append(e).append(r).append(" ");
                        locations.add(sb.toString());
                    }
                }
            }
        }
        String[] split = locations.get(locations.size() - 1).split(" ");
        for (String s : split) {
           Location location =  new Location();
           location.setLocationNumber(s);
           arrayList.add(location);
        }
        return arrayList;
    }

//    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
//        List<String> location = getLocation(4, 10, 2, 2);
//        System.out.println(location.size());
//        System.out.println(location.get(location.size()-1));
//        String[] split = location.get(location.size() - 1).split(" ");
//        for (String s : split) {
//            arrayList.add(s);
//        }
//        System.out.println(arrayList.size() == location.size());
//    }
}
