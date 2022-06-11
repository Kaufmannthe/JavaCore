package by.tmstasks.stream_api.map.tms;

import java.util.List;

public class People {
    private String name;
    private int age;
    private Gender gender;
    private List<Hobby> hobbies;

    public People(String name, int age, Gender gender, List<Hobby> hobbies) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobbies = hobbies;
    }

    public People() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    public boolean isConteins(People p){
        boolean b=false;
        if(p.getName().toLowerCase().contains("a")&&!p.getName().toLowerCase().contains("b")){
            b=true;
        }
        return b;
    }
    @Override
    public String toString() {
        return getName() + getHobbies();
    }
}
