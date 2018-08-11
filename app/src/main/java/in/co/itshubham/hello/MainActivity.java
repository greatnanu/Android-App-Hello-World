package in.co.itshubham.hello;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//       TextView textView =  findViewById(R.id.text1);
//       Button button = findViewById(R.id.button);

        WebView webView = (WebView)findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
        webView.loadUrl("https://developer.android.com/reference/android/webkit/WebView");



    }

//    public void buttonTapped(View view) {
//        Intent intent;
//        intent = new Intent(getApplicationContext(), Main2Activity.class);
//        startActivity(intent);
//        finish();
//    }
}
