package jcourse.pluralsight.service;

import jcourse.pluralsight.model.Speaker;
import jcourse.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import jcourse.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

}
