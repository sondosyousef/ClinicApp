
package com.example.clinicdepartment;

public class Clinic {
    String id;
    public static final Clinic[] clinics = {

            new Clinic("http://10.0.2.2:84/clinic/readData.php?id=1")

    };


    public Clinic(String id) {
        id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
    }

}
