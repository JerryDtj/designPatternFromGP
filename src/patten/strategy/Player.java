package patten.strategy;

public class Player {
    private static double totalMoney=0D;


    public void buySkin(double pice){
        System.out.println(totalMoney);
        BuySkin buySkin = null;
        if (totalMoney>=0&&totalMoney<=1000){
            buySkin = new Consumer();
        }else if (totalMoney>1000&&totalMoney<=2000){
            buySkin = new Vip1();
        }else if (totalMoney>2000&&totalMoney<=3000){
            buySkin = new Vip2();
        }else if (totalMoney>3000){
            buySkin = new Vip3();
        }
        if (null!=buySkin){
            double costMoney = buySkin.buySkin(pice);
            totalMoney+=costMoney;
        }
    }

}
