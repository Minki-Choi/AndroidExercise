package org.androidtown.myfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by MK on 2016-06-20.
 */
public class Fragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView= (ViewGroup) inflater.inflate(R.layout.fragment1,container,false);

        Button button1=(Button) rootView.findViewById(R.id.button);
        button1.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity activity=(MainActivity) getActivity();
                activity.onFragmentChange(2);
            }
        });
        return rootView;
    }
}
