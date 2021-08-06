package com.nxzzld.nothingappication.model.news_detail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.nxzzld.nothingappication.R;
import com.nxzzld.nothingappication.base.MyBaseActivity;
import com.nxzzld.nothingappication.net.api.entity.NewDetailEntity;
import com.nxzzld.nothingappication.utils.ToastUtil;
import com.nxzzld.nothingappication.view.RichTextToWebView;

import java.util.List;

import butterknife.BindView;

public class NewsDetailActivity extends MyBaseActivity {
    //
    private static final String KEY_NEWS_ID = "NEWS_ID";

    @BindView(R.id.iv_top_back)
    ImageView topBack;
    @BindView(R.id.tv_title)
    TextView title;

    @BindView(R.id.richTextView)
    RichTextToWebView textToWebView;


    private NewsDetailModel viewModel;


    private String mId;

    public static void start(Context context, String id) {
        Intent intent = new Intent(context, NewsDetailActivity.class);
        intent.putExtra("id", id);
        context.startActivity(intent);
    }

    @Override
    protected int layout() {
        return R.layout.activity_news_detail;
    }

    @Override
    protected void init() {

        viewModel = ViewModelProviders.of(this).get(NewsDetailModel.class);
        mId = getIntent().getStringExtra("id");
        viewModel.getNewsDetail(mId);
        initObserver();
        topBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }


    private void initObserver() {
        viewModel.error.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                ToastUtil.show(s);
            }
        });


        viewModel.data.observe(this, new Observer<NewDetailEntity>() {
            @Override
            public void onChanged(NewDetailEntity data) {
                textToWebView.loadData(data.getContent());


            }
        });
    }

}