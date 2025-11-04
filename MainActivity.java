package com.iot.android_minst;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Classifier classifier;

    private final View.OnTouchListener touchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                ImageView imageView = (ImageView) view;

                BitmapDrawable drawable = (BitmapDrawable) imageView.getDrawable();
                Bitmap bitmap = drawable.getBitmap();

                // 이미지 분류 수행
                Pair<Integer, Float> result = classifier.classify(bitmap);

                // 예측 결과 표시
                String output = String.format(Locale.ENGLISH, "예측 결과: %d (%.1f%%)",
                        result.first, result.second * 100);
                textView.setText(output);

                return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        ImageView imageView1 = findViewById(R.id.imageView1);
        ImageView imageView2 = findViewById(R.id.imageView2);

        imageView1.setOnTouchListener(touchListener);
        imageView2.setOnTouchListener(touchListener);

        classifier = new Classifier(this);
        try {
            classifier.init();
        } catch (IOException e) {
            Log.e("Classifier", "모델 초기화 실패", e);
        }
    }

    @Override
    protected void onDestroy() {
        classifier.finish();
        super.onDestroy();
    }
}
