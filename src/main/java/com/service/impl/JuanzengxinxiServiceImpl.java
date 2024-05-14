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


import com.dao.JuanzengxinxiDao;
import com.entity.JuanzengxinxiEntity;
import com.service.JuanzengxinxiService;
import com.entity.vo.JuanzengxinxiVO;
import com.entity.view.JuanzengxinxiView;

@Service("juanzengxinxiService")
public class JuanzengxinxiServiceImpl extends ServiceImpl<JuanzengxinxiDao, JuanzengxinxiEntity> implements JuanzengxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JuanzengxinxiEntity> page = this.selectPage(
                new Query<JuanzengxinxiEntity>(params).getPage(),
                new EntityWrapper<JuanzengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JuanzengxinxiEntity> wrapper) {
		  Page<JuanzengxinxiView> page =new Query<JuanzengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JuanzengxinxiVO> selectListVO(Wrapper<JuanzengxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JuanzengxinxiVO selectVO(Wrapper<JuanzengxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JuanzengxinxiView> selectListView(Wrapper<JuanzengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JuanzengxinxiView selectView(Wrapper<JuanzengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
