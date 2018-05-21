package ws;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String nickname;
    private int age;
    private String address;



    //TODO: 1 add 5 more fields (5 marks)
    //TODO: 2 add getters and setters for the fields (5 marks)

    public Customer() {}

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public int getAge() { return age; }
    public void setAge(int age) {
        this.age = age;
    }


    public String getAddress() { return address; }
    public void setAddress(String address) {
        this.address = address;
    }




    @Override
    public String toString() {
        return String.format("Customer [id=%s,name=%s,nick=%s,age=%s,address=%s]", id, name,nickname,age,address);
    }
}
