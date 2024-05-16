//package com.example.CRUDoperation.entity;
//
//import lombok.Builder;
//
//@Builder
//public class BuilderEntity extends UserEntity{
//
//
//    private String name;
//    private String email;
//    private String designation;
//
//        public static Builder builder() {
//        return new Builder();
//    }
//
//    public BuilderEntity name(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public BuilderEntity email(String email) {
//        this.email = email;
//        return this;
//    }
//
//    public BuilderEntity designation(String designation) {
//        this.designation = designation;
//        return this;
//    }
//
//    public UserEntity build() {
//        UserEntity userEntity = new UserEntity();
//        userEntity.setName(this.name);
//        userEntity.setEmail(this.email);
//        userEntity.setDesignation(this.designation);
//        return userEntity;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getDesignation() {
//        return designation;
//    }
//
//    public void setDesignation(String designation) {
//        this.designation = designation;
//    }
//
//    //    private String name;
////    private String email;
////    private String designation;
////
////    public static Builder builder() {
////        return new Builder();
////    }
////
////
////    public Builder name(String name) {
////        this.name = name;
////        return (Builder) this;
////    }
////
////    public Builder email(String email) {
////        this.email = email;
////        return (Builder) this;
////    }
////
////    public Builder designation(String designation) {
////        this.designation = designation;
////        return (Builder) this;
////    }
////
////    public build() {
////        UserEntity userEntity = new UserEntity();
////        userEntity.name = this.name;
////        userEntity.email = this.email;
////        userEntity.designation = this.designation;
////        return userEntity;
////    }
////
////    public String getName() {
////        return name;
////    }
////
////    public void setName(String name) {
////        this.name = name;
////    }
////
////    public String getEmail() {
////        return email;
////    }
////
////    public void setEmail(String email) {
////        this.email = email;
////    }
////
////    public String getDesignation() {
////        return designation;
////    }
////
////    public void setDesignation(String designation) {
////        this.designation = designation;
////    }
//}
