package mx.edu.itchetumal.dadm.tablelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn11,btn12;
    EditText edtResult;
    Button btnBorrar;
    String tempRes,tempRes2;
    int operador1,operador2,open,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtResult =(EditText) findViewById(R.id.edtResultado);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if (edtResult.getText().toString().compareTo("0")==0)
                                            edtResult.setText("1");
                                        else
                                        edtResult.setText(edtResult.getText()+"1");
//                                        Toast.makeText(MainActivity.this, "Presionaste un boton", Toast.LENGTH_SHORT).show();
                                    }
                                }


        );
        //pogramar el clic de borrar
        btnBorrar = (Button) findViewById(R.id.btnBorrar);
        btnBorrar.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                            edtResult.setText("0");
//                                        Toast.makeText(MainActivity.this, "Presionaste un boton", Toast.LENGTH_SHORT).show();
                                    }
                                }


        );

        edtResult =(EditText) findViewById(R.id.edtResultado);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtResult.getText().toString().compareTo("0")==0)
                    edtResult.setText("2");
                else
                    edtResult.setText(edtResult.getText()+"2");
            }
        }


        );

        edtResult =(EditText) findViewById(R.id.edtResultado);
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if (edtResult.getText().toString().compareTo("0")==0)
                                            edtResult.setText("3");
                                        else
                                            edtResult.setText(edtResult.getText()+"3");
                                    }
                                }


        );

        edtResult =(EditText) findViewById(R.id.edtResultado);
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if (edtResult.getText().toString().compareTo("0")==0)
                                            edtResult.setText("4");
                                        else
                                            edtResult.setText(edtResult.getText()+"4");
                                    }
                                }


        );

        edtResult =(EditText) findViewById(R.id.edtResultado);
        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if (edtResult.getText().toString().compareTo("0")==0)
                                            edtResult.setText("5");
                                        else
                                            edtResult.setText(edtResult.getText()+"5");
                                    }
                                }


        );
        edtResult =(EditText) findViewById(R.id.edtResultado);
        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if (edtResult.getText().toString().compareTo("0")==0)
                                            edtResult.setText("6");
                                        else
                                            edtResult.setText(edtResult.getText()+"6");
                                    }
                                }


        );
        edtResult =(EditText) findViewById(R.id.edtResultado);
        btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if (edtResult.getText().toString().compareTo("0")==0)
                                            edtResult.setText("7");
                                        else
                                            edtResult.setText(edtResult.getText()+"7");
                                    }
                                }


        );

        edtResult =(EditText) findViewById(R.id.edtResultado);
        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if (edtResult.getText().toString().compareTo("0")==0)
                                            edtResult.setText("8");
                                        else
                                            edtResult.setText(edtResult.getText()+"8");
                                    }
                                }


        );
        edtResult =(EditText) findViewById(R.id.edtResultado);
        btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if (edtResult.getText().toString().compareTo("0")==0)
                                            edtResult.setText("9");
                                        else
                                            edtResult.setText(edtResult.getText()+"9");
                                    }
                                }


        );
        edtResult =(EditText) findViewById(R.id.edtResultado);
        btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if (edtResult.getText().toString().compareTo("0")==0)
                                            edtResult.setText("0");
                                        else
                                            edtResult.setText(edtResult.getText()+"0");
                                    }
                                }


        );
        edtResult =(EditText) findViewById(R.id.edtResultado);
        btn11 = (Button) findViewById(R.id.btn11);
        btn11.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if (edtResult.getText().toString().compareTo("0")==0){

                                            try{
                                                tempRes = edtResult.getText().toString();
                                                operador1 = Integer.parseInt(tempRes);

                                            }catch (NumberFormatException nfe){}
                                            edtResult.setText("");
                                            open=1;

                                        }else
                                            Toast.makeText(MainActivity.this, "salio mal", Toast.LENGTH_SHORT).show();
                                    }
                                }


        );
        edtResult =(EditText) findViewById(R.id.edtResultado);
        btn12 = (Button) findViewById(R.id.btn12);
        btn12.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                            try{
                                             tempRes2=edtResult.getText().toString();
                                            operador2 = Integer.parseInt(tempRes2);

                                            }catch (NumberFormatException nfe){}
                                               edtResult.setText("");



                                            if (open==1)
                                                res=operador1 + operador2 ;
                                            else
                                                Toast.makeText(MainActivity.this, "salio mal", Toast.LENGTH_SHORT).show();
                                    }
                                }


        );









    }

}
