package com.android.waveit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.alespero.expandablecardview.ExpandableCardView;
import me.relex.circleindicator.CircleIndicator3;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 mPager;
    private FragmentStateAdapter pagerAdapter;
    private int num_page = 3;
    private CircleIndicator3 mIndicator;

    private ExpandableCardView expandableCardView1;
    private ExpandableCardView expandableCardView2;
    private ExpandableCardView expandableCardView3;

    ImageButton notice;

    ImageButton bhome;
    ImageButton wreal;
    ImageButton wkeep;
    ImageButton wproduct;
    ImageButton wcompany;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //알림
        notice=findViewById(R.id.notice);

        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Notification.class);
                startActivity(intent);
            }
        });

        //카드뷰
        expandableCardView1 = findViewById(R.id.cardview1);
        expandableCardView1.setOnExpandedListener(new ExpandableCardView.OnExpandedListener() {
            @Override
            public void onExpandChanged(View v, boolean isExpanded) {
                if(isExpanded){
                    expandableCardView1.setBackgroundColor(0xEBE0D8);
                    expandableCardView1.setBackgroundResource(R.drawable.round);
                }else{
                    expandableCardView1.setBackgroundColor(0xEBE0D8);
                    expandableCardView1.setBackgroundResource(R.drawable.round);
                }
            }
        });

        expandableCardView2 = findViewById(R.id.cardview2);
        expandableCardView2.setOnExpandedListener(new ExpandableCardView.OnExpandedListener() {
            @Override
            public void onExpandChanged(View v, boolean isExpanded) {
                if(isExpanded){
                    expandableCardView2.setBackgroundColor(0xEBE0D8);
                    expandableCardView2.setBackgroundResource(R.drawable.round);
                }else{
                    expandableCardView2.setBackgroundColor(0xEBE0D8);
                    expandableCardView2.setBackgroundResource(R.drawable.round);
                }
            }
        });

        expandableCardView3 = findViewById(R.id.cardview3);
        expandableCardView3.setOnExpandedListener(new ExpandableCardView.OnExpandedListener() {
            @Override
            public void onExpandChanged(View v, boolean isExpanded) {
                if(isExpanded){
                    expandableCardView3.setBackgroundColor(0xEBE0D8);
                    expandableCardView3.setBackgroundResource(R.drawable.round);
                }else{
                    expandableCardView3.setBackgroundColor(0xEBE0D8);
                    expandableCardView3.setBackgroundResource(R.drawable.round);
                }
            }
        });

        /**
         * 가로 슬라이드 뷰 Fragment
         */

        //ViewPager2
        mPager = findViewById(R.id.viewpager);
        //Adapter
        pagerAdapter = new MyAdapter(this, num_page);
        mPager.setAdapter(pagerAdapter);
        //Indicator
        mIndicator = findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
        mIndicator.createIndicators(num_page,0);
        //ViewPager Setting
        mPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        /**
         * 이 부분 조정하여 처음 시작하는 이미지 설정.
         * 2000장 생성하였으니 현재위치 1002로 설정하여
         * 좌 우로 슬라이딩 할 수 있게 함. 거의 무한대로
         */

        mPager.setCurrentItem(1002); //시작 지점
        mPager.setOffscreenPageLimit(3); //최대 이미지 수

        mPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                if (positionOffsetPixels == 0) {
                    mPager.setCurrentItem(position);
                }
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                mIndicator.animatePageSelected(position%num_page);
            }
        });

        bhome=findViewById(R.id.bhome);
        wreal=findViewById(R.id.wreal);
        wkeep=findViewById(R.id.wkeep);
        wproduct=findViewById(R.id.wproduct);
        wcompany=findViewById(R.id.wcompany);

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        wreal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Information.class);
                startActivity(intent);
            }
        });

        wkeep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Information.class);
                startActivity(intent);
            }
        });

        wproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),StoreMain.class);
                startActivity(intent);
            }
        });

        wcompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),StoreMain.class);
                startActivity(intent);
            }
        });
    }
}