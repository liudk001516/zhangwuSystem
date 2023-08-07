package cn.yunhe.enity;

public class Account {

    private int id;
    private String cname;
    private double money;
    private String payType;
    private String createTime;
    private String description;

    public Account(int id, String cname, double money, String payType, String createTime, String description) {
        this.id = id;
        this.cname = cname;
        this.money = money;
        this.payType = payType;
        this.createTime = createTime;
        this.description = description;
    }

    public Account() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", money=" + money +
                ", payType='" + payType + '\'' +
                ", createTime='" + createTime + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
