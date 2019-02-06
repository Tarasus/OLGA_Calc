package com.example.olgacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvWeight;
    TextView tvSum;
    EditText te0;
    EditText te0_coeff;
    EditText te1;
    EditText te1_coeff;
    EditText te2;
    EditText te2_coeff;
    EditText te3;
    EditText te3_coeff;
    EditText te4;
    EditText te4_coeff;
    EditText te5;
    EditText te5_coeff;
    EditText te6;
    EditText te6_coeff;
    Button btn_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // найдем View-элементы
        tvWeight = findViewById(R.id.total_weight);
        tvSum = findViewById(R.id.total_sum);
        te0 = findViewById(R.id.col_weight0);
        te1 = findViewById(R.id.col_weight1);
        te2 = findViewById(R.id.col_weight2);
        te3 = findViewById(R.id.col_weight3);
        te4 = findViewById(R.id.col_weight4);
        te5 = findViewById(R.id.col_weight5);
        te6 = findViewById(R.id.col_weight6);
        te0_coeff = findViewById(R.id.col_cost0);
        te1_coeff = findViewById(R.id.col_cost1);
        te2_coeff = findViewById(R.id.col_cost2);
        te3_coeff = findViewById(R.id.col_cost3);
        te4_coeff = findViewById(R.id.col_cost4);
        te5_coeff = findViewById(R.id.col_cost5);
        te6_coeff = findViewById(R.id.col_cost6);
        btn_count = findViewById(R.id.count_btn);
        tvWeight.setText(" ");
        tvSum.setText(" ");

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            public void onClick(View v) {

                te0.onEditorAction(EditorInfo.IME_ACTION_DONE);
                te1.onEditorAction(EditorInfo.IME_ACTION_DONE);
                te2.onEditorAction(EditorInfo.IME_ACTION_DONE);
                te3.onEditorAction(EditorInfo.IME_ACTION_DONE);
                te4.onEditorAction(EditorInfo.IME_ACTION_DONE);
                te5.onEditorAction(EditorInfo.IME_ACTION_DONE);
                te6.onEditorAction(EditorInfo.IME_ACTION_DONE);
                te0_coeff.onEditorAction(EditorInfo.IME_ACTION_DONE);
                te1_coeff.onEditorAction(EditorInfo.IME_ACTION_DONE);
                te2_coeff.onEditorAction(EditorInfo.IME_ACTION_DONE);
                te3_coeff.onEditorAction(EditorInfo.IME_ACTION_DONE);
                te4_coeff.onEditorAction(EditorInfo.IME_ACTION_DONE);
                te5_coeff.onEditorAction(EditorInfo.IME_ACTION_DONE);
                te6_coeff.onEditorAction(EditorInfo.IME_ACTION_DONE);


                String str0 = te0.getText().toString();
                String str1 = te1.getText().toString();
                String str2 = te2.getText().toString();
                String str3 = te3.getText().toString();
                String str4 = te4.getText().toString();
                String str5 = te5.getText().toString();
                String str6 = te6.getText().toString();

                str0 = str0.replace(",", ".");
                str1 = str1.replace(",", ".");
                str2 = str2.replace(",", ".");
                str3 = str3.replace(",", ".");
                str4 = str4.replace(",", ".");
                str5 = str5.replace(",", ".");
                str6 = str6.replace(",", ".");

                float m0 = 0;
                float m1 = 0;
                float m2 = 0;
                float m3 = 0;
                float m4 = 0;
                float m5 = 0;
                float m6 = 0;
                if (!str0.isEmpty()) {
                    m0 = Float.parseFloat(str0);
                }
                if (!str1.isEmpty()) {
                    m1 = Float.parseFloat(str1);
                }
                if (!str2.isEmpty()) {
                    m2 = Float.parseFloat(str2);
                }
                if (!str3.isEmpty()) {
                    m3 = Float.parseFloat(str3);
                }
                if (!str4.isEmpty()) {
                    m4 = Float.parseFloat(str4);
                }
                if (!str5.isEmpty()) {
                    m5 = Float.parseFloat(str5);
                }
                if (!str6.isEmpty()) {
                    m6 = Float.parseFloat(str6);
                }

                String str_coeff_0 = te0_coeff.getText().toString();
                String str_coeff_1 = te1_coeff.getText().toString();
                String str_coeff_2 = te2_coeff.getText().toString();
                String str_coeff_3 = te3_coeff.getText().toString();
                String str_coeff_4 = te4_coeff.getText().toString();
                String str_coeff_5 = te5_coeff.getText().toString();
                String str_coeff_6 = te6_coeff.getText().toString();

                str_coeff_0 = str_coeff_0.replace(",", ".");
                str_coeff_1 = str_coeff_1.replace(",", ".");
                str_coeff_2 = str_coeff_2.replace(",", ".");
                str_coeff_3 = str_coeff_3.replace(",", ".");
                str_coeff_4 = str_coeff_4.replace(",", ".");
                str_coeff_5 = str_coeff_5.replace(",", ".");
                str_coeff_6 = str_coeff_6.replace(",", ".");

                float coeff0 = 0;
                float coeff1 = 0;
                float coeff2 = 0;
                float coeff3 = 0;
                float coeff4 = 0;
                float coeff5 = 0;
                float coeff6 = 0;

                if (!str_coeff_0.isEmpty()) {
                    coeff0 = Float.parseFloat(str_coeff_0);
                }
                if (!str_coeff_1.isEmpty()) {
                    coeff1 = Float.parseFloat(str_coeff_1);
                }
                if (!str_coeff_2.isEmpty()) {
                    coeff2 = Float.parseFloat(str_coeff_2);
                }
                if (!str_coeff_3.isEmpty()) {
                    coeff3 = Float.parseFloat(str_coeff_3);
                }
                if (!str_coeff_4.isEmpty()) {
                    coeff4 = Float.parseFloat(str_coeff_4);
                }
                if (!str_coeff_5.isEmpty()) {
                    coeff5 = Float.parseFloat(str_coeff_5);
                }
                if (!str_coeff_6.isEmpty()) {
                    coeff6 = Float.parseFloat(str_coeff_6);
                }


                float totalsum = 0;
                totalsum += m0 * coeff0;
                totalsum += m1 * coeff1;
                totalsum += m2 * coeff2;
                totalsum += m3 * coeff3;
                totalsum += m4 * coeff4;
                totalsum += m5 * coeff5;
                totalsum += m6 * coeff6;

                float totalmass = 0;
                totalmass += m0;
                totalmass += m1;
                totalmass += m2;
                totalmass += m3;
                totalmass += m4;
                totalmass += m5;
                totalmass += m6;

                if (totalmass > 0) {
                    tvWeight.setText(Float.toString(totalmass));
                    tvWeight.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

                    if (totalsum > 0) {
                        tvSum.setText(Float.toString(totalsum));
                        tvSum.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    } else {
                        tvSum.setText("Какая-то ошибка!");
                        tvSum.setTextColor(getResources().getColor(R.color.colorRed));
                        tvWeight.setText("0");
                        tvWeight.setTextColor(getResources().getColor(R.color.colorRed));

                    }
                } else {
                    tvWeight.setText("Оля, впиши массу!");
                    tvWeight.setTextColor(getResources().getColor(R.color.colorGreen));
                    tvSum.setText("0");
                    tvSum.setTextColor(getResources().getColor(R.color.colorRed));

                }
            }
        };

        btn_count.setOnClickListener(oclBtnOk);
    }
}
