package com.example.user.test;

/**
 * Created by user on 2017-09-03.
 */

public class Model{
    private int titleId;
    private int layoutId;

    Model(int titleId, int layoutId){
        this.titleId = titleId;
        this.layoutId = layoutId;
    }
    public int getTitleId() {
        return titleId;
    }

    public int getLayoutId() {
        return layoutId;
    }

}
