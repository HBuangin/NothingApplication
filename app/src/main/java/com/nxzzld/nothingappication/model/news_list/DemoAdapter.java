package com.nxzzld.nothingappication.model.news_list;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.nxzzld.nothingappication.R;
import com.nxzzld.nothingappication.common.Constant;
import com.nxzzld.nothingappication.net.api.entity.NewsDataEntity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

class DemoAdapter extends BaseQuickAdapter<NewsDataEntity, BaseViewHolder> implements LoadMoreModule {

    public DemoAdapter(@Nullable List<NewsDataEntity> data) {
        super(R.layout.item_news_notice, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, NewsDataEntity entity) {
        baseViewHolder.setText(R.id.tv_news_item, entity.getTitle());
        ImageView view = baseViewHolder.getView(R.id.iv_task_face);


        Glide.with(getContext())
                .asBitmap()
                .load(Constant.BASE_URL + entity.getCoverImage())
                .into(view);

    }
}
