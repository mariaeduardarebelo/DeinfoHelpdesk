package com.example.merdc.deinfohelpdesk;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mNomeText;
    EditText mQuestaoText;
    CheckBox mEstudanteCheckbox;
    Button mCursoBtn;
    Button mEnviarBtn;
    CheckBox mBCCRadio;

    final int FALSE = 0;
    final int BCC = 1;
    final int BSI = 2;
    final int LC = 3;

    int dft = BCC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNomeText = (EditText) findViewById(R.id.nomeText);
        mQuestaoText = (EditText) findViewById(R.id.questaoText);
        mEstudanteCheckbox = (CheckBox) findViewById(R.id.studentCheckBox);
        mCursoBtn = (Button) findViewById(R.id.cursoBtn);
        mEnviarBtn = (Button) findViewById(R.id.sendBtn);

        final Context context = this;

        mCursoBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, CursoActivity.class);
                intent.putExtra("bccRadio", dft);
                startActivityForResult(intent, FALSE);
            }
        });
    }

        public void onClick(View v) {

           /* mEnviarBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "ENVIAR", Toast.LENGTH_SHORT).show();

                    dft = BCC;
                    mNomeText.setText("");
                    mQuestaoText.setText("");
                    mEstudanteCheckbox.setChecked(false);
                    mBCCRadio.setText(R.string.bccRadio);
                }
            });*/
    }
}
