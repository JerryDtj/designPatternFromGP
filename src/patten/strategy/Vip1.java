package patten.strategy;

/**
 * vip1
 */
public class Vip1 implements BuySkin {
    /**
     * vip1 购买皮肤
     * @param money 皮肤价格
     * @return 9折出售
     */
    @Override
    public double buySkin(double money) {
        System.out.println("成为了vip1，花费了"+money*0.9+"元");
        return money*0.9;
    }
}
