package com.sathya.mvc_raw.mvc;

public class Contoller {

    private Model model;
    private View  view;

    public Contoller(Model model, View view) {
        this.model = model;
        this.view = view;
    }



    public void setCourseName(String name){
        model.setName(name);
    }

    public String getCourseName(){
        return model.getName();
    }

    public void setCourseId(String id){
        model.setId(id);
    }

    public String getCourseId(){
        return model.getId();
    }

    public void setCourseCategory(String category){
        model.setCategory(category);
    }

    public String getCourseCategory(){
        return model.getCategory();
    }

    public void updateView(){

        view.printCourseDetails(model.getName(), model.getId(), model.getCategory());
    }
}


