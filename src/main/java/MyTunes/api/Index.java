package MyTunes.api;

import java.util.List;

/**
 * Created by Dillan on 4/23/2015.
 */
public class Index
{
    @Autowired
    private CourseService service;
    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String Index()
    {
        return "This is a Home Page";
    }

    @RequestMapping(value = "/course",method = RequestMethod.GET)
    public Course getCourse(){
        Course couse = new Course.Builder("12345")
                .name("National Diploma IT").offering(2015).build();

        return couse;
    }

    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public List<Course> getCourses(){


        return service.getCourses();
    }
}
