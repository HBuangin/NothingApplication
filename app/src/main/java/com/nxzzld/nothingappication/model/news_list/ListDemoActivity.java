package com.nxzzld.nothingappication.model.news_list;


import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import com.chad.library.adapter.base.loadmore.SimpleLoadMoreView;
import com.nxzzld.nothingappication.R;
import com.nxzzld.nothingappication.base.MyBaseActivity;
import com.nxzzld.nothingappication.base.PagerUIModel;
import com.nxzzld.nothingappication.model.news_detail.NewsDetailActivity;
import com.nxzzld.nothingappication.net.api.entity.NewsDataEntity;
import com.nxzzld.nothingappication.utils.ToastUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class ListDemoActivity extends MyBaseActivity {

    @BindView(R.id.refreshLayout)
    SwipeRefreshLayout refreshLayout;

    @BindView(R.id.iv_top_back)
    ImageView topBack;
    @BindView(R.id.x_recycler_view)
    RecyclerView xRecyclerView;

    private String mId = "1245892677274234882";
    private DemoAdapter adapter;
    private List<NewsDataEntity> recordsBeans = new ArrayList<>();
    private ListDemoModel noticeModel;


    public static void start(Context context, String id) {
        Intent intent = new Intent(context, ListDemoActivity.class);
        intent.putExtra("id", id);
        context.startActivity(intent);
    }

    @Override
    protected int layout() {
        return R.layout.activity_list_demo;
    }

    @Override
    protected void init() {

        noticeModel = ViewModelProviders.of(this).get(ListDemoModel.class);

        topBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        noticeModel.error.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                ToastUtil.show(s);

            }
        });
        noticeModel.getUiState().observe(this, new Observer<PagerUIModel<NewsDataEntity>>() {
            @Override
            public void onChanged(PagerUIModel<NewsDataEntity> newsDataEntityPagerUIModel) {
                refreshLayout.setRefreshing(newsDataEntityPagerUIModel.getShowLoading());

                List<NewsDataEntity> data = newsDataEntityPagerUIModel.getShowSuccess();
                if (data != null) {
                    if (newsDataEntityPagerUIModel.isRefresh()) {
                        adapter.replaceData(data);
                    } else {
                        adapter.addData(data);
                    }
                    adapter.getLoadMoreModule().setEnableLoadMore(true);
                    adapter.getLoadMoreModule().loadMoreComplete();
                }

                if (newsDataEntityPagerUIModel.getShowEnd())
                    adapter.getLoadMoreModule().loadMoreEnd();

                if (newsDataEntityPagerUIModel.getShowError() != null) {
                    ToastUtil.show(newsDataEntityPagerUIModel.getShowError());
                }

            }
        });


        initAdapter();
    }

    private void initAdapter() {
        adapter = new DemoAdapter(recordsBeans);
        xRecyclerView.setLayoutManager(new LinearLayoutManager(this));


        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refresh();
            }
        });

        adapter.getLoadMoreModule().setLoadMoreView(new SimpleLoadMoreView());
        adapter.getLoadMoreModule().setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
                loadMore();
            }
        });

        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                NewsDetailActivity.start(view.getContext(), recordsBeans.get(position).getId());
            }
        });
        xRecyclerView.setAdapter(adapter);
        refresh();
    }

    private void refresh() {
        adapter.getLoadMoreModule().setEnableLoadMore(false);
        noticeModel.getNewsList(true, mId);
    }

    private void loadMore() {
        noticeModel.getNewsList(false, mId);
    }


    @Override
    public void onResume() {
        super.onResume();
    }


}