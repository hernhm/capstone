package website.lifo.capstone.bcs.dao;

import java.util.List;

import website.lifo.capstone.bcs.model.CartInfo;
import website.lifo.capstone.bcs.model.OrderDetailInfo;
import website.lifo.capstone.bcs.model.OrderInfo;
import website.lifo.capstone.bcs.model.PagingResult;

public interface OrderDAO {

    public void saveOrder(CartInfo cartInfo);

    public PagingResult<OrderInfo> listOrderInfo(int page,int maxResult, int maxNavigationPage);

    public OrderInfo getOrderInfo(String orderId);

    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}