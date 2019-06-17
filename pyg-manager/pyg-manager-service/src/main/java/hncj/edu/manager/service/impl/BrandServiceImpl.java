package hncj.edu.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import hncj.edu.entity.PageResult;
import hncj.edu.manager.service.BrandService;
import hncj.edu.mapper.TbBrandMapper;
import hncj.edu.pojo.TbBrand;
import hncj.edu.pojo.TbBrandExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class BrandServiceImpl implements BrandService {

    @Autowired
    TbBrandMapper brandMapper;

    @Override
    public List<TbBrand> findAll() {
        List<TbBrand> brands = brandMapper.selectByExample(null);
        return brands;
    }

    @Override
    public PageResult findPage(Integer pageNum, Integer rows) {
        PageHelper.startPage(pageNum, rows);
        Page<TbBrand> page = (Page<TbBrand>) brandMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public void add(TbBrand brand) {
        brandMapper.insertSelective(brand);
    }

    @Override
    public TbBrand findOne(Long id) {
        TbBrand brand = brandMapper.selectByPrimaryKey(id);
        return brand;
    }

    @Override
    public void update(TbBrand tbBrand) {
        brandMapper.updateByPrimaryKey(tbBrand);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            brandMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(TbBrand brand, Integer pageNum, Integer rows) {
        PageHelper.startPage(pageNum, rows);
        TbBrandExample example = new TbBrandExample();
        TbBrandExample.Criteria criteria = example.createCriteria();
        if (brand != null) {
            if (brand.getName() != null && !"".equals(brand.getName())) {
                criteria.andNameLike("%" + brand.getName() + "%");
            }
            if (brand.getFirstChar() != null && !"".equals(brand.getFirstChar())) {
                criteria.andFirstCharLike("%" + brand.getFirstChar() + "%");
            }
        }
        Page<TbBrand> page = (Page<TbBrand>) brandMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public List<Map> selectOptionList() {
        return brandMapper.selectOptionList();
    }
}
