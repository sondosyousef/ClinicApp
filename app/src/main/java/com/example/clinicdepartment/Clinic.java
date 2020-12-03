package com.example.clinicdepartment;

public class Clinic {
    String Category;
    public static final Clinic[] clinics = {
            new Clinic("http://10.0.2.2:84/clinic/readData.php?id=1")

    };


    public Clinic(String category) {
        Category = category;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

}
