package com.sathya.mvc_raw.mvc;

import android.util.Log;

public class View {
    public void printCourseDetails(String CourseName, String CourseId, String CourseCategory){
        Log.d("tag","Course Details: ");
        Log.d("tag","Name: " + CourseName);
        Log.d("tag","Course ID: " + CourseId);
        Log.d("tag","Course Category: " + CourseCategory);
    }
}
