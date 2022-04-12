package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView name_txt, surname_txt, father_txt, mother_txt, age_txt, gender_txt, cast_txt, address_txt, filed_txt,
            hobbies_txt1, hobbies_txt2, hobbies_txt3, hobbies_txt4, hobbies_txt5, state_txt, phone_txt, photo_txt, mail_txt, birth_txt;

    private ImageView call_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding();

        String name = getIntent().getStringExtra("n1");
        String surname = getIntent().getStringExtra("n2");
        String father_name = getIntent().getStringExtra("n3");
        String mother_name = getIntent().getStringExtra("n4");
        String age = getIntent().getStringExtra("n5");
        String gender = getIntent().getStringExtra("n6");
        String cast = getIntent().getStringExtra("n7");
        String address = getIntent().getStringExtra("n8");
        String fill = getIntent().getStringExtra("n9");
        String sing = getIntent().getStringExtra("n10");
        String dance = getIntent().getStringExtra("n11");
        String swim = getIntent().getStringExtra("n12");
        String travel = getIntent().getStringExtra("n13");
        String read = getIntent().getStringExtra("n14");
        String stat = getIntent().getStringExtra("n15");
        String phone = getIntent().getStringExtra("n16");
        String mail = getIntent().getStringExtra("n17");
        String birth = getIntent().getStringExtra("n18");


        name_txt.setText(name);
        surname_txt.setText(surname);
        father_txt.setText(father_name);
        mother_txt.setText(mother_name);
        age_txt.setText(age);
        cast_txt.setText(cast);
        address_txt.setText(address);
        filed_txt.setText(fill);
        gender_txt.setText(gender);
        hobbies_txt1.setText(sing);
        hobbies_txt2.setText(dance);
        hobbies_txt3.setText(swim);
        hobbies_txt4.setText(travel);
        hobbies_txt5.setText(read);
        state_txt.setText(stat);
        phone_txt.setText(phone);
        mail_txt.setText(mail);
        birth_txt.setText(birth);


        call_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no = "tel:" + phone;
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse(no));
                startActivity(i);
            }
        });

//        photo_txt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                    Intent galleryIntent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//                    galleryIntent.setData(Uri.parse(String.valueOf(galleryIntent)));
//                    startActivity(galleryIntent);
//
//            }
//        });


    }

    private void binding() {
        name_txt = findViewById(R.id.name_txt);
        surname_txt = findViewById(R.id.surname_txt);
        father_txt = findViewById(R.id.father_txt);
        mother_txt = findViewById(R.id.mother_txt);
        age_txt = findViewById(R.id.age_txt);
        cast_txt = findViewById(R.id.cast_txt);
        gender_txt = findViewById(R.id.gender_txt);
        address_txt = findViewById(R.id.address_txt);
        filed_txt = findViewById(R.id.filed_txt);
        hobbies_txt1 = findViewById(R.id.hobbies_txt1);
        hobbies_txt2 = findViewById(R.id.hobbies_txt2);
        hobbies_txt3 = findViewById(R.id.hobbies_txt3);
        hobbies_txt4 = findViewById(R.id.hobbies_txt4);
        hobbies_txt5 = findViewById(R.id.hobbies_txt5);
        state_txt = findViewById(R.id.state_txt);
        phone_txt = findViewById(R.id.phone_txt);
        call_txt = findViewById(R.id.call_txt);
        mail_txt = findViewById(R.id.mail_txt);
        birth_txt = findViewById(R.id.birth_txt);
//        photo_txt = findViewById(R.id.photo_txt);
    }
}