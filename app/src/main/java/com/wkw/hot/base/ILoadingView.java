package com.wkw.hot.base;

import android.view.View;

/**
 * Created by wukewei on 16/6/1.
 */
public interface ILoadingView extends IView {
    void showLoading();
    void showContent();
    void showNotdata();
    void showError(String msg);
}
