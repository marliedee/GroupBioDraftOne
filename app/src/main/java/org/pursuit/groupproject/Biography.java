package org.pursuit.groupproject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Biography extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biography);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.popup_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        switch (item.getItemId()) {

            case R.id.option_bank:

                Uri uri1 = Uri.parse("https://github.com/marliedee/BankTellerDemo");
                Intent gitbank = new Intent(Intent.ACTION_VIEW,uri1);
                startActivity(gitbank);

                Toast.makeText(
                        Biography.this,
                        "You Clicked : " + item.getTitle(),
                        Toast.LENGTH_SHORT
                ).show();
                return true;

            case R.id.option_cyoa:

                Uri uri2 = Uri.parse("https://github.com/marliedee/CYOA_Pursuit_HW_Dantes_Marly");
                Intent gitcyoa = new Intent(Intent.ACTION_VIEW,uri2);
                startActivity(gitcyoa);


                Toast.makeText(
                        Biography.this,
                        "You Clicked : " + item.getTitle(),
                        Toast.LENGTH_SHORT
                ).show();
                return true;

            case R.id.option_madlibs:

                Uri uri3 = Uri.parse("https://github.com/marliedee/MadlibsApp");
                Intent gitmadlibs = new Intent(Intent.ACTION_VIEW,uri3);
                startActivity(gitmadlibs);

                Toast.makeText(
                        Biography.this,
                        "You Clicked : " + item.getTitle(),
                        Toast.LENGTH_SHORT
                ).show();
                return true;

            default:
                return false;
        }
    }
}