package liquiddark.com.tasklist;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {



    Toolbar mToolBar;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //in order
        //1
        initElements();
        //2
        addActions();
        //3
        initBackgroundImage();





    }

    private void addActions() {
        setSupportActionBar(mToolBar);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void initElements() {
        mToolBar = (Toolbar) findViewById(R.id.toolbar);
        mButton = (Button) findViewById(R.id.add_a_drop_button);
    }

    private void initBackgroundImage() {

        ImageView backgroundImage = (ImageView) findViewById(R.id.background_image);

        Glide.with(this).load(R.drawable.background).centerCrop().into(backgroundImage);


    }

}
