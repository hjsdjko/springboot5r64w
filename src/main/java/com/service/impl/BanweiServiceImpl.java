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


import com.dao.BanweiDao;
import com.entity.BanweiEntity;
import com.service.BanweiService;
import com.entity.vo.BanweiVO;
import com.entity.view.BanweiView;

@Service("banweiService")
public class BanweiServiceImpl extends ServiceImpl<BanweiDao, BanweiEntity> implements BanweiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanweiEntity> page = this.selectPage(
                new Query<BanweiEntity>(params).getPage(),
                new EntityWrapper<BanweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanweiEntity> wrapper) {
		  Page<BanweiView> page =new Query<BanweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanweiVO> selectListVO(Wrapper<BanweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanweiVO selectVO(Wrapper<BanweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanweiView> selectListView(Wrapper<BanweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanweiView selectView(Wrapper<BanweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
