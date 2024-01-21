package in.ac.adit.myapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText n1,n2;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }
    public void addListenerOnButton()
    {    Button btn1;
        Button btn2;
        Button btn3;
        Button btn4;
        Button btn5;

        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);

        btn1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        String value1 = n1.getText().toString();
                                        String value2 = n2.getText().toString();
                                        int a = Integer.parseInt(value1);
                                        int b = Integer.parseInt(value2);
                                        int sum = a + b;
                                        Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();

                                    }
                                });
             btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String value1=n1.getText().toString();
                    String value2=n2.getText().toString();
                    int a=Integer.parseInt(value1);
                    int b=Integer.parseInt(value2);
                    int diff=a-b;
                    Toast.makeText(getApplicationContext(),String.valueOf(diff),Toast.LENGTH_LONG).show();

                }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=n1.getText().toString();
                String value2=n2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int mul=a*b;
                Toast.makeText(getApplicationContext(),String.valueOf(mul),Toast.LENGTH_LONG).show();

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=n1.getText().toString();
                String value2=n2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int div=a/b;
                Toast.makeText(getApplicationContext(),String.valueOf(div),Toast.LENGTH_LONG).show();

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=n1.getText().toString();
                String value2=n2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int mod=a%b;
                Toast.makeText(getApplicationContext(),String.valueOf(mod),Toast.LENGTH_LONG).show();

            }
        });


    }
}