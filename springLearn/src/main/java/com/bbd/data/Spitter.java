package com.bbd.data;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Liuweibo
 * @version Id: Spitter.java, v0.1 2017/10/30 Liuweibo Exp $$
 */
public class Spitter {

    private Long id;
    @Size(min = 6, max = 8, message = "firstName必须是{min}到{max}位。")
    private String firstName;
    private String lastName;
    @NotNull(message = "用户名不能为空")
    @NotEmpty(message = "用户名不能为空串")
    private String username;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Spitter{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
    
    