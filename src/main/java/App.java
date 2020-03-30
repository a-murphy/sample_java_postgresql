package main;

public class App {
  String city = "";
  String state = "";

  public App() throws Exception{
  }
  
  public void insertData() {
    city = "Seattle";
    state = "WA";
  }

  public String getData() {
    return city + ", " + state;
  }
}
