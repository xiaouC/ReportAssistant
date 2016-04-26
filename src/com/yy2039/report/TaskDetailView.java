package com.yy2039.report;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.EditText;

public class TaskDetailView extends YYViewBase {
    public YYDataSource.TaskItem task_item = null;

    public TaskDetailView() {
        view_layout_res_id = R.layout.task_detail;
    }

    public void setView( boolean bIsPush, onViewBackHandler handler ) {
        super.setView( bIsPush, handler );

        TextView tv_login_state = (TextView)main_activity.findViewById( R.id.login_state );
        tv_login_state.setText( main_activity.login_view.login_name );

        TextView tv_task_desc = (TextView)main_activity.findViewById( R.id.task_desc );
        tv_task_desc.setText( task_item.getTaskTitle() + "历时：2天23小时" );

        EditText et_location = (EditText)main_activity.findViewById( R.id.location );
        et_location.setText( "[定位] 经常 OOXX 的地方" );

        fillListView();
    }

    public void fillListView() {
        super.fillListView();

        yy_list_adapter = new YYListAdapter( ReportAssistantActivity.main_activity, R.layout.task_detail_item, getItemListData() );
        ListView lv = (ListView)ReportAssistantActivity.main_activity.findViewById( R.id.item_list );
        lv.setAdapter( yy_list_adapter );
    }

    public List<Map<Integer,YYListAdapter.onYYListItemHandler>> getItemListData() {
        List<Map<Integer,YYListAdapter.onYYListItemHandler>> ret_data = new ArrayList<Map<Integer,YYListAdapter.onYYListItemHandler>>();

        List<TaskSubItem> task_sub_items = task_item.getSubItems();
        for( int i=0; i < task_sub_items.size(); ++i ) {
            final TaskSubItem sub_item = task_sub_items.get( i );

            Map<Integer,YYListAdapter.onYYListItemHandler> map = new HashMap<Integer,YYListAdapter.onYYListItemHandler>();
            map.put( R.id.item_type, new YYListAdapter.onYYListItemHandler() {
                @Override
                public void item_handle( Object view_obj ) {
                    TextView tv_obj = (TextView)view_obj;

                    tv_obj.setText( sub_item.item_key );
                }
            });

            map.put( R.id.item_value, new YYListAdapter.onYYListItemHandler() {
                @Override
                public void item_handle( Object view_obj ) {
                    TextView tv_obj = (TextView)view_obj;

                    tv_obj.setText( sub_item.item_value );
                }
            });

            ret_data.add( map );
        }

        return ret_data;
    }

    public void updateView() {
    }
}
