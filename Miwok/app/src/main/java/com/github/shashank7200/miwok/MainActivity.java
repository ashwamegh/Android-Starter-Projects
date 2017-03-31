/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.shashank7200.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numberView = (TextView) findViewById(R.id.numbers);
        numberView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent to start the NumbersActivity Class
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        TextView colorsView = (TextView) findViewById(R.id.colors);
        colorsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent to start the ColorsActivity Class
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        TextView familyView = (TextView) findViewById(R.id.family);
        familyView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent to start the FamilyActivity Class
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        TextView phrasesView = (TextView) findViewById(R.id.phrases);
        phrasesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent to start the PhrasesActivity Class
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });


    }

}
