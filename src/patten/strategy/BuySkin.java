package patten.strategy;

/**
 * 购买皮肤接口
 */
public interface BuySkin {
    /**
     * 购买皮肤接口
     * @param money 皮肤价格
     * @return 用户打折后皮肤到价格
     */
    double buySkin(double money);
}
