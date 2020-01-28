package dev.falcer.restbasic.data.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String title;
    @Column
    private boolean done = false;
}
