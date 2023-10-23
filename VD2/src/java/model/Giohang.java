/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class Giohang {
    private TreeMap<sanpham , Integer> list;
    private long cartID;

    public Giohang() {
        list = new TreeMap<>();
        cartID = System.currentTimeMillis();
    }

    public Giohang(TreeMap<sanpham, Integer> list, long cartID) {
        this.list = list;
        this.cartID = cartID;
    }

    public TreeMap<sanpham, Integer> getList() {
        return list;
    }

    public void setList(TreeMap<sanpham, Integer> list) {
        this.list = list;
    }

    public long getCartID() {
        return cartID;
    }

    public void setCartID(long cartID) {
        this.cartID = cartID;
    }
    public void AddTocart(sanpham sp,int soluong){
        boolean bln = list.containsKey(sp);
        if(bln){
            int sl = list.get(sp);
            soluong +=sl;
            list.put(sp, soluong);
        }
        else{
            list.put(sp, soluong);
        }
    }
    public void SubTocart(sanpham sp, int soluong){
        boolean bln = list.containsKey(sp);
        if(bln){
            int sl = list.get(sp);
            soluong = sl - soluong;
            if(soluong <= 0){
                list.remove(sp);
            }
            else{
                list.remove(sp);
                list.put(sp, soluong);
                    }
        }
    }
    public void RemoveTocart(sanpham sp){
         boolean bln = list.containsKey(sp);
         if(bln){
             list.remove(sp);
         }
    }
}
