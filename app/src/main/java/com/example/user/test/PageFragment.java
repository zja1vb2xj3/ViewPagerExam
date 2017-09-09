package com.example.user.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by user on 2017-08-31.
 */

public class PageFragment extends Fragment {
    public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";

    public static final PageFragment newInstance(String message){
        PageFragment pageFragment = new PageFragment();
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_MESSAGE, message);
        pageFragment.setArguments(bundle);

        return pageFragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        String message = getArguments().getString(EXTRA_MESSAGE);
        View rootView = inflater.inflate(R.layout.fragment_page, container, false);
        TextView messageTextView = (TextView)rootView.findViewById(R.id.fragmentTextView);
        messageTextView.setText(message);

        return rootView;
    }
}
