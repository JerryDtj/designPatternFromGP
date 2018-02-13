package patten.proxy;

public class Zhouxinxin implements Persion {
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

    @Override
    public void findLive() {
        System.out.println("我叫周星星，我的择偶条件如下");
        System.out.println("肤白，貌美，大长腿");
        System.out.println("温柔，体贴");
    }

    public Zhouxinxin(){
        this.name="周星星";
        this.sex="男";
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
