package com.jack.pattern.proxy;

/**
 * @author geqiang
 * @date 2018/1/16
 **/
public class Food {
    private String chicken;
    private String spicy;
    private String noodle;
    private String salt;
    private String pepper;

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public String getSpicy() {
        return spicy;
    }

    public void setSpicy(String spicy) {
        this.spicy = spicy;
    }

    public String getNoodle() {
        return noodle;
    }

    public void setNoodle(String noodle) {
        this.noodle = noodle;
    }

    public String getSalt() {
        return salt;
    }
    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void addCondiment(String pepper) {
        this.pepper=pepper;
    }
}
