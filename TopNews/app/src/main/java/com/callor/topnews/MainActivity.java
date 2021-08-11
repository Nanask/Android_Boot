package com.callor.topnews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.callor.topnews.databinding.ActivityMainBinding;
import com.callor.topnews.service.NaverService;
import com.callor.topnews.service.impl.NaverNewsServiceImplV1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    /**
     * activity.xml 파일에 선언된 view Component를
     * 사용할 때 findByViewId를 사용하지 않고
     * 접근할 수 있도록 선언된 경우
     *      buildFeatures {
     *
     *      }
     * 자동으로
     * activity_main.xml 파일이름을 확장하여
     * ActivityMainBinding이라는 클래스가 생성된다.
     */


    ActivityMainBinding main_binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * 기존에 사용하던
         * setContentView(R.layout.activity_main);을
         *
         * main_binding = ActivityMainBinding.inflate(getLayoutInflater());
         * setContentView(main_binding.getRoot());
         * 코드로 변경
         *
         * 이 코드로 시작이 되면 activity.xml 파일에 있는
         * 모든 view Component가 한꺼번에 사용가능한 상태로 변경된다.
         */


        main_binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(main_binding.getRoot());
//        setContentView(R.layout.activity_main);

        // 오늘날짜에 맞춰 데이터 보여주기
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        String curDate = sd.format(date);

        NaverService naverService = new NaverNewsServiceImplV1(main_binding.newsListView);
        naverService.getNews("2021-08-11");
    }
}