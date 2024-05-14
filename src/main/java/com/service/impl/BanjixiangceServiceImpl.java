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


import com.dao.BanjixiangceDao;
import com.entity.BanjixiangceEntity;
import com.service.BanjixiangceService;
import com.entity.vo.BanjixiangceVO;
import com.entity.view.BanjixiangceView;

@Service("banjixiangceService")
public class BanjixiangceServiceImpl extends ServiceImpl<BanjixiangceDao, BanjixiangceEntity> implements BanjixiangceService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanjixiangceEntity> page = this.selectPage(
                new Query<BanjixiangceEntity>(params).getPage(),
                new EntityWrapper<BanjixiangceEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanjixiangceEntity> wrapper) {
		  Page<BanjixiangceView> page =new Query<BanjixiangceView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanjixiangceVO> selectListVO(Wrapper<BanjixiangceEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanjixiangceVO selectVO(Wrapper<BanjixiangceEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanjixiangceView> selectListView(Wrapper<BanjixiangceEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanjixiangceView selectView(Wrapper<BanjixiangceEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
