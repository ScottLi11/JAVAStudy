package cn.e3.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.mapper.TbItemMapper;
import cn.e3.pojo.TbItem;

@Service
public class ItemServiceImpl implements ItemService {
	
	//注入商品mapper接口代理对象
	@Autowired
	private TbItemMapper itemMapper;
	
	/**
	 * 需求:根据商品id查询商品
	 * 参数:Long itemId
	 * 返回值:TbItem
	 */
	
	@Override
	public TbItem findItemByID(Long itemId) {
		
		//根据商品id查询商品
		
		TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
		
		return tbItem;
		
	}

}
