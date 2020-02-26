package com.kavurivinay.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onResume(View view) {
    }

    public void onStop(View view) {

    }

    public void onStart(View view) {

    }

    public void onRestart(View view){

    }

    public void onDestroy(View view) {

    }

    public void onPause(View view) {
    }

    private class VariableCounter{
        int create, resume, stop, start, restart, destroy, pause;
        public VariableCounter(){}
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
