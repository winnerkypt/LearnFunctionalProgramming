package day1;

import java.util.Comparator;

public class CreditCompare implements Comparator<Course> {

    @Override
    public int compare(Course o1, Course o2) {
        if (o1.getCredit() == o2.getCredit()) {
            // if(o1.getName()==o2.getName()) {
            // if (o1.getDescription()) {

            // }
            // }
            return 0;
        } else if (o1.getCredit() > o2.getCredit()) {
            return 1;
        } else {
            return -1;
        }
    }

}
