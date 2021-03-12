package com.zj.tablayoutdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

/**
 * 不可以滑动，但是可以setCurrentItem的ViewPager。
 */
public class CannotScrollViewPager extends ViewPager {


    public CannotScrollViewPager(@NonNull Context context) {
        this(context, null);
    }

    public CannotScrollViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent arg0) {
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent arg0) {
        return false;
    }
}
