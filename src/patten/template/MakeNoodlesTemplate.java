package patten.template;

/**
 * 模版模式
 */
public abstract class MakeNoodlesTemplate {

    public final void make(){
        //1.买面条
        this.buyNoodles();
        //2.下面条
        this.makeNoodles();
        //3.吃面条
        this.eatNoodles();
    }

    private void eatNoodles() {
        System.out.println("面条做好了，开始吃。");
    }

    protected abstract void makeNoodles();

    public void buyNoodles(){
        System.out.println("买好面条了。");
    }

}
