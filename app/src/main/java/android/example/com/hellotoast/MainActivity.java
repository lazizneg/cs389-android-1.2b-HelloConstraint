package android.example.com.hellotoast;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button mButtonZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = (TextView)findViewById(R.id.show_count);

        mButtonZero = (Button)findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);

        toast.show();
    }
    public void countUp(View view) {
        ++mCount;
        if(mShowCount!=null){
            mButtonZero.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            if(mCount%2 == 0){
                view.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            }
            else{
                view.setBackgroundColor(getResources().getColor(R.color.blue));
            }
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    public void initZero(View view) {
        mCount = 0;
        if(mShowCount!=null){
            mShowCount.setText(Integer.toString(mCount));
            mButtonZero.setBackgroundColor(Color.DKGRAY);
        }
    }

}
