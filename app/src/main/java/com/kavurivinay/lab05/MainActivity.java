package com.kavurivinay.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    VariableCounter counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = new VariableCounter();
        sharedPreferences= getSharedPreferences("clickValues", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        counter.setCreate(counter.getCreate() + 1);
        editor.putInt("create", sharedPreferences.getInt("create", 0) + 1);
        editor.apply();
    }

    public void onResume(View view) {
        editor.putInt("resume", sharedPreferences.getInt("resume", 0) + 1);
        editor.apply();
        counter.setResume(counter.getResume() + 1);
    }

    public void onStop(View view) {
        editor.putInt("stop", sharedPreferences.getInt("stop", 0) + 1);
        editor.apply();
        counter.setStop(counter.getStop() + 1);

    }

    public void onStart(View view) {
        editor.putInt("start", sharedPreferences.getInt("start", 0) + 1);
        editor.apply();
        counter.setStart(counter.getStart() + 1);
    }

    public void onRestart(View view){
        editor.putInt("restart", sharedPreferences.getInt("restart", 0) + 1);
        editor.apply();
        counter.setRestart(counter.getRestart() + 1);
    }

    public void onDestroy(View view) {
        editor.putInt("destroy", sharedPreferences.getInt("destroy", 0) + 1);
        editor.apply();
        counter.setDestroy(counter.getDestroy() + 1);

    }

    public void onPause(View view) {
        editor.putInt("pause", sharedPreferences.getInt("pause", 0) + 1);
        editor.apply();
        counter.setPause(counter.getPause() + 1);
    }

    private class VariableCounter{
        int create, resume, stop, start, restart, destroy, pause;
        public VariableCounter(){
            create = 0;
            resume = 0;
            stop = 0;
            start = 0;
            restart = 0;
            destroy = 0;
            pause = 0;
        }
        public int getCreate() {
            return create;
        }

        public void setCreate(int create) {
            this.create = create;
        }

        public int getResume() {
            return resume;
        }

        public void setResume(int resume) {
            this.resume = resume;
        }

        public int getStop() {
            return stop;
        }

        public void setStop(int stop) {
            this.stop = stop;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getRestart() {
            return restart;
        }

        public void setRestart(int restart) {
            this.restart = restart;
        }

        public int getDestroy() {
            return destroy;
        }

        public void setDestroy(int destroy) {
            this.destroy = destroy;
        }

        public int getPause() {
            return pause;
        }

        public void setPause(int pause) {
            this.pause = pause;
        }
    }
}
