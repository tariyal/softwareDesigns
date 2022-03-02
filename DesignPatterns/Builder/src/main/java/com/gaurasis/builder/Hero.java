package com.gaurasis.builder;


public class Hero {

    private String name;
    private String profession;
    private String hairColor;
    private String weapon;
    public Hero(Builder builder){
        this.name = builder.name;
        this.profession  = builder.profession;
        this.hairColor = builder.hairColor;
        this.weapon = builder.weapon;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public static class Builder{
        private String name;
        private String profession;
        private String hairColor;
        private String weapon;
        public Builder(){};

        public Builder withName(String name) {
            this.name = name;
            return this;
        }
        public Builder withProfession(String profession){
            this.profession = profession;
            return this;
        }
        public Builder withWeapon(String weapon){
            this.weapon = weapon;
            return this;
        }
        public Builder withHairColor(String color){
            this.hairColor = color;
            return this;
        }
        public Hero build(){
            return new Hero(this);
        }
    }

}
