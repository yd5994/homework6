package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4;
    ImageView imageView,imageView2,imageView3;
    TextView txt1,txt2,txt3,txt4,txt5,txt6;
    EditText editText,editText2,editText3;
    public static Random rn = new Random();
    public int num;
    public int num1;
    public int num2;
    public int num3;
    public int num4;
    public int num5;
    public int sum;
    public int sum2;
    public int sum3;
    public int sumA=0;
    public int Percent=100;
    public int NPercent = 100/3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1= findViewById(R.id.textView1);
        txt2= findViewById(R.id.textView2);
        txt3= findViewById(R.id.textView3);
        txt4= findViewById(R.id.textView4);
        txt5= findViewById(R.id.textView5);
        txt6= findViewById(R.id.textView6);
        //
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        //
        imageView=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);
        imageView3=findViewById(R.id.imageView3);
        //
        editText = findViewById(R.id.editTextNumberPassword5);
        editText2 = findViewById(R.id.editTextNumberPassword6);
        editText3 = findViewById(R.id.editTextNumberPassword7);
        //

        num=rn.nextInt(89)+10;
        num1=rn.nextInt(89)+10;
        num2=rn.nextInt(89)+10;
        num3=rn.nextInt(89)+10;
        num4=rn.nextInt(89)+10;
        num5=rn.nextInt(89)+10;
        sum=num+num3;//0.0&&1.0
        sum2 = num1+num4;//0.1&&1.1
        sum3= num2+num5;//0.2&&1.2

        txt1.setText(Integer.toString(num));//0.0

        txt2.setText(Integer.toString(num1));//0.1

        txt3.setText(Integer.toString(num2));//0.2
        //

        txt4.setText(Integer.toString(num3));//1.0



        txt5.setText(Integer.toString(num4));//1.1



        txt6.setText(Integer.toString(num5));//1.2


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumA=0;
                Percent=100;
                int input1 = Integer.parseInt(editText.getText().toString());
                if(sum==input1){
                    imageView.setImageResource(R.drawable.like);
                    sumA++;
                }
                else{
                    imageView.setImageResource(R.drawable.unlike);
                    Percent-=NPercent;
                }
                txt1.setText("sof:");
                txt4.setText(Integer.toString(sum));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int input2 = Integer.parseInt(editText2.getText().toString());
                if(sum2==input2){
                    imageView2.setImageResource(R.drawable.like);
                    sumA++;
                }
                else{
                    imageView2.setImageResource(R.drawable.unlike);
                    Percent-=NPercent;
                }

                txt2.setText("sof2:");
                txt5.setText(Integer.toString(sum2));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int input3 = Integer.parseInt(editText3.getText().toString());
                if(sum3==input3){
                    imageView3.setImageResource(R.drawable.like);
                    sumA++;
                }
                else{
                    imageView3.setImageResource(R.drawable.unlike);
                    Percent-=NPercent;
                }

                txt3.setText("sof3:");
                txt6.setText(Integer.toString(sum3));
            }
        });

    }

    public void btnOnclick4(View view) {
        editText.getText().clear();
        editText2.getText().clear();
        editText3.getText().clear();
        imageView.setImageResource(R.drawable.wall);
        imageView2.setImageResource(R.drawable.wall);
        imageView3.setImageResource(R.drawable.wall);
        num = rn.nextInt(89)+10;
        num1 =rn.nextInt(89)+10;
        num2 =rn.nextInt(89)+10;
        num3 =rn.nextInt(89)+10;
        num4 =rn.nextInt(89)+10;
        num5 =rn.nextInt(89)+10;
        sum=num+num3;//0.0&&1.0
        sum2 = num1+num4;//0.1&&1.1
        sum3= num2+num5;//0.2&&1.2
        txt1.setText(Integer.toString(num));
        txt2.setText(Integer.toString(num1));
        txt3.setText(Integer.toString(num2));
        txt4.setText(Integer.toString(num3));
        txt5.setText(Integer.toString(num4));
        txt6.setText(Integer.toString(num5));
        Toast.makeText(MainActivity.this,Percent+"% "+sumA+"/3",Toast.LENGTH_LONG).show();

    }
}