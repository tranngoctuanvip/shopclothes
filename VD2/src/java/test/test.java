/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.DanhMucDao;
import dao.DanhMucDaoImpt;
import dao.TaiKhoanDaoImpt;
import dao.productDaoImpt;
import tools.mahoa;

/**
 *
 * @author Admin
 */
public class test {
    public static void main(String[] args) {
        DanhMucDaoImpt dm =new DanhMucDaoImpt();
        productDaoImpt ps = new productDaoImpt();
       // System.out.println(ps.getListProductByCartegory("2").size());
        System.out.println(ps.getChitietsanpham("10").getTen_san_pham());
    }
}
