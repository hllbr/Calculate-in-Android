package com.hllbr.simplecalculaterandraoid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //GLOBAL ÖZELLİKLERİN TANIMLANDIĞI ALAN =
    EditText number1Text ;
    EditText number2Text ;
    TextView resultText ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //GLOBAL DEĞİŞKENLERE GÖREV DAĞILIMI YAPMAK İÇİN EN UYGUN ALANIMIZ.PROGRAM BAŞLAR BAŞLAMAZ BU ALANDA GÖREVLERİ DEĞİŞKENLERE DAĞITMIŞ OLUYORUZ.İKİNCİ ÜÇÜNCÜ KEZ BU TANIMLARAMARI YAPMAKTAN BİZİ KURTARIYOR

        number1Text = findViewById(R.id.number1Text);

        number2Text = findViewById(R.id.number2Text);

        resultText = findViewById(R.id.resultText);

        //edit text içerisine yazılan ifadeleri alamk için

       // number1Text.getText().toString();//Kullanıcının verdiği değeri string olarak almış oldum.Bu işlemi oncreate altında yapmak yanlış olur çünkü daha uygualama başlamadan çalışacak ve biz değer vermeden boş ifadeyi almış olacak

    }
    public void sub(View view) {
        //çıkarma
        int number1 = Integer.parseInt(number1Text.getText().toString());
        int number2 = Integer.parseInt(number2Text.getText().toString());

        int result = number1 - number2;

        resultText.setText("Result : " +result);

    }
    public void sum(View view){
        //toplama

        //edit text ifadeleri içrsine yazılan değerleri integer ifade olarak almam gerekiyor ki işlemlerimi gerçekleştirebileyim.

        //bu ifadeleri string olarka tanımlamak için toString kullanılırken ...

        //integer ifade olarak almak için ...

        //gettext ifadesi editable sınıfından yani bir integer yada bir string değil aldığımız ifade üzerinde tanımlama yapmamız şart


        // String birinciSayı = number1Text.getText().toString();

        //bir ifadeyi integere dönüştürmenin en basit yollarından biri =

        //Integer.parseInt(birinciSayı);//yapıyı düeltirsem =

        int number1 = Integer.parseInt(number1Text.getText().toString());

        int number2 = Integer.parseInt(number2Text.getText().toString());

        int result = number1 + number2 ;



        resultText.setText("Result : "+ result);//bu yapı içerisine sonucu direk veremiyoruz yukarıdaki dönüşümlere benzer bir dönüşüm yapmamız gerek  integer ifadeyi string ifadeye dönüştürmem gerek

        //bunun yerine bir string ifade ile birlikte yazdırırsak yukarıda olduğu gibi .
    }

    public void div(View view){

    //bölme
        int number1 = Integer.parseInt(number1Text.getText().toString());
        int number2 = Integer.parseInt(number2Text.getText().toString());

        double result = (double) (number1 / number2);
        resultText.setText("Reslut : " + result);
    }

    public void multi(View view){
    int number1  = Integer.parseInt(number1Text.getText().toString());
    int number2 = Integer.parseInt(number2Text.getText().toString());

    int result = number1 * number2 ;

    resultText.setText("Result : " +result);
        //çarpma
    }

}