package patten.strategy;

/**
 * 普通用户
 */
public class Consumer implements BuySkin {
    /**
     * 购买皮肤
     * @param money 皮肤价格
     * @return 原始价格
     */
    @Override
    public double buySkin(double money) {
        return money;
    }
}
