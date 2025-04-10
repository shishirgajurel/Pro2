package via.pro2.model;

public class Message
{
  private  Student student;
  private String message;

  public Message(Student student, String message)
  {
    this.student = student;
    this.message = message;
  }

  public Student getStudent()
  {
    return student;
  }

  public void setStudent(Student student)
  {
    this.student = student;
  }

  public String getMessage()
  {
    return message;
  }

  public void setMessage(String message)
  {
    this.message = message;
  }

  @Override public String toString()
  {
    return "Message{" + "student=" + student + ", message='" + message + '\''
        + '}';
  }
}
