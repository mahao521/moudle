package com.moudle.moudleproduct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.moudle.router_annotation.Route;
import com.moudle.router_core.DNRouter;

@Route(path = "/main/test")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DNRouter.init(getApplication());
    }

    public void jump(View view) {
        DNRouter.getInstance().build("/moudle3/mahao").withString("a",
                "从Module1").navigation(this);
    }
}
