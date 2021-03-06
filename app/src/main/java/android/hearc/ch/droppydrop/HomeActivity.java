package android.hearc.ch.droppydrop;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.hearc.ch.droppydrop.game.Level.LevelActivity;
import android.hearc.ch.droppydrop.score.ScoreActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button playButton;
    Button scoresButton;
    Button optionsButton;
    Button creditsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        playButton = (Button) findViewById(R.id.playButton);
        scoresButton = (Button) findViewById(R.id.scoreButton);
        optionsButton = (Button) findViewById(R.id.optionsButton);
        creditsButton = (Button) findViewById(R.id.creditsButton);

        playButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, LevelActivity.class);
                startActivity(intent);
            }
        });
        scoresButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ScoreActivity.class);
                startActivity(intent);
            }
        });
        optionsButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, OptionsActivity.class);
                startActivity(intent);
            }
        });
        creditsButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(HomeActivity.this).create();
                alertDialog.setTitle("Credits");
                alertDialog.setMessage("Android game for a student project !\n" +
                        "It has been developped at HE-Arc, Neuchâtel by :\n" +
                        " - Biloni Kim Aurore\n" +
                        " - Goloviatinski Sergiy\n" +
                        " - Srdjenovic Luca\n" +
                        "\n" +
                        "Fall 2018");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });
    }
}
