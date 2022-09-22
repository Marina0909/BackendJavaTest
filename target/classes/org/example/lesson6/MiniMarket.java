package org.example.lesson6;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.db.dao.CategoriesMapper;
import org.example.db.dao.ProductsMapper;
import org.example.db.model.Categories;
import org.example.db.model.Products;

import java.io.IOException;

public class MiniMarket {
    public static void main(String[] args) throws IOException {
            //SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
            //    .build(Resources.getResourceAsStream("myBatisConfig.xml"));

        //try (SqlSession session = sessionFactory.openSession()) {

           // ProductsMapper productsMapper = session.getMapper(ProductsMapper.class);
          // CategoriesMapper categoriesMapper = session.getMapper(CategoriesMapper.class);
          //  Products product = productsMapper.selectByPrimaryKey(1246L);
           // System.out.println(product);
          //  Categories category = categoriesMapper.selectByPrimaryKey(product.getCategoryId());
         //   System.out.println(category);
       // }
    }

}
