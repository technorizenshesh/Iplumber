package com.my.iplumber.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.my.iplumber.R;
import com.my.iplumber.databinding.ActivityPlumberUserSignUpBinding;

public class SignUpUserAct extends AppCompatActivity {

    ActivityPlumberUserSignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_plumber_user_sign_up);

        binding.cardLanguage.setOnClickListener(v -> {
            //Creating the instance of PopupMenu
            PopupMenu popup = new PopupMenu(SignUpUserAct.this, binding.cardLanguage);
            //Inflating the Popup using xml file
            popup.getMenuInflater()
                    .inflate(R.menu.myfile, popup.getMenu());

            //registering popup with OnMenuItemClickListener
            popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                public boolean onMenuItemClick(MenuItem item) {
                    if(item.equals("one"))
                    {
                        binding.txtLanguage.setText("English");

                    }else
                    {
                        binding.txtLanguage.setText("Hindi");
                    }
                    return true;
                }
            });

            popup.show();


        });

    }
}