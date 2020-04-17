package jcourse.pluralsight.repository;

import jcourse.pluralsight.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
