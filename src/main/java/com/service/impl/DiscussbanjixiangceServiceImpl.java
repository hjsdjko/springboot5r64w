package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussbanjixiangceDao;
import com.entity.DiscussbanjixiangceEntity;
import com.service.DiscussbanjixiangceService;
import com.entity.vo.DiscussbanjixiangceVO;
import com.entity.view.DiscussbanjixiangceView;

@Service("discussbanjixiangceService")
public class DiscussbanjixiangceServiceImpl extends ServiceImpl<DiscussbanjixiangceDao, DiscussbanjixiangceEntity> implements DiscussbanjixiangceService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbanjixiangceEntity> page = this.selectPage(
                new Query<DiscussbanjixiangceEntity>(params).getPage(),
                new EntityWrapper<DiscussbanjixiangceEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbanjixiangceEntity> wrapper) {
		  Page<DiscussbanjixiangceView> page =new Query<DiscussbanjixiangceView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbanjixiangceVO> selectListVO(Wrapper<DiscussbanjixiangceEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbanjixiangceVO selectVO(Wrapper<DiscussbanjixiangceEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbanjixiangceView> selectListView(Wrapper<DiscussbanjixiangceEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbanjixiangceView selectView(Wrapper<DiscussbanjixiangceEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
