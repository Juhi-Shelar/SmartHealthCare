package com.example.smarthealthcare;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final String secretKey = "ssshhhhhhhhhhh!!!!";

        String originalString = "howtodoinjava.com";
        String encryptedString = Cryptography.encrypt(originalString, secretKey) ;
        String decryptedString = Cryptography.decrypt(encryptedString, secretKey) ;

        System.out.println("po--"+originalString);
        System.out.println("po--"+encryptedString);
        System.out.println("po--"+decryptedString);
    }
}
