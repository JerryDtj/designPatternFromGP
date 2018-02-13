package patten.proxy.custom;

public class MyZhouxinxin implements MyPersion {
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void findLive() {
        System.out.println("我叫周星星，我的择偶条件如下");
        System.out.println("肤白，貌美，大长腿");
        System.out.println("温柔，体贴");
    }

    public MyZhouxinxin() {
        this.name = "周星星";
        this.sex = "男";
    }
}
