package com.nilsemil.cv;

import com.nilsemil.cv.repository.ParagraphTitleRepository;
import com.nilsemil.cv.entity.ParagraphTitles;
import com.nilsemil.cv.entity.CompletedCourse;
import com.nilsemil.cv.repository.CompletedCourseRepository;
import com.nilsemil.cv.entity.Education;
import com.nilsemil.cv.repository.EducationRepository;
import com.nilsemil.cv.entity.Hobbie;
import com.nilsemil.cv.repository.HobbieRepository;
import com.nilsemil.cv.entity.OngoingCourse;
import com.nilsemil.cv.repository.OngoingCourseRepository;
import com.nilsemil.cv.entity.UsedTechnology;
import com.nilsemil.cv.repository.UsedTechnologyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CvApplication {

    private static final Logger log = LoggerFactory.getLogger(CvApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CvApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(HobbieRepository hobbieRepository,
                                  CompletedCourseRepository completedCourseRepository,
                                  OngoingCourseRepository ongoingCourseRepository,
                                  UsedTechnologyRepository usedTechnologyRepository,
                                  EducationRepository educationRepository,
                                  ParagraphTitleRepository paragraphTitleRepository) {
        return (args) -> {

            hobbieRepository.save(new Hobbie("Mootorratastega sõitmine.", "et"));
            hobbieRepository.save(new Hobbie("Elegantse koodi kirjutamine.", "et"));
            hobbieRepository.save(new Hobbie("Seriaalide vaatamine(Lucifer, Game of Thrones, The Big Bang Theory, Brookly Nine-Nine, Vikings, Legion jne)", "et"));

            hobbieRepository.save(new Hobbie("Riding motorcycles.", "en"));
            hobbieRepository.save(new Hobbie("Writing sleek and elegant code.", "en"));
            hobbieRepository.save(new Hobbie("Watcing series(Lucifer, Game of Thrones, The Big Bang Theory, Brookly Nine-Nine, Vikings, Legion etc)", "en"));

            educationRepository.save(new Education("Kadrina Keskkool, keskharidus", 2003, "2015", "et"));
            educationRepository.save(new Education("Tallinna Tehnikaülikool, informaatika, bakalaureus", 2003, "praegu", "et"));

            educationRepository.save(new Education("Kadrina Secondary School, secondary education", 2003, "2015", "en"));
            educationRepository.save(new Education("Tallinn University of Technology, informatics, BA", 2016, "now", "en"));

            ongoingCourseRepository.save(new OngoingCourse("Tarkvaratehnika (Full stack rakenduse arendamine Spring Boot REST API + Vue.js front-end)",  "et"));
            ongoingCourseRepository.save(new OngoingCourse("Operatsioonisüsteemid ja arvutivõrkude administreerimine",  "et") );
            ongoingCourseRepository.save(new OngoingCourse("Andmebaasid I",  "et"));
            ongoingCourseRepository.save(new OngoingCourse("Tarkvaraarenduse meeskonnaprojekt",  "et"));

            ongoingCourseRepository.save(new OngoingCourse("Software Engineering (Full stack applicationn development Spring Boot REST API + Vue.js front-end)",  "en"));
            ongoingCourseRepository.save(new OngoingCourse("Operating Systems and Network Administrating",  "en") );
            ongoingCourseRepository.save(new OngoingCourse("Databases I",  "en"));
            ongoingCourseRepository.save(new OngoingCourse("Team Project of Software Development",  "en"));

            completedCourseRepository.save(new CompletedCourse("Programmeerimise algkursus",  5,"et", "Algoritmimise alused, baasteadmised programmeerimisest. Oskus kasutada programmide peamisi silumisvahendeid. Oskus kasutada valmis tarkvara komponente"));
            completedCourseRepository.save(new CompletedCourse("Arvutivõrgud",  4,"et", "Teoreetilised baasteadmised arvutivõrkude arhitektuuridest, erinevatest protokollidest, lokaal- ja kaugvõrkudest, võrkude töökindlusest ja turvalisususest. Praktiline kogemus võrkude seadistamises, töökindluse ja turvalisuse tagamises") );
            completedCourseRepository.save(new CompletedCourse("Programmeerimise põhikursus Javas",  4,"et", "Programmeerimise alused, keelekonstruktsioonid ja mustrid Java-s, programmeerimis- ja rakendusraamistikud ning taaskasutatavus, moodultestimine"));
            completedCourseRepository.save(new CompletedCourse("Objektorienteeritud programmeerimine keeles Java",  5,"et", "Objekorienteeritud progemise olemus. Java programmeerimiskeel. JVM. Polümorfism. Erindid. SOLID printsiibid. Lambad ja funktsionaalsed liidesed. Vood. Mitmelõimeline progemine. Disainimustrid. Java raamistikud. OOP printsiipide rakendamine"));
            completedCourseRepository.save(new CompletedCourse("Võrgurakendused I",  5,"et", "Veebirakenduste loomine: klient ja server. Html-i kirjutamise oskus, esmane tutvus CSS-i ja javascriptiga. Serveripoolse rakenduse kirjutamise põhimõtted, cgi, php ja python. Lihtsamad SQLi kasutamise oskused"));
            completedCourseRepository.save(new CompletedCourse("Automaattestimine",  5,"et", "Test Driven Development, testkoodi disain, puhas kood ja refaktoreerimine, silumine, sõltuvuste haldamine, Mockito raamistik, automaattestimise mustrid ja võtted, Java EE rakenduste testimine"));


            completedCourseRepository.save(new CompletedCourse("Introduction to Programming",  5,"en", "Acquires the foundations of algoritming. Acquires basic knowledges of programming. Can use main debugging tools. Can use existing software components"));
            completedCourseRepository.save(new CompletedCourse("Computer Networks",  4,"en", "Basic theoretical knowledge on computer networks architectures, different protocols, local & wide area networks, methods for network reliability. Practical knowledge and skills to set up computer networks and guarantee their reliability and security") );
            completedCourseRepository.save(new CompletedCourse("Main Course of Programming in Java",  4,"en", "Fundamentals of programming, language constructs and patterns in Java, programming- and application frameworks and reusability, unit testing"));
            completedCourseRepository.save(new CompletedCourse("Object-oriented Programming in the Java Language",  5,"en", "Essence of object oriented programming, Java programming language, JVM, polymorhpism, exceptions, SOLID principles, lambdas and functional interfaces, streams, multithreaded programming, design patterns, Java frameworks"));
            completedCourseRepository.save(new CompletedCourse("Network Applications I",  5,"en", "Creating web applications: client and server. Writing html, introduction to CSS and javascript. Principles of writing server applications, cgi, php and python. Simple SQL queries"));
            completedCourseRepository.save(new CompletedCourse("Automated Testing",  4,"en", "Test Driven Development, the design on test code, clean code and refactoring, debugging, automated testing in practice, dependency management, the Mockito framework, the patterns for writing automated tests, testing Java EE applications ") );

            usedTechnologyRepository.save(new UsedTechnology("Java", "I have completed two courses in Java and feel very confident programming in Java.", "en"));
            usedTechnologyRepository.save(new UsedTechnology("PHP", "I have done a mini-reddit in PHP that was required in a course I attended, it can be seen on the following url: http://dijkstra.cs.ttu.ee/~nilill/prax4/#", "en") );
            usedTechnologyRepository.save(new UsedTechnology("Vue.js", "This CV's front-end is done with Vue.js but furthermore I am currently working on two applications: one similar to Kahoot.io and the other one to Toggl + Trello.", "en"));
            usedTechnologyRepository.save(new UsedTechnology("Python", "Python was my very first programming language where I learned to code.", "en"));
            usedTechnologyRepository.save(new UsedTechnology("Spring Boot", "This CV uses Spring Boot REST API and I am currently working on Spring Boot application in Software engineering course", "en"));
            usedTechnologyRepository.save(new UsedTechnology("HTML/CSS/Javascript", "I always try to make everything responsive and as simple as possible. I have strong basic knowledge.", "en"));

            usedTechnologyRepository.save(new UsedTechnology("Java", "Javas olen läbinud mitu kursust ja tunnen end objektorienteeritud programeerimises väga kindlalt.", "et"));
            usedTechnologyRepository.save(new UsedTechnology("PHP", "PHPs olen ühe aine raames teinud mini-redditi, mida saab näha siit: http://dijkstra.cs.ttu.ee/~nilill/prax4/#", "et") );
            usedTechnologyRepository.save(new UsedTechnology("Vue.js", "Vue.js-ga on tehtud seesama CV, kuid arendan  Vue.js-ga kahe aine raames meeskonnaga Kahoot.io sarnast rakendust ja ka Toggl + Trello hübriidi sarnast rakendust.", "et"));
            usedTechnologyRepository.save(new UsedTechnology("Python", "Python oli minu kõige esimene programeerimiskeel, millest sai minu programeerimishuvi alguse.", "et"));
            usedTechnologyRepository.save(new UsedTechnology("Spring Boot", "Spring Booti kasutab see CV, kuid kooli aine raames arendan ka teist rakendust, mis kasutab Spring Booti backendina.", "et"));
            usedTechnologyRepository.save(new UsedTechnology("HTML/CSS/Javascript", "Ma üritan kõike teha mobiilse kasutuse toega. Tugevad baasteadmised.", "et"));
            usedTechnologyRepository.save(new UsedTechnology("SQL", "desc", "Hetkel olen läbimas Andmebaasid I ainet, seega põhioskused SQL-is on olemas."));

            paragraphTitleRepository.save(new ParagraphTitles("Completed courses",
                    "Ongoing Courses",
                    "Technologies I Have Used",
                    "Hobbies",
                    "How I Made This Page",
                    "Contact",
                    "en"));

            paragraphTitleRepository.save(new ParagraphTitles("Läbitud kursused",
                    "Hetkel läbitavad kursused",
                    "Tehnoloogiad, mida olen kasutanud",
                    "Hobid",
                    "Kuidas ma tegin selle lehekülje?",
                    "Kontakt",
                    "et"));
        };
    }
}
