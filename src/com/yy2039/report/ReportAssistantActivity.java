package com.yy2039.report;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

public class ReportAssistantActivity extends Activity
{
    public static ReportAssistantActivity main_activity;
    public YYDataSource yy_data_source = null;
    public LoginView login_view = null;
    public TaskListView task_list_view = null;
    public TaskDetailView task_detail_view = null;

    public boolean bIsDestroy = false;
    public YYViewBase yy_current_view = null;
    public YYSchedule yy_schedule = null;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        main_activity = this;

        yy_data_source = new YYDataSource();
        yy_schedule = new YYSchedule( this );
        login_view = new LoginView();
        task_list_view = new TaskListView();
        task_detail_view = new TaskDetailView();

        login_view.setView( false, null );
    }

    public boolean onKeyDown( int keyCode, KeyEvent event )
    {
        if( keyCode == KeyEvent.KEYCODE_BACK )
        {
            YYViewBase.onBackClick();
        }

        return false;
    }

	@Override
	protected void onDestroy()
	{
        bIsDestroy = true;

		super.onDestroy();
	}
}
