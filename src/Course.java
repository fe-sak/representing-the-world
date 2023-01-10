public class Course {
  private String name;
  private String Description;
  private Lesson[] lessons;
  private Teacher teacher;

  Course(Lesson[] lessons, Teacher teacher){
    this.lessons = lessons;
    this.teacher = teacher;
  }

  void registerUser(User user){}

  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }

  public void setDescription(String description) {
    Description = description;
  }
  public String getDescription() {
    return Description;
  }

  public void setLessons(Lesson[] lessons) {
    this.lessons = lessons;
  }
  public Lesson[] getLessons() {
    return lessons;
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }

  public Teacher getTeacher() {
    return teacher;
  }
}