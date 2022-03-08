package com.yjxxt.bean;

import java.util.*;

public class User {
    private String msg;
    private Integer age;

    private String[] hobby;

    private List<Phone> plist=new ArrayList<Phone>();

    private Set<Phone> phones=new HashSet<Phone>();

    private Map<String,Phone> map=new HashMap<String,Phone>();

    public User() {
        phones.add(new Phone());
        phones.add(new Phone());
        phones.add(new Phone());
    }


    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Phone> getPlist() {
        return plist;
    }

    public Set<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }

    public Map<String, Phone> getMap() {
        return map;
    }

    public void setMap(Map<String, Phone> map) {
        this.map = map;
    }

    public void setPlist(List<Phone> plist) {
        this.plist = plist;
    }

    @Override
    public String toString() {
        return "User{" +
                "msg='" + msg + '\'' +
                ", age=" + age +
                ", hobby=" + Arrays.toString(hobby) +
                ", plist=" + plist +
                ", phones=" + phones +
                ", map=" + map +
                '}';
    }
}
