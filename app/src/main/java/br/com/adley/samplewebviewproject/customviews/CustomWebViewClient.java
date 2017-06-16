package br.com.adley.samplewebviewproject.customviews;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Adley Damaceno on 16/06/2017.
 * Custom web view client.
 * Used to open sites and links in embedded web view.
 */

public class CustomWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        return super.shouldOverrideUrlLoading(view, url);
    }
}
