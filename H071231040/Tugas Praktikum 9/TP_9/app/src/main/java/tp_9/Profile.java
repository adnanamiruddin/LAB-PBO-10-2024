package tp_9;

public class Profile {
    private String name;
    private String nim;
    private String age;
    private String major;

    
    public Profile(String name, String nim, String age, String major) {
        this.name = name;
        this.nim = nim;
        this.age = age;
        this.major = major;
    }
    
    public String getName() {return name;}
    public String getNim() {return nim;}
    public String getAge() {return age;}
    public String getMajor() {return major;}
}
