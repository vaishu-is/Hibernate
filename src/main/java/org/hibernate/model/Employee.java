package org.hibernate.model;

import jakarta.persistence.*;
import lombok.*;

@Entity

@Table

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter @Setter
    private int id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private double salary;;
    @Getter @Setter
    private String address;


}
