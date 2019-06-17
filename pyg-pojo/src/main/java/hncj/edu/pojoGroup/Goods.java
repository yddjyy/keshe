package hncj.edu.pojoGroup;


import hncj.edu.pojo.TbGoods;
import hncj.edu.pojo.TbGoodsDesc;
import hncj.edu.pojo.TbItem;

import java.io.Serializable;
import java.util.List;

/**
 * 商品组合实体类
 */
public class Goods implements Serializable {
    //商品spu信息
    private TbGoods goods;
    //商品spu扩展信息
    private TbGoodsDesc goodsDesc;
    //商品sku列表
    private List<TbItem> itemList;

    public List<TbItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<TbItem> itemList) {
        this.itemList = itemList;
    }

    public TbGoods getGoods() {
        return goods;
    }

    public void setGoods(TbGoods goods) {
        this.goods = goods;
    }

    public TbGoodsDesc getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(TbGoodsDesc goodsDesc) {
        this.goodsDesc = goodsDesc;
    }
}
