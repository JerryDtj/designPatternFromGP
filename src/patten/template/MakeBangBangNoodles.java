package patten.template;

/**
 * 模版模式：
 * 适用于：执行流程固定，但中间有些步骤有细微差别的方法
 */
public class MakeBangBangNoodles extends MakeNoodlesTemplate {
    @Override
    protected void makeNoodles() {
        System.out.println("开始做梆梆面");
    }
}
