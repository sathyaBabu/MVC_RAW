package com.sathya.mvc_raw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.sathya.mvc_raw.mvc.Model;
import com.sathya.mvc_raw.mvc.View;
import com.sathya.mvc_raw.mvc.Contoller;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Model model  = retriveCourseFromDatabase();

        //Create a view : to write course details on console
        View view = new View();

       Contoller controller = new Contoller(model, view);

       // depending on some condition controller will call view
        // Busy free controller will call the model..
        controller.updateView();

        //update model data
        controller.setCourseName("Python");
        Log.d("tag","\n After updating, Course Details are as follows");

        controller.updateView();
    }

    private static Model retriveCourseFromDatabase(){

     Model course = new Model();
        course.setName("Java");
        course.setId("01");
        course.setCategory("Programming");
        return course;

    }

}