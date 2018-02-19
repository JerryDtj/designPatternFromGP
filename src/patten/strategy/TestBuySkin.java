package patten.strategy;

/**
 * 策略模式：算法的不同，结果相同
 * 王者荣耀分成4种玩家：普通玩家（player），vip1，vip2，vip3
 * 针对不同类别的玩家，购买《王者农药》皮肤有不同的打折方式：普通玩家全价购买，vip1九折购买，vip2八折购买，vip3七折购买，并且一个顾客每消费10000就增加一个级别
 */
public class TestBuySkin {
    public static void main(String[] args) {
        Player player = new Player();
        player.buySkin(100);
        for (int i=0;i<7;i++){
            player.buySkin(1000);
        }
    }
}
