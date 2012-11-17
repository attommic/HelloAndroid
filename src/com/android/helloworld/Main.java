package com.android.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* 
       LinearLayout line = new LinearLayout(this);
        
       TextView ta = new TextView(this);
       TextView tb = new TextView(this);
       TextView tc = new TextView(this);
       TextView td = new TextView(this);
       TextView te = new TextView(this);
       
       
       
       String name = getString(R.string.name);
       String program = getString(R.string.program);
       String course = getString(R.string.course);
       String id = getString(R.string.id);
       String school = getString(R.string.school);
       
       ta.setText(name);
       tb.setText(program);
       tc.setText(course);
       td.setText(id);
       te.setText(school);
       
       line.addView(ta);
       
       //setContentView(ta);
       //setContentView(tb);
       //setContentView(tc);
       //setContentView(te);
       //setContentView(td); */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
