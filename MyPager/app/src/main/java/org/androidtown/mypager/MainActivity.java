package org.androidtown.mypager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager=(ViewPager) findViewById(R.id.pager);
        MyAdapter myAdapter=new MyAdapter();
        pager.setAdapter(myAdapter);
    }

    public void onButton1Clicked(View v) {
        pager.setCurrentItem(0);
    }
    public void onButton2Clicked(View v) {
        pager.setCurrentItem(1);
    }
    public void onButton3Clicked(View v) {
        pager.setCurrentItem(2);
    }

    class MyAdapter extends PagerAdapter{
        String[] names={"AOA","Twice","4Minute"};

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            LinearLayout linearLayout=new LinearLayout(getApplicationContext());
            linearLayout.setOrientation(LinearLayout.VERTICAL);

            TextView textView=new TextView(getApplicationContext());

            textView.setTextColor(Color.BLACK);
            textView.setText(names[position]);
            textView.setTextSize(40.0f);

            linearLayout.addView(textView);

            container.addView(linearLayout);

            return linearLayout;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view.equals(object);
        }
    }
}
