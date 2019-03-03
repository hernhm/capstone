package website.lifo.capstone.bcs.dao;

import website.lifo.capstone.bcs.entity.Product;
import website.lifo.capstone.bcs.model.PagingResult;
import website.lifo.capstone.bcs.model.ProductInfo;

public interface ProductDAO {



    public Product findProduct(String code);

    public ProductInfo findProductInfo(String code) ;


    public PagingResult<ProductInfo> queryProducts(int page,int maxResult, int maxNavigationPage  );

    public PagingResult<ProductInfo> queryProducts(int page, int maxResult,int maxNavigationPage, String likeName);

    public void save(ProductInfo productInfo);

}
