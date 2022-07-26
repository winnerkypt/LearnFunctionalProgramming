
package day1;

public class Course implements Comparable<Course> {
    private int id;
    private static int next;
    private String name;
    private double credit;
    private Text description;

    public Course(String name,double credit,String description) {
        this.id = next++;
        this.name = name;
        this.credit = credit;
        this.description = new Text(description);
    }
public boolean lessThanThree(){
  return  this.credit < 3 ; 
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public Text getDescription() {
        return description;
    }

    public void setDescription(Text description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", name=" + name + ", credit=" + credit + ", description=" + description + '}';
    }

    @Override
    public int compareTo(Course o) {
     return this.name.compareTo(o.name);
    }
}
