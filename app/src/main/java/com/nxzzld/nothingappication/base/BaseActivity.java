package com.nxzzld.nothingappication.base;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.nxzzld.nothingappication.R;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;


public abstract class BaseActivity extends AppCompatActivity {
    /*
     * activity的容器集合
     * */
    private static List<WeakReference<Activity>> actList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//竖屏

        super.onCreate(savedInstanceState);
        // 如果当前不是竖向就切换成竖向

        Log.i("WANT", this.getClass().getName());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {//因为不是所有的系统都可以设置颜色的，在4.4以下就不可以。。有的说4.1，所以在设置的时候要检查一下系统版本是否是4.1以上
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.common_status_bar));
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);//实现状态栏图标和文字颜色为暗色
        }

        beforeView();
        setContentView(getLayout());
        ButterKnife.bind(this);
        initViews();
    }

    public String getBarTitle() {
        return "";
    }

    public void activityResult(int requestCode, Intent Data) {
    }

    public abstract int getLayout();

    public abstract void initViews();

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            activityResult(requestCode, data);
        }
    }

    public void toast(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }

    public void beforeView() {

    }

    //添加传入的界面
    public void addActivity(Activity activity) {
        if (actList == null) {
            actList = new ArrayList<>();
        }
        actList.add(new WeakReference<>(activity));
    }

    //当页面finish的时候，从集合中移除
    public void removeActivity(Activity activity) {
        actList.remove(new WeakReference<>(activity));
    }


    //调用此方法把说有的activity全部清除
    public void exitApplication() throws IllegalArgumentException {
        /*if (actList == null) {
            throw new IllegalArgumentException("存储activity的集合为空异常！");
        }
        for (WeakReference<Activity> reference : actList) {
            if (reference.get() != null) {
                reference.get().finish();
            }
        }*/
    }
}
