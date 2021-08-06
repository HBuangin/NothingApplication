package com.nxzzld.nothingappication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class RichTextToWebView extends LinearLayout {

    private Context mContext;
    private WebView webView;

    public RichTextToWebView(Context context) {
        this(context, null);
    }

    public RichTextToWebView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RichTextToWebView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        this.setOrientation(LinearLayout.VERTICAL);
        initWebView();
    }


    public void loadData(String content) {
        webView.loadData(

                wrapContent(content),
                "text/html; charset=UTF-8",
                "utf-8");
    }

    public void setBackGround(int color) {
        webView.setBackgroundColor(color);
    }

    private String wrapContent(String con) {
        return
                "<html>"
                        + "<head>"
                        + "<meta charset=\"UTF-8\">"
                        + "<meta name = \"viewport\" content =\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0\" >"
                        + "<title></title>"
                        + "<style>"
                        + "img {"
                        + "max-width:100%;"
                        + "height: auto;"
                        + "display: block;"
                        + "}"
                        + "</style>"
                        + "</head>"
                        + "<body>"
                        + con
                        + "</body>"
                        + "</html>";


    }

    private void initWebView() {
        webView = new WebView(mContext);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);

        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setAppCacheEnabled(true);
        settings.setDomStorageEnabled(true);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                RichTextToWebView.this.removeAllViews();
                RichTextToWebView.this.addView(webView);
                postInvalidate();
            }
        });


    }
}
