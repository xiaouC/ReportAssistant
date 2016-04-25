package com.yy2039.report;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class YYDataSource {
    public interface TaskItem {
        String getDispatchTime();
        String getTaskTitle();
        String getDispatchName();
        List<TaskSubItem> getSubItems();
    }

    protected List<TaskItem> all_tasks = null;

    public YYDataSource() {
    }

    public List<TaskItem> getAllTasks() {
        if( all_tasks == null ) {
            all_tasks = new ArrayList<TaskItem>();

            all_tasks.add( new TaskItem() {
                public String getDispatchTime() {
                    return "2016-04-24 19:45:50";
                }
                public String getTaskTitle() {
                    return "马尾-环境空气检测";
                }
                public String getDispatchName() {
                    return "无名";
                }
                public List<TaskSubItem> getSubItems() {
                    List<TaskSubItem> ret_sub_items = new ArrayList<TaskSubItem>();

                    ret_sub_items.add( new TaskSubItem( "二氧化硫", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "氮氧化物(二氧化氮)", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "臭氧", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "氟化物", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "氨", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "氰化氢", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "五氧化二磷", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "硫化氢", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "氯气", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "氯化氢", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "总悬浮颗粒物", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "PM10", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "铅", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "砷", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "硒", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "铬(六价)", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "铍", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "铁", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "铜", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "锌", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "镉", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "铬", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "锰", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "镍", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "锡", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "铬酸雾", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "硫酸雾", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "苯酚", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "苯胺", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "甲醛", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "一氧化碳", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "非甲烷总烃", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "甲烷", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "苯", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "甲苯", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "二甲苯", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "乙苯", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "苯乙烯", "0" ) );

                    return ret_sub_items;
                }
            });

            all_tasks.add( new TaskItem() {
                public String getDispatchTime() {
                    return "2016-04-24 19:45:50";
                }
                public String getTaskTitle() {
                    return "督军-排废检测";
                }
                public String getDispatchName() {
                    return "无名";
                }
                public List<TaskSubItem> getSubItems() {
                    List<TaskSubItem> ret_sub_items = new ArrayList<TaskSubItem>();

                    ret_sub_items.add( new TaskSubItem( "二氧化硫", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "氮氧化物(二氧化氮)", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "臭氧", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "氟化物", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "氨", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "氰化氢", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "五氧化二磷", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "硫化氢", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "氯气", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "氯化氢", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "总悬浮颗粒物", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "PM10", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "铅", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "砷", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "硒", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "铬(六价)", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "铍", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "铁", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "铜", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "锌", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "镉", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "铬", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "锰", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "镍", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "锡", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "铬酸雾", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "硫酸雾", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "苯酚", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "苯胺", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "甲醛", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "一氧化碳", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "非甲烷总烃", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "甲烷", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "苯", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "甲苯", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "二甲苯", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "乙苯", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "苯乙烯", "0" ) );

                    return ret_sub_items;
                }
            });

            all_tasks.add( new TaskItem() {
                public String getDispatchTime() {
                    return "2016-04-24 19:45:50";
                }
                public String getTaskTitle() {
                    return "贵阳-噪声检测";
                }
                public String getDispatchName() {
                    return "无名";
                }
                public List<TaskSubItem> getSubItems() {
                    List<TaskSubItem> ret_sub_items = new ArrayList<TaskSubItem>();

                    ret_sub_items.add( new TaskSubItem( "环境噪声", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "工业企业厂界噪声", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "建筑施工场界噪声", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "交通噪声", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "铁路边界噪声", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "社会生活环境噪声", "0" ) );

                    return ret_sub_items;
                }
            });

            all_tasks.add( new TaskItem() {
                public String getDispatchTime() {
                    return "2016-04-24 19:45:50";
                }
                public String getTaskTitle() {
                    return "凯里-土壤检测";
                }
                public String getDispatchName() {
                    return "无名";
                }
                public List<TaskSubItem> getSubItems() {
                    List<TaskSubItem> ret_sub_items = new ArrayList<TaskSubItem>();

                    ret_sub_items.add( new TaskSubItem( "水分", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "干物质", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "PH", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "氟化物", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "砷", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "镉", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "铜", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "汞", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "镍", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "铅", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "硒", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "锌", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "铁", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "锰", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "钙", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "镁", "0" ) );
                    ret_sub_items.add( new TaskSubItem( "阳离子交换量", "0" ) );

                    return ret_sub_items;
                }
            });
        }

        return all_tasks;
    }
}
