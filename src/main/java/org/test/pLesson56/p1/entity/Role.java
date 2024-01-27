package org.test.pLesson56.p1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
public class Role {

    @Id
    private int id;

    @OneToMany(mappedBy="role")
    private Set<User> users = new HashSet<>();

    @Column
    private String name;

    public Role() {
    }
}
