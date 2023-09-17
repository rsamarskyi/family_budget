package com.example.michaeltraining.user;

import com.example.michaeltraining.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    private String name;
    private String surname;
    private Long age;
    private GenderType gender;
}
