package com.example.willd.acmeflooringandtilingcompany;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
    }
/*
    public void Calculate(View v){
        //create room length value
        EditText roomLengthInput = (EditText) findViewById(R.id.tbRoomLength);

        String roomLengthInputVal = roomLengthInput.getText().toString();

        Double roomLengthVal = Double.parseDouble(roomLengthInputVal);

        //create room width value
        EditText roomWidthInput = (EditText) findViewById(R.id.tbRoomWidth);

        String roomWidthInputVal = roomWidthInput.getText().toString();

        Double roomWidthVal = Double.parseDouble(roomWidthInputVal);

        //create lengthOfOneFloorTile value
        EditText lengthOfOneFloorTile = (EditText) findViewById(R.id.tbLengthOfOneFloorTile);

        String lengthOfOneFloorTileInputVal = roomLengthInput.getText().toString();

        Double lengthOfOneFloorTileVal = Double.parseDouble(lengthOfOneFloorTileInputVal);

        //calculate and set answer
        double answer = (roomLengthVal * roomWidthVal) / lengthOfOneFloorTileVal;

        String answerVal = String.valueOf(answer);

        TextView labelAnswer = (TextView) findViewById(R.id.lblAnswer);

        labelAnswer.setText(answerVal);
    }

    public void CalculateFive(){

    }
 */

    ////////////////////////////////////////////////
    static Double roomLengthVal;
    static Double roomWidthVal;
    static Double lengthOfOneFloorTileVal;
    static Double answer;

    public void setVariables(View v){
        //create room length value
        EditText roomLengthInput = (EditText) findViewById(R.id.tbRoomLength);

        String roomLengthInputVal = roomLengthInput.getText().toString();

        roomLengthVal = Double.parseDouble(roomLengthInputVal);

        //create room width value
        EditText roomWidthInput = (EditText) findViewById(R.id.tbRoomWidth);

        String roomWidthInputVal = roomWidthInput.getText().toString();

        roomWidthVal = Double.parseDouble(roomWidthInputVal);

        //create lengthOfOneFloorTile value
        EditText lengthOfOneFloorTile = (EditText) findViewById(R.id.tbLengthOfOneFloorTile);

        String lengthOfOneFloorTileInputVal = roomLengthInput.getText().toString();

        lengthOfOneFloorTileVal = Double.parseDouble(lengthOfOneFloorTileInputVal);

        //calculate and set answer

        String answerVal = String.valueOf(answer);

        TextView labelAnswer = (TextView) findViewById(R.id.lblAnswer);

        labelAnswer.setText(answerVal);

    }

    public void calculate(View v){
        setVariables(v);
        answer = (roomLengthVal * roomWidthVal) / lengthOfOneFloorTileVal;
        setVariables(v);
    }

    public void calcFive(View v){
        setVariables(v);
        answer = (roomLengthVal * roomWidthVal) / lengthOfOneFloorTileVal;
        answer = answer + (answer * 0.05);
        setVariables(v);
    }

    public void calcTen(View v){
        setVariables(v);
        answer = (roomLengthVal * roomWidthVal) / lengthOfOneFloorTileVal;
        answer = answer + (answer * 0.1);
        setVariables(v);
    }
}
