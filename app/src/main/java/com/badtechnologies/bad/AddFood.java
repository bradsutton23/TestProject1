package com.badtechnologies.bad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class AddFood extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{

    Spinner spinner;
    int total  = 0;
    int lastValue = 0;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addfood);
        spinner = findViewById(R.id.spin1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.fname, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
     }

    public void onClick(View v)
    {
        String text = spinner.getSelectedItem().toString();
        getCal(text);
        et = (EditText)findViewById(R.id.tv1);
        et.setText(getString(R.string.output) + " " + total);

    }


    public void removeLast(View v)
    {

        int newTotal = total - lastValue;

        if (lastValue == total - newTotal && total > 0 && total - lastValue > 0)
        {
             total = total - lastValue;
             et.setText(getString(R.string.output) + " " + total);
        }
}

    public int getCal(String s)
    {
        String message = "Calories Added: ";
        int totalCals = 0;
        if (s.equalsIgnoreCase("Bananas (1 Banana 90 Calories)")) {
            totalCals = 90;
            int i = getTotal(totalCals);
            lastValue = i;
            total = total + i;
            Toast.makeText(AddFood.this, message + total, Toast.LENGTH_SHORT).show();

        }
        else if (s.equalsIgnoreCase("Apple (1 Apple 95 Calories)")) {
            totalCals = 95;
            int i = getTotal(totalCals);
            lastValue = i;
            total = total + i;
            Toast.makeText(AddFood.this, message + i, Toast.LENGTH_SHORT).show();

        } else if (s.equalsIgnoreCase("Boiled-Egg (1 Boiled-Egg 77 Calories)")) {
            totalCals = 77;
            int i = getTotal(totalCals);
            lastValue = i;
            total = total + i;
            Toast.makeText(AddFood.this, message + i, Toast.LENGTH_SHORT).show();

        } else if (s.equalsIgnoreCase("Avocado (1 Avocado 100 Calories)")) {
            totalCals = 100;
            int i = getTotal(totalCals);
            lastValue = i;
            total = total + i;
            Toast.makeText(AddFood.this, message + i, Toast.LENGTH_SHORT).show();


        } else if (s.equalsIgnoreCase("Grape (12 Grapes 62 Calories)")) {
            totalCals = 62;
            int i = getTotal(totalCals);
            lastValue = i;
            total = total + i;
            Toast.makeText(AddFood.this, message + i, Toast.LENGTH_SHORT).show();


        } else if (s.equalsIgnoreCase("Celery (3 Stalks 16 Calories)")) {
            totalCals = 16;
            int i = getTotal(totalCals);
            lastValue = i;
            total = total + i;
            Toast.makeText(AddFood.this, message + i, Toast.LENGTH_SHORT).show();


        } else if (s.equals("Broccoli (1 Cup 30 Calories)")) {
            totalCals = 30;
            int i = getTotal(totalCals);
            lastValue = i;
            total = total + i;
            Toast.makeText(AddFood.this, message + i, Toast.LENGTH_SHORT).show();


        } else if (s.equals("Potato (8 oz. 147 Calories)")) {
            totalCals = 147;
            int i = getTotal(totalCals);
            lastValue = i;
            total = total + i;
            Toast.makeText(AddFood.this, message + i, Toast.LENGTH_SHORT).show();



        } else if (s.equals("Fried Catfish (8 oz. 199 Calories)")) {
            totalCals = 199;
            int i = getTotal(totalCals);
            lastValue = i;
            total = total + i;
            Toast.makeText(AddFood.this, message + i, Toast.LENGTH_SHORT).show();


        } else if (s.equals("Hamburger (12 oz. 232 Calories)")) {
            totalCals = 232;
            int i = getTotal(totalCals);
            lastValue = i;
            total = total + i;
            Toast.makeText(AddFood.this, message + i, Toast.LENGTH_SHORT).show();


        } else if (s.equals("Steak (6 oz. 128 Calories)")) {
            totalCals = 128;
            int i = getTotal(totalCals);
            lastValue = i;
            total = total + i;
            Toast.makeText(AddFood.this, message + i, Toast.LENGTH_SHORT).show();


        } else if (s.equals("Orange (62 Calories)")) {
            totalCals = 62;
            int i = getTotal(totalCals);
            lastValue = i;
            total = total + i;
            Toast.makeText(AddFood.this, message + i, Toast.LENGTH_SHORT).show();


        } else if (s.equals("Pizza (1 Slice 350 Calories)")) {
            totalCals = 350;
            int i = getTotal(totalCals);
            lastValue = i;
            total = total + i;
            Toast.makeText(AddFood.this, message + i, Toast.LENGTH_SHORT).show();


        } else if (s.equals("Coke (88 Calories)")) {
            totalCals = 88;
            int i = getTotal(totalCals);
            lastValue = i;
            total = total + i;
            Toast.makeText(AddFood.this, message + i, Toast.LENGTH_SHORT).show();


        } else if (s.equals("Water (0 Calories)")) {
            totalCals = 0;
            int i = getTotal(totalCals);
            lastValue = i;
            total = total + i;
            Toast.makeText(AddFood.this, message + i, Toast.LENGTH_SHORT).show();

        } else if (s.equals("Chicken (8 oz. 115 Calories)")) {
            totalCals = 115;
            int i = getTotal(totalCals);
            lastValue = i;
            total = total + i;
            Toast.makeText(AddFood.this, message + i, Toast.LENGTH_SHORT).show();

        } else if (s.equals("Beans (1 Can 246 Calories)")) {
            totalCals = 246;
            int i = getTotal(totalCals);
            lastValue = i;
            total = total + i;
            Toast.makeText(AddFood.this, message + i, Toast.LENGTH_SHORT).show();

        } else if (s.equals("Sausage (5 oz. 120 Calories)")) {
            totalCals = 120;
            int i = getTotal(totalCals);
            lastValue = i;
            total = total + i;
            Toast.makeText(AddFood.this, message + i, Toast.LENGTH_SHORT).show();


        } else if (s.equals("Bacon (2 Slices 44 Calories)")) {
            totalCals = 44;
            int i = getTotal(totalCals);
            lastValue = i;
            total = total + i;
            Toast.makeText(AddFood.this, message + i, Toast.LENGTH_SHORT).show();


        } else if (s.equals("Milk (8 oz. 103 Calories)")) {
            totalCals = 103;
            int i = getTotal(totalCals);
            lastValue = i;
            total = total + i;
            Toast.makeText(AddFood.this, message + i, Toast.LENGTH_SHORT).show();

        }
        return totalCals;
    }




     public void chillscreen(View view)
    {

        String total = et.getText().toString();
        Intent intent = new Intent(this, home.class);
        intent.putExtra("TOTAL", total);
        startActivity(intent);
    }



    public int getTotal(int c)
    {
        int total = 0;
        if(total <=  c)
        {
            total = c;
        }
        else
        {
            total = total + c;
        }
        return total;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l)
    {
        String foodName = parent.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView)
    {

    }


}
