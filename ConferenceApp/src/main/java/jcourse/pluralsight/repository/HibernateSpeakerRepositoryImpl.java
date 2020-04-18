package jcourse.pluralsight.repository;

import jcourse.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Qualifier("cal")
    @Autowired
    private Calendar cal;

    @Override
    public List<Speaker> findAll()  {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Robert");
        speaker.setLastName("Eftene");

        System.out.println("cal: " + cal.getTime());
        speakers.add(speaker);

        return speakers;
    }

}
