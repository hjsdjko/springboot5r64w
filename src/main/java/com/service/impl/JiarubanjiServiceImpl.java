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


import com.dao.JiarubanjiDao;
import com.entity.JiarubanjiEntity;
import com.service.JiarubanjiService;
import com.entity.vo.JiarubanjiVO;
import com.entity.view.JiarubanjiView;

@Service("jiarubanjiService")
public class JiarubanjiServiceImpl extends ServiceImpl<JiarubanjiDao, JiarubanjiEntity> implements JiarubanjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiarubanjiEntity> page = this.selectPage(
                new Query<JiarubanjiEntity>(params).getPage(),
                new EntityWrapper<JiarubanjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiarubanjiEntity> wrapper) {
		  Page<JiarubanjiView> page =new Query<JiarubanjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiarubanjiVO> selectListVO(Wrapper<JiarubanjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiarubanjiVO selectVO(Wrapper<JiarubanjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiarubanjiView> selectListView(Wrapper<JiarubanjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiarubanjiView selectView(Wrapper<JiarubanjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
