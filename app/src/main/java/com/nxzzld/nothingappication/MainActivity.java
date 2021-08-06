package com.nxzzld.nothingappication;


import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.nxzzld.nothingappication.base.BaseActivity;
import com.nxzzld.nothingappication.model.news_list.ListDemoActivity;
import com.nxzzld.nothingappication.utils.SeparatedEditText;
import com.nxzzld.nothingappication.utils.ToastUtil;
import com.nxzzld.nothingappication.utils.TransInformation;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {


    @BindView(R.id.tvButton)
    TextView tvButton;
    @BindView(R.id.tvButton1)
    TextView tvButton1;

    @BindView(R.id.tvEt)
    EditText etText;


    @BindView(R.id.tvEt1)
    EditText etText1;


    @BindView(R.id.setCarNum1)
    SeparatedEditText setCarNum1;

    private int[] nums = {1, 4, 3, 2, 5, 8, 9, 7};

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initViews() {
        ButterKnife.bind(this);


        tvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListDemoActivity.start(view.getContext(), "id");
//                Log.d("TAG", "onClick: " + twoSum(nums, 10));
                Log.d("TAG", "onClick: " + reverse(12455));

            }
        });

//        rootView.setCarNum1.transformationMethod = TransInformation()

        etText.setTransformationMethod(new TransInformation());
        etText1.setTransformationMethod(new TransInformation());
        setCarNum1.setTransformationMethod(new TransInformation());


        tvButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                tvButton1.setText("");
//                String s = etText.getText().toString();
//                String s1 = etText1.getText().toString();
//                int resid = Integer.valueOf(s) + Integer.valueOf(s1);
//                tvButton1.setText(resid + "");

                ToastUtil.show("SKKKIKKHFIMEIIE");

            }
        });


    }

    public int[] twoSum(int[] nums, int target) {

        int[] t = new int[2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {

                    t[0] = i;
                    t[1] = j;
                }
            }

        }

        return t;
    }

    public int reverse(int x) {
        if (x >= 0) {
            String s = new StringBuilder(x).reverse().toString();
            return Integer.valueOf(s).intValue();


        } else {
            String t = new StringBuilder(Math.abs(x)).reverse().toString();
            int i = Integer.valueOf(t).intValue();
            return -i;

        }


    }

}