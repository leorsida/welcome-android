package com.tusoapps.welcome.ui;

import com.tusoapps.welcome.config.WelcomeScreenConfig;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by stephentuso on 11/16/15.
 */
public class WelcomeScreenItemList implements OnWelcomeScreenPageChangeListener {

    ArrayList<OnWelcomeScreenPageChangeListener> mItems;

    public WelcomeScreenItemList(OnWelcomeScreenPageChangeListener... items) {
        mItems = new ArrayList<>(Arrays.asList(items));
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        for (OnWelcomeScreenPageChangeListener changeListener : mItems) {
            changeListener.onPageScrolled(position, positionOffset, positionOffsetPixels);
        }
    }

    @Override
    public void onPageSelected(int position) {
        for (OnWelcomeScreenPageChangeListener changeListener : mItems) {
            changeListener.onPageSelected(position);
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        for (OnWelcomeScreenPageChangeListener changeListener : mItems) {
            changeListener.onPageScrollStateChanged(state);
        }
    }

    @Override
    public void setup(WelcomeScreenConfig config) {
        for (OnWelcomeScreenPageChangeListener changeListener : mItems) {
            changeListener.setup(config);
        }
    }
}
