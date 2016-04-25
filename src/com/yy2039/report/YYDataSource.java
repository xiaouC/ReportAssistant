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
    }

    public YYDataSource() {
    }

    public List<TaskItem> getAllTasks() {
        List<TaskItem> ret_task_list = new ArrayList<TaskItem>();

        ret_task_list.add( new TaskItem() {
            public String getDispatchTime() {
                return "2016-04-24 19:45:50";
            }
            public String getTaskTitle() {
                return "马尾-废气检测";
            }
            public String getDispatchName() {
                return "无名";
            }
        });

        ret_task_list.add( new TaskItem() {
            public String getDispatchTime() {
                return "2016-04-24 19:45:50";
            }
            public String getTaskTitle() {
                return "督军-排废检测";
            }
            public String getDispatchName() {
                return "无名";
            }
        });

        ret_task_list.add( new TaskItem() {
            public String getDispatchTime() {
                return "2016-04-24 19:45:50";
            }
            public String getTaskTitle() {
                return "贵阳-噪声检测";
            }
            public String getDispatchName() {
                return "无名";
            }
        });

        ret_task_list.add( new TaskItem() {
            public String getDispatchTime() {
                return "2016-04-24 19:45:50";
            }
            public String getTaskTitle() {
                return "凯里-水质检测";
            }
            public String getDispatchName() {
                return "无名";
            }
        });

        return ret_task_list;
    }
}
