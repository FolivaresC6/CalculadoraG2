package cl.ceduc.calculadorag2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_zero = (Button) this.findViewById(R.id.btn_zero);
        Button btn_one = (Button) this.findViewById(R.id.btn_one);
        Button btn_two = (Button) this.findViewById(R.id.btn_two);
        Button btn_three = (Button) this.findViewById(R.id.btn_three);
        Button btn_four = (Button) this.findViewById(R.id.btn_four);
        Button btn_five = (Button) this.findViewById(R.id.btn_five);
        Button btn_six = (Button) this.findViewById(R.id.btn_six);
        Button btn_seven = (Button) this.findViewById(R.id.btn_seven);
        Button btn_eight = (Button) this.findViewById(R.id.btn_eight);
        Button btn_nine = (Button) this.findViewById(R.id.btn_nine);
        Button btn_add = (Button) this.findViewById(R.id.btn_add);
        Button btn_substract = (Button) this.findViewById(R.id.btn_substract);
        Button btn_multiply = (Button) this.findViewById(R.id.btn_multiply);
        Button btn_divide = (Button) this.findViewById(R.id.btn_divide);
        Button btn_backspace = (Button) this.findViewById(R.id.btn_backspace);
        Button btn_decimal = (Button) this.findViewById(R.id.btn_decimal);
        Button btn_clear = (Button) this.findViewById(R.id.btn_clear);
        Button btn_equal = (Button) this.findViewById(R.id.btn_equal);
        TextView txt_testo = (TextView) this.findViewById(R.id.txt_testo);

        btn_zero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setDigito("0");
            }
        });
        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDigito("1");
            }
        });
        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDigito("2");
            }
        });
        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDigito("3");
            }
        });
        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDigito("4");
            }
        });
        btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDigito("5");
            }
        });
        btn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDigito("6");
            }
        });
        btn_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDigito("7");
            }
        });
        btn_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDigito("8");
            }
        });
        btn_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDigito("9");
            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDigito("+");
            }
        });
        btn_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDigito(".");
            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDigito("/");
            }
        });
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDigito("*");
            }
        });
        btn_substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDigito("-");
            }
        });
        btn_clear.

    }
    void setDigito(String digito){
        TextView txt_testo = (TextView) this.findViewById(R.id.txt_testo);
        String actual = txt_testo.getText().toString();
        String nuevo = actual + digito;
        txt_testo.setText(nuevo);

    }
    //final Button button = (Button) findViewById(R.id.button_id);
    //final TextView label = (Label) findViewById(R.id.label_id);
    //button.setOnClickListener(new View.OnClickListener() {
    //    public void onClick(View v) {
    //        //Si quieres poner el mismo valor que el texto del botón
    //        label.setText(v.getText());
    //        //Si quieres agregarle al valor del texto del Label el texto del botón
    //        // label.setText(label.getText()+v.getText());
    //        //Si quieres ponerle un texto predeterminado "0"
    //        // label.setText("0");
    //        //Si quieres agregarle un texto predeterminado "0"
    //        // label.setText(label.getText()+"0");
    //    }
    //});
}
