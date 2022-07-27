package day1;

import java.util.Comparator;

public class DescriptionCompare implements Comparator<Course>{

    @Override
    public int compare(Course o1, Course o2) {
        // if (o1.getDescription() == o2.getDescription()) {
        //     // if(o1.getName()==o2.getName()) {
        //     // if (o1.getDescription()) {

        //     // }
        //     // }
        //     return 0;
        // } else if (o1.getDescription().getContent() > o2.getDescription().getContent()) {
        //     return 1;
        // } else {
        //     return -1;
        // }

        return o1.getDescription().getContent().compareTo(o2.getDescription().getContent());
    }
    
}
