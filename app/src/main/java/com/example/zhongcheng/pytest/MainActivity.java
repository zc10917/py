package com.example.zhongcheng.pytest;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zhongcheng.pytest.BankCardList.Data;
import com.example.zhongcheng.pytest.BankCardList.Root;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity implements Callback {
    private static final int TEXT = 1;
    private static final int IMAGE =2;
    private
    TextView textView;
    Button button;
    Button postButton;
    Button imageButton;
    ImageView imageView;
    Handler handler = new Handler(){

        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case TEXT:
                    textView.setText(msg.getData().getString("text"));
                    break;
                case IMAGE:
                    imageView.setImageBitmap((Bitmap) msg.getData().getParcelable("image"));
                    break;

            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final OkHttpClient okHttpClient = new OkHttpClient();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn1);
        postButton = (Button) findViewById(R.id.btn2);
        imageButton = (Button) findViewById(R.id.btn3);
        imageView = (ImageView) findViewById(R.id.img1);
        f();

        textView = (TextView) findViewById(R.id.text1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Request request = new Request.Builder().url("http://10.0.3.2:5000"). tag(TEXT).
                        build();
                okHttpClient.newCall(request).enqueue(MainActivity.this);

            }
        });

        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestBody form = new FormBody.Builder().add("username","admin").add("password","password").
                        build();
                Request request = new Request.Builder().url("http://10.0.3.2:5000/api/wallet/bankcard?").post(form).tag(TEXT).
                        build();
                okHttpClient.newCall(request).enqueue(MainActivity.this);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Request request = new Request.Builder().url("http://p1.meituan.net/pay/65d697faea33b7005492a55d4327e883558.png").tag(IMAGE).build();
                okHttpClient.newCall(request).enqueue(MainActivity.this);
            }
        });


    }






    @Override
    public void onFailure(Call call, IOException e) {
        Log.e("response","fail");
    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {
        Bundle bundle;
        Message m    ;
        Log.e("response",response.toString());
        Log.e("response",response.message());
        switch ((Integer) call.request().tag()){
            case TEXT:
                 bundle = new Bundle();
                bundle.putString("text",response.body().string());
                m  = Message.obtain(handler);

                m.what = TEXT;
                m.setData(bundle);
                m.sendToTarget();
                break;
            case IMAGE:

                InputStream is =response.body().byteStream();
                Bitmap bm = BitmapFactory.decodeStream(is);
                bundle = new Bundle();
                bundle.putParcelable("image",bm);
                m  = Message.obtain(handler);
                m.what = IMAGE;
                m.setData(bundle);
                m.sendToTarget();

                break;
        }

    }

    void f(){
        String str = "{\n" +
                "\t\"status\": \"success\",\n" +
                "\t\"data\": {\n" +
                "\t\t\"credit\": [],\n" +
                "\t\t\"debit\": [{\n" +
                "\t\t\t\"bankcardId\": 120332147,\n" +
                "\t\t\t\"tailNo\": \"2731\",\n" +
                "\t\t\t\"bankName\": \"招商银行\",\n" +
                "\t\t\t\"cardType\": \"储蓄卡\",\n" +
                "\t\t\t\"maxAmountPerTime\": 1000,\n" +
                "\t\t\t\"maxAmountPerDay\": 3000,\n" +
                "\t\t\t\"icon\": \"https://p0.meituan.net/pay/ic_bank_cmb.png\",\n" +
                "\t\t\t\"bin\": \"62148301\",\n" +
                "\t\t\t\"cellphone\": \"15827481731\",\n" +
                "\t\t\t\"freeze\": 0,\n" +
                "\t\t\t\"modtime\": 1472279470\n" +
                "\t\t}]\n" +
                "\t}\n" +
                "}";
        Gson gson = new Gson();
        Data d = new Data();
//        Root root ;
//        root = gson.fromJson(str,Root.class);
//        String str1 = root.getData().getDebit().get(0).getBankName();
//        Log.e("name",str1);
        jso j = gson.fromJson(str,jso.class);
        Log.e("name",j.getData().getDebit().get(0).getCardType());

//        Root root = gson.fromJson(str,Root.class);
    }
}
