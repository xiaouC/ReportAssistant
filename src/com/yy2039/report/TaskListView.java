package com.yy2039.report;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import android.widget.TextView;
import android.widget.ListView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class TaskListView {
    protected YYListAdapter yy_list_adapter = null;

    public TaskListView() {
    }

    public void setView() {
        ReportAssistantActivity.main_activity.setContentView( R.layout.task_list );

        fillListView();
    }

    public void fillListView() {
        yy_list_adapter = new YYListAdapter( ReportAssistantActivity.main_activity, R.layout.task_list_item, getItemListData() );
        ListView lv = (ListView)ReportAssistantActivity.main_activity.findViewById( R.id.item_list );
        lv.setAdapter( yy_list_adapter );

        lv.setOnItemClickListener( new OnItemClickListener() {
            public void onItemClick( AdapterView<?> arg0, View arg1, int arg2, long arg3 ) {
                // TODO Auto-generated method stub
                if( arg2 != 0 ) {
                    List<YYDataSource.TaskItem> task_list = ReportAssistantActivity.main_activity.yy_data_source.getAllTasks();

                    ReportAssistantActivity.main_activity.task_detail_view.task_item = task_list.get( arg2 );
                    ReportAssistantActivity.main_activity.task_detail_view.setView();
                }
            }
        });
    }

    public List<Map<Integer,YYListAdapter.onYYListItemHandler>> getItemListData() {
        List<Map<Integer,YYListAdapter.onYYListItemHandler>> ret_data = new ArrayList<Map<Integer,YYListAdapter.onYYListItemHandler>>();

        List<YYDataSource.TaskItem> task_list = ReportAssistantActivity.main_activity.yy_data_source.getAllTasks();
        for( int i=0; i < task_list.size(); ++i ) {
            final YYDataSource.TaskItem ti = task_list.get( i );

            Map<Integer,YYListAdapter.onYYListItemHandler> map = new HashMap<Integer,YYListAdapter.onYYListItemHandler>();
            map.put( R.id.dispatch_time, new YYListAdapter.onYYListItemHandler() {
                @Override
                public void item_handle( Object view_obj ) {
                    TextView tv_obj = (TextView)view_obj;

                    tv_obj.setText( ti.getDispatchTime() );
                }
            });

            map.put( R.id.title, new YYListAdapter.onYYListItemHandler() {
                @Override
                public void item_handle( Object view_obj ) {
                    TextView tv_obj = (TextView)view_obj;

                    tv_obj.setText( ti.getTaskTitle() );
                }
            });

            map.put( R.id.name, new YYListAdapter.onYYListItemHandler() {
                @Override
                public void item_handle( Object view_obj ) {
                    TextView tv_obj = (TextView)view_obj;

                    tv_obj.setText( ti.getDispatchName() );
                }
            });

            ret_data.add( map );
        }

        return ret_data;
    }

    public void updateView() {
    }

}