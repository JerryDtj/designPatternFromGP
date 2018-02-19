package patten.strategy;

/**
 * vip1
 */
public class Vip3 implements BuySkin {
    /**
     * vip3 购买皮肤
     * @param money 皮肤价格
     * @return 7折出售
     */
    @Override
    public double buySkin(double money) {
        System.out.println("成为了vip3，花费了"+money*0.7+"元");
        return money*0.7;
    }
}
