package sg.edu.rp.c346.id19020844.demomywebbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnLoadURL;
    WebView wvMyPage;
    EditText etURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadURL = findViewById(R.id.buttonLoad);
        wvMyPage = findViewById(R.id.webViewMyPage);
        etURL = findViewById(R.id.editURL);

        wvMyPage.setWebViewClient(new WebViewClient());
        WebSettings wsMyPage = wvMyPage.getSettings();
        wsMyPage.setJavaScriptEnabled(true);
        wsMyPage.setAllowFileAccess(false);
        wsMyPage.setBuiltInZoomControls(true);

        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.grab.com/sg/";
                url += etURL.getText().toString();
                wvMyPage.loadUrl(url);
            }
        });
    }
}
