package com.example.merdc.deinfohelpdesk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.content.Intent;

public class CursoActivity extends AppCompatActivity {

    final int BCC = 0;
    final int BSI = 1;
    final int LC = 2;

    int dft = BCC;

    Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso);

        Intent getIt = getIntent();
        dft = getIt.getIntExtra("preSelected", 0);

      //  updateSelection();

/*        mBtn = (Button) findViewById(R.id.select);

        mBtn.setOnClickListener((v) -> {
            Intent intent = new Intent();
            intent.putExtra("dft", dft);
            setResult(RESULT_OK, intent);
            finish();
        });
    }

    public void onClicked(View v) {

        switch (v.getId()) {
            case R.id.dftBCC:
                dft = BCC;
                break;
            case R.id.dftBSI:
                dft = BSI;
                break;
            case R.id.dftLC:
                dft = LC;
                break;
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("selected", selected);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        selected = savedInstanceState.getInt("selected");
        updateSelection();
    }

    public void updateSelection() {
        switch (selected) {
            case BCC:
                ((RadioButton) findViewById(R.id.selectedBCC)).setChecked(true);
                break;
            case BSI:
                ((RadioButton) findViewById(R.id.selectedBSI)).setChecked(true);
                break;
            case LC:
                ((RadioButton) findViewById(R.id.selectedLC)).setChecked(true);
                break;
        }*/
    }
}
