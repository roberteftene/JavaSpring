package jcourse.pluralsight.service;

import jcourse.pluralsight.model.Speaker;
import jcourse.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import jcourse.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public SpeakerServiceImpl() {
        System.out.println("Speaker Service no param constructor");
    }

    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("Speaker service constructor");
        this.repository = repository;
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerService setter");
        this.repository = repository;
    }
}
