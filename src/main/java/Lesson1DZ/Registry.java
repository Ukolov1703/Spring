package Lesson1DZ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("registry")
public class Registry {
    private Doctor doctor;

    public Doctor getDoctor(){ 
        return doctor;
    }

    @Autowired
    public void setDoctor(Doctor doctor){
        this.doctor = doctor;
    }

    public void searchCabinet(){
        System.out.println("Your doctor is in...");
        doctor.cabinet();
    }
}
