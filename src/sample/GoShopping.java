package sample;

public class GoShopping {
    public static void main(String[] args){
        Market market = new WallMarket();
        market.name = "沃尔沃";
        market.goods = "七匹狼西服";
        market.shop();
        market = new TaoBaoMarket();
        market.name = "淘宝";
        market.goods = "韩都衣舍花裙";
        market.shop();
    }
}