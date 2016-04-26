package com.yy2039.report;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

public class LoginView extends YYViewBase {
    public String login_name = "";

    public LoginView() {
        view_layout_res_id = R.layout.login;
    }

    public void setView( boolean bIsPush, onViewBackHandler handler ) {
        super.setView( bIsPush, handler );

        EditText pwdText = (EditText)main_activity.findViewById( R.id.password );
        pwdText.setOnKeyListener( new OnKeyListener() {
            @Override  
            public boolean onKey( View view, int keyCode, KeyEvent event ) {
                if( keyCode == KeyEvent.KEYCODE_ENTER ) {
                    InputMethodManager imm = (InputMethodManager)view.getContext().getSystemService( Context.INPUT_METHOD_SERVICE );
                    if( imm.isActive() ) {
                        imm.hideSoftInputFromWindow( view.getApplicationWindowToken(), 0 );
                    }

                    EditText et_user_name = (EditText)main_activity.findViewById( R.id.user_name );
                    login_name = et_user_name.getText().toString();

                    main_activity.task_list_view.setView( true, yy_view_self.getViewBackHandler() );

                    return true;
                }

                return false;
            }
        });
    }
}
