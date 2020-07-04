public class Bot {

  private String fullName;
  private String address;
  private int age;

  public Bot() {
  }

  public Bot(String gender, String name, String address, int age) {
    this.fullName = name;
    this.address = address;
    this.age = age;
  }

  public String getName() {
    return fullName;
  }

  public void setName(String name) {
    this.fullName = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}