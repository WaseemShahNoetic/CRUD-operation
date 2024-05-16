package com.example.CRUDoperation.entity;

import jakarta.persistence.*;
import lombok.*;
import org.mockito.Mock;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emp_user")
public class UserEntity {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long Id;
    @Column(name = "name")
    String name;
    @Column(name = "email")
    String email;
    @Column(name = "designation")
    String designation;


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


//    public static Builder builder() {
//        return new Builder();
//    }
//
//    public static class Builder extends UserEntity {
//        private String name;
//        private String email;
//        private String designation;
//
//        public Builder name(String name) {
//            this.name = name;
//            return this;
//        }
//
//        public Builder email(String email) {
//            this.email = email;
//            return this;
//        }
//
//        public Builder designation(String designation) {
//            this.designation = designation;
//            return this;
//        }
//
//        public UserEntity build() {
//            UserEntity userEntity = new UserEntity();
//            userEntity.name = this.name;
//            userEntity.email = this.email;
//            userEntity.designation = this.designation;
//            return userEntity;
//        }
//    }

}
