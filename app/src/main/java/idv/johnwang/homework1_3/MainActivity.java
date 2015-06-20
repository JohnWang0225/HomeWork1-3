package idv.johnwang.homework1_3;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
        private Button btnUp, btnDown;
        private ImageView ivLogo;
        private TextView tvGroup;
        private List<Team> teamList;

        private int position = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        btnUp = (Button) findViewById(R.id.btnUp);
        btnDown = (Button) findViewById(R.id.btnDown);
        tvGroup = (TextView) findViewById(R.id.tvGroup);
        ivLogo = (ImageView) findViewById(R.id.imageView);

        teamList = new ArrayList<>();
        teamList.add(new Team(R.drawable.p1, "第一隊"));
        teamList.add(new Team(R.drawable.p2, "第二隊"));
        teamList.add(new Team(R.drawable.p3, "第三隊"));
        teamList.add(new Team(R.drawable.p4, "第四隊"));
        teamList.add(new Team(R.drawable.p5, "第五隊"));
        teamList.add(new Team(R.drawable.p6, "第六隊"));
        teamList.add(new Team(R.drawable.p7, "第七隊"));
        teamList.add(new Team(R.drawable.p8, "第八隊"));
        teamList.add(new Team(R.drawable.p9, "第九隊"));
        teamList.add(new Team(R.drawable.p10, "第十隊"));
        
        tvGroup.setText(teamList.get(position).getName());
        ivLogo.setImageResource(teamList.get(position).getLogo());
        
        
        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position--;
                if (position < 0){
                    position = teamList.size() - 1;
                }
                tvGroup.setText(teamList.get(position).getName());
                ivLogo.setImageResource(teamList.get(position).getLogo());
            }
        });
        
        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position++;
                if (position > teamList.size() - 1){
                    position = 0;
                }
                tvGroup.setText(teamList.get(position).getName());
                ivLogo.setImageResource(teamList.get(position).getLogo());
            }
        });
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
