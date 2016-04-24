package com.yy2039.report;

import android.app.Activity;
import android.os.Bundle;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

public class ReportAssistantActivity extends Activity
{
    public static ReportAssistantActivity main_activity;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        main_activity = this;

        setContentView(R.layout.main);

        EditText pwdText = (EditText)findViewById( R.id.password );
        pwdText.setOnKeyListener( new OnKeyListener() {
            @Override  
            public boolean onKey( View view, int keyCode, KeyEvent event ) {
                if( keyCode == KeyEvent.KEYCODE_ENTER ) {
                    InputMethodManager imm = (InputMethodManager)view.getContext().getSystemService( Context.INPUT_METHOD_SERVICE );
                    if( imm.isActive() ) {
                        imm.hideSoftInputFromWindow( view.getApplicationWindowToken(), 0 );
                    }

                    Toast.makeText( main_activity, "play announce message failed", Toast.LENGTH_LONG ).show();

                    return true;
                }

                return false;
            }
        });
    }
}
