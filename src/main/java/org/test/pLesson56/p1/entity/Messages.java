package org.test.pLesson56.p1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "messages_big")
@Getter
@Setter
public class Messages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany
    @JoinTable(name = "user_messages", joinColumns={@JoinColumn(name = "user_id")}, inverseJoinColumns={@JoinColumn(name = "message_id")})
    private Set<User> userSet = new HashSet<>();

    public Messages() {
    }


}
