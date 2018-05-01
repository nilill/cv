package com.nilsemil.cv.database;
import com.nilsemil.cv.repository.*;
import org.json.JSONArray;
import org.springframework.stereotype.Component;


@Component
public class Database {

    private final CompletedCourseRepository completedCourseRepository;
    private final EducationRepository educationRepository;
    private final HobbieRepository hobbieRepository;
    private final OngoingCourseRepository ongoingCourseRepository;
    private final UsedTechnologyRepository usedTechnologyRepository;

    private Database(CompletedCourseRepository completedCourseRepository,
                     EducationRepository educationRepository,
                     HobbieRepository hobbieRepository,
                     OngoingCourseRepository ongoingCourseRepository,
                     UsedTechnologyRepository usedTechnologyRepository
    ) {
        this.completedCourseRepository = completedCourseRepository;
        this.educationRepository = educationRepository;
        this.hobbieRepository = hobbieRepository;
        this.ongoingCourseRepository = ongoingCourseRepository;
        this.usedTechnologyRepository = usedTechnologyRepository;
    }


    public JSONArray getCompletedCourses() {
        JSONArray courses = new JSONArray();
        completedCourseRepository
                .findAll()
                .forEach(course -> courses.put(course.toString()));
        return courses;
    }

    public JSONArray getEducation() {
        JSONArray educationArray = new JSONArray();
        educationRepository
                .findAll()
                .forEach(educationItem -> educationArray.put(educationItem.toString()));
        return educationArray;
    }

    public JSONArray getHobbies() {
        JSONArray hobbies = new JSONArray();
        hobbieRepository
                .findAll()
                .forEach(hobbie -> hobbies.put(hobbie.toString()));
        return hobbies;
    }

    public JSONArray getOngoingCourses() {
        JSONArray courses = new JSONArray();
        ongoingCourseRepository
                .findAll()
                .forEach(course -> courses.put(course.toString()));
        return courses;
    }

    public JSONArray getUsedTechnologies() {
        JSONArray usedTechnologies = new JSONArray();
        usedTechnologyRepository
                .findAll()
                .forEach(course -> usedTechnologies.put(course.toString()));
        return usedTechnologies;
    }


}
