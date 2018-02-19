package patten.strategy;

/**
 * vip1
 */
public class Vip2 implements BuySkin {
    /**
     * vip2 购买皮肤
     * @param money 皮肤价格
     * @return 8折出售
     */
    @Override
    public double buySkin(double money) {
        System.out.println("成为了vip2，花费了"+money*0.8+"元");
        return money*0.8;
    }
}
