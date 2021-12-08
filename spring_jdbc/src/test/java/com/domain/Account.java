package com.domain;

/**
 * @author wangguanru
 * @date 2021-11-25
 */
public class Account {
    private String name;
    private String money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", money='" + money + '\'' +
                '}';
    }

}
